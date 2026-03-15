package lab2.Problem5;

public interface PetPolicy {
	boolean canAcceptPet(Animal pet);
	String getPolicyDescription();
}