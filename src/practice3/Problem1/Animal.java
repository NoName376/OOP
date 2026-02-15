package practice3.Problem1;

public class Animal 
{
	public Animal(String name)
	{
		this.name = name;
	}
	public Animal() 
	{
		this("unknow");
	}
	
	public void sayName() 
	{
		System.out.println(name);
	}
	
	
	public void setName(String value) { name = value; }
	public String getName() { return name; }
	protected String name;
}
