package lab2.Problem1.PartC;


public class Sword extends Weapon {
    public Sword(String name, int damage, double length) {
        super(name, damage);
        this.length = length;
    }

    private double length;

    public double getLength() { return length; }
    public void setLength(double length) { this.length = length; }

    @Override
    public String toString() { return super.toString() + " [Sword: length=" + length + "]"; }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        Sword sword = (Sword) o;
        return super.equals(sword) && sword.length ==  length;
    }

    @Override
    public int hashCode() { return super.hashCode() + (int)length; }
}