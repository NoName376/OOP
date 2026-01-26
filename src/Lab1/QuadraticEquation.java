package Lab1;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a, b, c: ");
        
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant < 0) {
            System.out.println("Error: Has no real roots (D < 0).");
        } else {
            double sqrtD = Math.sqrt(discriminant);
            
            double x1 = (-b + sqrtD) / (2 * a);
            double x2 = (-b - sqrtD) / (2 * a);
            
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }
}
