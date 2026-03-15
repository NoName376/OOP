package lab2.Problem4;

public class Parallel extends Circuit {
    public Parallel(Circuit a, Circuit b) {
        this.a = a;
        this.b = b;
    }


    @Override
    public double getResistance() {
        double r1 = a.getResistance();
        double r2 = b.getResistance();
        return (r1 * r2) / (r1 + r2);
    }

    @Override
    public double getPotentialDiff() {
        return a.getPotentialDiff();
    }

    @Override
    public void applyPotentialDiff(double v) {
        a.applyPotentialDiff(v);
        b.applyPotentialDiff(v);
    }
    

    private Circuit a;
    private Circuit b;
}