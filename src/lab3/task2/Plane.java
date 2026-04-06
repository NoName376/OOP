package lab3.task2;

public class Plane implements Flyable {
    public Plane(double speed) {
    		this.speed = speed;
    }
    
    protected double speed;

   
    @Override
    public void fly() {
        System.out.println("Plane fly with speed = " + speed);
    }

    @Override
    public void move() {
    		System.out.println("Plane move with speed = " + speed);
    }
}
