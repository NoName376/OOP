package lab3.task4;

import java.util.*;

public class Employee extends Person implements Comparable<Employee>, Cloneable {
	public Employee() {
        super();
        this.annualSalary = 0.0;
        this.hireDate = new Date();
        this.insuranceNumber = "";
    }
	
	public Employee(String name, double annualSalary, Date hireDate, String insuranceNumber) {
        super(name);
        this.annualSalary = annualSalary;
        this.hireDate = new Date(hireDate.getTime());
        this.insuranceNumber = insuranceNumber;
    }
	
	public Employee(Employee other) {
        super(other.getName());
        this.annualSalary = other.annualSalary;
        this.hireDate = new Date(other.hireDate.getTime());
        this.insuranceNumber = other.insuranceNumber;
    }
	
	private double annualSalary;
    private Date hireDate;
    private String insuranceNumber;
    
    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public Date getHireDate() {
        return new Date(hireDate.getTime());
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = new Date(hireDate.getTime());
    }

    public String getInsuranceNumber() {
        return insuranceNumber;
    }

    public void setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }

    @Override
    public String toString() {
        return "Employee{name='" + getName() + '\'' +
                ", annualSalary=" + annualSalary +
                ", hireDate=" + hireDate +
                ", insuranceNumber='" + insuranceNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Employee)) return false;
        if (!super.equals(obj)) return false;

        Employee other = (Employee) obj;
        return Double.compare(annualSalary, other.annualSalary) == 0 &&
                Objects.equals(hireDate, other.hireDate) &&
                Objects.equals(insuranceNumber, other.insuranceNumber);
    }

    @Override
    public int compareTo(Employee other) {
        return Double.compare(this.annualSalary, other.annualSalary);
    }

    @Override
    public Employee clone() {
        try {
            Employee cloned = (Employee) super.clone();
            cloned.hireDate = new Date(this.hireDate.getTime());
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("Cloning failed");
        }
    }
}
