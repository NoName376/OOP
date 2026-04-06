package lab3.task6;

import java.util.Vector;

public class PersonRegistry {
    private final Vector<Person> people = new Vector<>();

    public void addPerson(Person person) {
        if (!people.contains(person)) {
            people.add(person);
        }
    }

    public void removePerson(Person person) {
        people.remove(person);
    }

    public Vector<Person> getPeopleWithPets() {
        Vector<Person> result = new Vector<>();
        for (Person p : people) {
            if (p.hasPet()) {
                result.add(p);
            }
        }
        return result;
    }

    public Vector<Person> getPeopleWithoutPets() {
        Vector<Person> result = new Vector<>();
        for (Person p : people) {
            if (!p.hasPet()) {
                result.add(p);
            }
        }
        return result;
    }

    public Vector<Person> getAllPeople() {
        return new Vector<>(people);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PersonRegistry:\n");
        for (Person p : people) {
            sb.append("  ").append(p).append("\n");
        }
        return sb.toString();
    }
}