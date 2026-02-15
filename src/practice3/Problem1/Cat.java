package practice3.Problem1;

public class Cat extends Animal
{
	public Cat(String name, String color) 
	{
		super(name);
		
		this.color = color;
	}
	public Cat() 
	{
		super();
		this.color = "Black";
	}
	
	@Override
    public void sayName() 
    {
        System.out.println("Meow! my name is: "  + name);
    }

    public void sayName(Language langCode) 
    {
        if (langCode == Language.En) 
        {
        		System.out.println("Meow! my name is: "  + name);
        }
        else if (langCode == Language.Ru) 
        {
        		System.out.println("Мяу! меня зовут: "  + name);
        }
        else 
        {
        		System.out.println("ERRROOROROROROR unsupported langCode: " + langCode);
        }
    }
	
	
	public void setColor(String value) { color = value; }
	public String getColor() { return color; }
	private String color;
}
