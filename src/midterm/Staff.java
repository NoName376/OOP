package midterm;

public class Staff extends Person {
	public Staff(String department, String name) {
		super(name);
		
		this.department = department;	
	}
	
	protected String department;
	
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDepartment() {
		return department;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", department = " + this.department;
	}
}
