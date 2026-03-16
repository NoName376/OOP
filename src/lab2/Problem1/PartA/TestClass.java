package lab2.Problem1.PartA;

public class TestClass {
    public static void main(String[] args) {
        var shapes = new Shape3D[3];

        shapes[0] = new Cylinder(3.0, 5.0);
        shapes[1] = new Sphere(4.0);
        shapes[2] = new Cube(2.5);
        
        for (var shape : shapes) {
            System.out.println(shape.toString());
        }
    }
}