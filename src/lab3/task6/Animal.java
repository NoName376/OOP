package lab3.task6;

public abstract class Animal implements Comparable<Animal>, Cloneable, Movable, SoundMaker {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract String getSound();

    @Override
    public void makeSound() {
        System.out.println(name + " makes a sound: " + getSound());
    }

    @Override
    public void move() {
        System.out.println(name + " is moving.");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Animal other) {
        return Integer.compare(this.age, other.age);
    }

    @Override
    public Animal clone() {
        try {
            return (Animal) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}