package lab2.Problem1.PartA;

public class Sphere extends Shape3D {
	public Sphere(double radius) {
        this.radius = radius;
    }
	
	private double radius;

    @Override
    public double volume() {
        return (4.0/3.0) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public double surfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
}