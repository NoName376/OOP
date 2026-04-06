package lab3.task6;

public abstract class Person implements Comparable<Person>, Cloneable, Movable, SoundMaker {
    private String name;
    private int age;
    private Animal pet;
    private Animal storedPet;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public Animal getPet() { return pet; }

    public abstract String getOccupation();
    public abstract PetPolicy getPetPolicy();

    @Override
    public void makeSound() {
        System.out.println(name + " says: Hello!");
    }

    @Override
    public void move() {
        System.out.println(name + " is walking.");
    }

    @Override
    public int compareTo(Person other) {
        if (this.age != other.age) {
            return Integer.compare(this.age, other.age);
        }
        return this.name.compareTo(other.name);
    }

    @Override
    public Person clone() {
        try {
            Person cloned = (Person) super.clone();
            if (this.pet != null) {
                cloned.pet = this.pet.clone();
            }
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public void assignPet(Animal pet) {
        if (!getPetPolicy().canAcceptPet(pet)) {
            throw new IllegalArgumentException(
                getName() + " cannot have this pet. Policy: " + getPetPolicy().getPolicyDescription()
            );
        }
        this.pet = pet;
    }

    public Animal removePet() {
        Animal removed = this.pet;
        this.pet = null;
        return removed;
    }

    public boolean hasPet() { return pet != null; }

    public void leavePetWith(Person caretaker) {
        if (!hasPet()) {
            throw new IllegalStateException(getName() + " does not have a pet to leave.");
        }
        if (!caretaker.getPetPolicy().canAcceptPet(this.pet)) {
            throw new IllegalArgumentException(
                caretaker.getName() + " cannot take care of this pet. Policy: " + caretaker.getPetPolicy().getPolicyDescription()
            );
        }
        if (caretaker.hasPet()) {
            throw new IllegalStateException(caretaker.getName() + " already has a pet.");
        }
        storedPet = this.pet;
        caretaker.assignPet(removePet());
    }

    public void retrievePetFrom(Person caretaker) {
        if (storedPet == null) {
            throw new IllegalStateException(getName() + " has no pet stored away.");
        }
        if (!caretaker.hasPet() || !caretaker.getPet().equals(storedPet)) {
            throw new IllegalStateException(caretaker.getName() + " does not have " + getName() + "'s pet.");
        }
        caretaker.removePet();
        assignPet(storedPet);
        storedPet = null;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{name='" + name + "', age=" + age +
               ", occupation='" + getOccupation() + "', pet=" + (pet != null ? pet : "none") + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age == person.age && name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, age);
    }
}