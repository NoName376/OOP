package lab2.Problem5;

public class PhDStudentPetPolicy implements PetPolicy {
	@Override
	public boolean canAcceptPet(Animal pet) {
		return !(pet instanceof Cat);
	}

	@Override
	public String getPolicyDescription() { return "Cannot have dogs"; }
}