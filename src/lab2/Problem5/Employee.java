package lab2.Problem5;

public class Employee extends Person {
	public Employee(String name, int age, String position) {
        super(name, age);
        this.position = position;
    }
	
    private String position;
    private final PetPolicy petPolicy = new DefaultPetPolicy();

    public String getPosition() { return position; }

    @Override
    public String getOccupation() { return "Employee, position: " + position; }

    @Override
    public PetPolicy getPetPolicy() { return petPolicy; }
}