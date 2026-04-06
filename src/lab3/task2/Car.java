package lab3.task2;

public class Car implements Movable {
	public Car(double speed) {
        this.speed = speed;
    }
	
	private double speed;

    @Override
    public void move() {
        System.out.println("Car move with speed = " + speed);
    }
}
