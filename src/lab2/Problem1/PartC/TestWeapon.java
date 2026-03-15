package lab2.Problem1.PartC;

public class TestWeapon {
    public static void main(String[] args) {
        Sword katana1 = new Sword("Katana", 45, 75.5);
        Sword katana2 = new Sword("Katana", 45, 75.5);

        System.out.println(katana1);
        
        System.out.println("HashCode check: " + katana1.hashCode() + " - "  + katana2.hashCode());
        System.out.println("Equals check: " + katana1.equals(katana2));
    }
}