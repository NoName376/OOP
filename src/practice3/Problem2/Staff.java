package practice3.Problem2;

public class Staff extends Person 
{
    public Staff(String name, String address, String school, double pay) 
    {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    @Override
    public String toString() 
    {
        return "Staff[" + super.toString() + ",school=" + school + ",pay=" + pay + "]";
    }

    public void setSchool(String school) { this.school = school; }
    public String getSchool() { return school; }
    private String school;

    public void setPay(double pay) { this.pay = pay; }
    public double getPay() { return pay; }
    private double pay;
}