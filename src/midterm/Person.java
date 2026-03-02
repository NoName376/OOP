package midterm;

public class Person 
{
	public Person(String name) {
		this.name = name;
	}
	
	protected String name;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	@Override
	public String toString() {
		return "Person with name: " + this.name;
	}
}
