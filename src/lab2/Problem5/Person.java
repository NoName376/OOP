package lab2.Problem5;

public abstract class Person {
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public Animal getPet() { return pet; }

    public abstract String getOccupation();
    public abstract PetPolicy getPetPolicy();

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
    
    private String name;
    private int age;
    private Animal pet;
    private Animal storedPet;
}