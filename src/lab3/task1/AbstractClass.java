package lab3.task1;

abstract class Enemy {
	public Enemy(String name, int health) {
        this.name = name;
        this.health = health;
    }
	
    protected int health;
    protected String name;

    
    public void takeDamage(int damage) {
        this.health -= damage;
        System.out.println(name + " take damage. HP: " + health);
    }

    public abstract void attack();
}

class Zombie extends Enemy {
    public Zombie() {
        super("Zombie", 50);
    }

    @Override
    public void attack() {
        System.out.println("Zombie attach player");
    }
}

class Archer extends Enemy {
    public Archer() {
        super("Archer", 30);
    }

    @Override
    public void attack() {
        System.out.println("The archer releases an arrow!");
    }
}
