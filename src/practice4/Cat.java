package practice4;

public class Cat extends Animal implements CanHavePizza {
	public Cat(String name) {
        super(name, "Cat");
        this.isHungry = true;
    }
    
    @Override
    public void receivePizza(String pizzaType) {
        System.out.println(name + " the cat sniffs the " + pizzaType);
        isHungry = false;
    }

    @Override
    public String getName() { return name; }

    public boolean isHungry() { return isHungry; }

	private boolean isHungry;
}
