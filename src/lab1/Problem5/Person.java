package lab1.Problem5;

public class Person 
{
	public Person(Gender gender, String name) 
	{
		this.gender = gender;
		this.name = name;
	}
	
    private Gender gender;
    private String name;

    public Gender getGender() 
    {
        return gender;
    }

    @Override
    public String toString() 
    {
        return name + " (" + gender + ")";
    }
}