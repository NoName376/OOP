package lab2.Problem1.PartA;

public class Cylinder extends Shape3D {
	public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
	
	private double radius;
    private double height;

    @Override
    public double volume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    @Override
    public double surfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }
}