package lab3.task1;

interface Movable {
	void move(int x, int y);
}

class Car implements Movable {
	@Override
	public void move(int x, int y) {
		System.out.println("The car is moving to the point " + x + ", " + y + " on four wheels.");
	}
}

class Person implements Movable {
	@Override
	public void move(int x, int y) {
		System.out.println("A person walks to the point " + x + ", " + y + " on foot.");	
	}
}
