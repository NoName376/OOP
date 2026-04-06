package lab3.task6;

public class DefaultPetPolicy implements PetPolicy {
	@Override
 	public boolean canAcceptPet(Animal pet) { return true; }

	@Override
	public String getPolicyDescription() { return "No pet restrictions"; }
}