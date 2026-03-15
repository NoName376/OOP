package lab2.Problem5;

public abstract class Animal {
	public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
	
	public abstract String getSound();

	public String getName() { return name; }
    public int getAge() { return age; }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{name='" + name + "', age=" + age + ", sound='" + getSound() + "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return age == animal.age && name.equals(animal.name);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, age);
    }
    
    private String name;
    private int age;
}