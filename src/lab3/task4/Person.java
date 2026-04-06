package lab3.task4;


import java.util.Objects;

public class Person {
	public Person(String name) {
        this.name = name;
    }
	public Person() {
        this.name = "";
    }
	public Person(Person other) {
        this.name = other.name;
    }
	
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Person)) return false;
        Person other = (Person) obj;
        return Objects.equals(name, other.name);
    }
}
