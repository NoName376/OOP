package lab3.task6;

public class Bird extends Animal {
	public Bird(String name, int age) { 
		super(name, age); 
	}

	@Override
 	public String getSound() { return "Tweet"; }
}