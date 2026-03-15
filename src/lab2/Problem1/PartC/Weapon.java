package lab2.Problem1.PartC;

public class Weapon {
    public Weapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }


    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public int getDamage() { return damage; }
    public void setDamage(int damage) { this.damage = damage; }
    
    protected String name;
    protected int damage;

    @Override
    public String toString() { return "Weapon{name= " + name + ", damage=" + damage + "}"; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Weapon)) return false;
        Weapon weapon = (Weapon) o;
        return name.equals(weapon.name);
    }

    @Override
    public int hashCode() { return name.hashCode(); }
}