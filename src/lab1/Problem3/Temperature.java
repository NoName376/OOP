package lab1.Problem3;

public class Temperature 
{
    private double value;
    private char scale;

    public Temperature(double value, char scale) 
    {
        this.value = value;
        
        if (scale == 'C' || scale == 'F') 
        {
            this.scale = scale;
        } 
        else 
        {
            System.out.println("Error: Invalid scale " + scale);      
        }
    }

    public Temperature() 
    {
        this(0, 'C');
    }

    public Temperature(double value) 
    {
        this(value, 'C');
    }

    public Temperature(char scale) 
    {
        this(0, scale);
    }

    public double getDegreesC() 
    {
        if (scale == 'C') 
        {
            return value;
        } 
        else 
        {
            return 5 * (value - 32) / 9;
        }
    }

    public double getDegreesF() 
    {
        if (scale == 'F') 
        {
            return value;
        } 
        else 
        {
            return (9 * (value / 5)) + 32;
        }
    }


    public void setValue(double value) 
    {
        this.value = value;
    }

    public void setScale(char scale) 
    {
        if (scale == 'C') 
        {
        		this.value = getDegreesC();
        		this.scale = scale;
        }
        else if (scale == 'F')
        {
        		this.value = getDegreesF();
        		this.scale = scale;
        }
        else 
        {
            System.out.println("Error: Invalid scale " + scale);
        }
    }

    public void setValueAndScale(double value, char scale) 
    {
    		setScale(scale);
        setValue(value);
    }

    public char getScale() 
    {
        return scale;
    }

    
    public static void main(String[] args) {
        Temperature t1 = new Temperature(100, 'C');
        System.out.println("T1: " + t1.getDegreesC() + "C");

        Temperature t2 = new Temperature(50, 'F'); 
        System.out.println("T2 Scale is: " + t2.getScale());

        t1.setScale('Z'); 
    }
}