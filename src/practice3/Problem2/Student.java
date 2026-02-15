package practice3.Problem2;

public class Student extends Person 
{
    public Student(String name, String address, String program, int year, double fee) 
    {
        super(name, address);
        
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    @Override
    public String toString() 
    {
        return "Student[" + super.toString() + ",program=" + program + ",year=" + year + ",fee=" + fee + "]";
    }

    public void setProgram(String program) { this.program = program; }
    public String getProgram() { return program; }
    private String program;

    public void setYear(int year) { this.year = year; }
    public int getYear() { return year; }
    private int year;

    public void setFee(double fee) { this.fee = fee; }
    public double getFee() { return fee; }
    private double fee;
}