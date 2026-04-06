package lab3.task6;

public interface PetPolicy {
	boolean canAcceptPet(Animal pet);
	String getPolicyDescription();
}