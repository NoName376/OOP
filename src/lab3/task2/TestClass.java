package lab3.task2;

public class TestClass {
    public static void main(String[] args) {
        Car car = new Car(90);
        car.move();
        
        Plane plane = new Plane(800);
        plane.move();
        plane.fly();
    }
}
