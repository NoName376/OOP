package lab2.Problem1.PartA;

public abstract class Shape3D {
    public abstract double volume();
    public abstract double surfaceArea();
    
    @Override
    public String toString() {
        return "Volume: " + volume() + "   " + "Surface area: " + surfaceArea();
    }
}