package lab2.Problem5;

public class Student extends Person {
	public Student(String name, int age, String major) {
		super(name, age);
	    this.major = major;
	}
	
    private String major;
    private final PetPolicy petPolicy = new DefaultPetPolicy();

   
    public String getMajor() { return major; }

    @Override
    public String getOccupation() { return "Student, major: " + major; }

    @Override
    public PetPolicy getPetPolicy() { return petPolicy; }
}