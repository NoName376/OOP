package practice4;

public class Student extends Person implements CanHavePizza {
	public Student(String name, int age, String university) {
        super(name, age);
        this.university = university;
        this.slicesEaten = 0;
    }
	
	private String university;
    private int slicesEaten;

    @Override
    public void receivePizza(String pizzaType) {
        slicesEaten++;
        System.out.println(name + " from " + university
                + " eat the " + pizzaType + " pizza. "
                + "Slices eaten today: " + slicesEaten);
    }

    @Override
    public String getName() { return name; }

    public String getUniversity() { return university; }
    public int getSlicesEaten() { return slicesEaten; }
}
