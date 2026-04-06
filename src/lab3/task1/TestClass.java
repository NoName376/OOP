package lab3.task1;

public class TestClass {
	public static void main(String[] args) {
		Enemy enemy1 = new Archer();
		Enemy enemy2 = new Zombie();
		
		Movable[] movables = new Movable[] { 
			    new Person(), 
			    new Car() 
		};
		
		enemy1.attack();
		enemy2.attack();
		
		for (var item : movables) 
			item.move(2, 2);
	}
}
