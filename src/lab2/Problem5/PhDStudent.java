package lab2.Problem5;

public class PhDStudent extends Person {
	public PhDStudent(String name, int age, String major, String researchTopic) {
        super(name, age);
        this.major = major;
        this.researchTopic = researchTopic;
    }
	
	private String major;
    private String researchTopic;
    private final PetPolicy petPolicy = new PhDStudentPetPolicy();

    public String getMajor() { return major; }
    public String getResearchTopic() { return researchTopic; }

    @Override
    public String getOccupation() { return "PhD Student, major: " + major + ", research: " + researchTopic; }

    @Override
    public PetPolicy getPetPolicy() { return petPolicy; }
}
