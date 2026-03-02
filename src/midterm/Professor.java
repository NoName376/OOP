package midterm;

public class Professor extends Staff {
	public Professor(int rank, String department, String name) {
		super(department, name);
		
		this.rank = rank;
	}
	
	private int rank;
	
	@Override
	public String toString() {
		return super.toString() + ", rank: " + rank;
	}
}
