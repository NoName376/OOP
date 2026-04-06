package lab3.task4;

import java.util.*;

public class Manager extends Employee implements Cloneable {
    private Vector<Employee> team;
    private double bonus;

    public Manager() {
        super();
        this.team = new Vector<>();
        this.bonus = 0.0;
    }

    public Manager(String name, double annualSalary, java.util.Date hireDate,
                   String insuranceNumber, double bonus) {
        super(name, annualSalary, hireDate, insuranceNumber);
        this.team = new Vector<>();
        this.bonus = bonus;
    }

    public Manager(String name, double annualSalary, java.util.Date hireDate,
                   String insuranceNumber, double bonus, Vector<Employee> team) {
        super(name, annualSalary, hireDate, insuranceNumber);
        this.bonus = bonus;
        this.team = new Vector<>(team);
    }

    public Manager(Manager other) {
        super(other);
        this.bonus = other.bonus;
        this.team = new Vector<>();
        for (Employee e : other.team) {
            this.team.add(e.clone());
        }
    }

    public Vector<Employee> getTeam() {
        return new Vector<>(team);
    }

    public void setTeam(Vector<Employee> team) {
        this.team = new Vector<>(team);
    }

    public void addEmployeeToTeam(Employee employee) {
        team.add(employee);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getTotalCompensation() {
        return getAnnualSalary() + bonus;
    }

    @Override
    public String toString() {
        return "Manager{name='" + getName() + '\'' +
                ", annualSalary=" + getAnnualSalary() +
                ", hireDate=" + getHireDate() +
                ", insuranceNumber='" + getInsuranceNumber() + '\'' +
                ", bonus=" + bonus +
                ", teamSize=" + team.size() +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Manager)) return false;
        if (!super.equals(obj)) return false;

        Manager other = (Manager) obj;
        return Double.compare(bonus, other.bonus) == 0 &&
                Objects.equals(team, other.team);
    }

    @Override
    public int compareTo(Employee other) {
        int salaryCompare = Double.compare(this.getAnnualSalary(), other.getAnnualSalary());
        if (salaryCompare != 0) {
            return salaryCompare;
        }

        if (other instanceof Manager) {
            Manager otherManager = (Manager) other;
            return Double.compare(this.bonus, otherManager.bonus);
        }

        return 0;
    }

    @Override
    public Manager clone() {
        Manager cloned = (Manager) super.clone();
        cloned.team = new Vector<>();
        for (Employee e : this.team) {
            cloned.team.add(e.clone());
        }
        return cloned;
    }
}