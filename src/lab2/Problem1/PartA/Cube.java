package lab2.Problem1.PartA;

public class Cube extends Shape3D {
	public Cube(double side) {
        this.side = side;
    }
	
	private double side;

    @Override
    public double volume() {
        return Math.pow(side, 3);
    }

    @Override
    public double surfaceArea() {
        return 6 * Math.pow(side, 2);
    }
}