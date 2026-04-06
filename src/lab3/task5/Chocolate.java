package lab3.task5;

public class Chocolate implements Comparable<Chocolate> {
    private double weight;
    private String name;

    public Chocolate() {
        this.weight = 0;
        this.name = "";
    }

    public Chocolate(double weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Chocolate other) {
        return Double.compare(this.weight, other.weight);
    }

    @Override
    public String toString() {
        return "Chocolate{name='" + name + "', weight=" + weight + "}";
    }
}
