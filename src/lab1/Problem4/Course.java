package lab1.Problem4;

public class Course 
{
	public Course(String name, String description, int credits, Course prerequisite) 
    {
        this.name = name;
        this.description = description;
        this.credits = credits;
        this.prerequisite = prerequisite;
    }
	
    private String name;
    private String description;
    private int credits;
    private Course prerequisite;

    @Override
    public String toString() 
    {
        return name + ": " + description;
    }
}