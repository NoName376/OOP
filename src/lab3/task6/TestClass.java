package lab3.task6;

import java.util.Collections;
import java.util.Vector;

public class TestClass {
    public static void main(String[] args) {
        Person john = new Employee("Franz", 30, "Engineer");
        Person alice = new PhDStudent("Kafka", 26, "Comp. Science", "AI");
        Animal murka = new Cat("Murka", 5);

        john.assignPet(murka);

        PersonRegistry registry = new PersonRegistry();
        registry.addPerson(john);
        registry.addPerson(alice);

        System.out.println("Testing Movable and SoundMaker:");
        john.move();
        john.makeSound();
        murka.move();
        murka.makeSound();

        System.out.println("\nTesting Comparable (Sorting people by age):");
        Vector<Person> list = registry.getAllPeople();
        Collections.sort(list);
        for (Person p : list) {
            System.out.println(p.getName() + ": " + p.getAge());
        }

        System.out.println("\nTesting Cloneable (Deep copy of person with pet):");
        Person johnClone = john.clone();
        System.out.println("Original John: " + john);
        System.out.println("Cloned John: " + johnClone);
        System.out.println("Are pets same object? " + (john.getPet() == johnClone.getPet()));

        System.out.println("\nOriginal Workflow Tests:");
        john.leavePetWith(alice);
        System.out.println("During vacation (Alice has Murka):");
        System.out.println(registry);
        john.retrievePetFrom(alice);
        System.out.println("After vacation (John has Murka back):");
        System.out.println(registry);

        System.out.println("Testing PhD restriction:");
        try {
            Animal rex = new Dog("Rex", 3);
            alice.assignPet(rex);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}
