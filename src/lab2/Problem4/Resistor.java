package lab2.Problem4;

public class Resistor extends Circuit {
    public Resistor(double resistance) {
        this.resistance = resistance;
    }

    private double resistance;
    private double potentialDiff;

    @Override
    public double getResistance() { return resistance; }
    public void setResistance(double resistance) { this.resistance = resistance; }


    @Override
    public double getPotentialDiff() { return potentialDiff; }

    @Override
    public void applyPotentialDiff(double v) { this.potentialDiff = v; }

}