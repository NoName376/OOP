package lab2.Problem5;

public class TestClass {
    public static void main(String[] args) {
        Person john = new Employee("Franz", 30, "Engineer");
        Person alice = new PhDStudent("Kafka", 26, "Comp. Science", "AI");
        Animal murka = new Cat("Murka", 5);

        john.assignPet(murka);

        PersonRegistry registry = new PersonRegistry();
        registry.addPerson(john);
        registry.addPerson(alice);

        System.out.println("Before vacation:");
        System.out.println(registry);

        john.leavePetWith(alice);

        System.out.println("During vacation (Alice has Murka):");
        System.out.println(registry);

        john.retrievePetFrom(alice);

        System.out.println("After vacation (John has Murka back):");
        System.out.println(registry);

        System.out.println("Testing PhD restriction");
        try {
            Animal rex = new Dog("Rex", 3);
            alice.assignPet(rex);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}
