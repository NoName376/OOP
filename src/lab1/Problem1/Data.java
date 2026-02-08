package lab1.Problem1;

public class Data 
{
	public Data() 
	{
        this.sum = 0;
        this.count = 0;
        this.max = 0;
    }
	
    private double sum;
    private double max;
    private int count;

    public void addValue(double value) 
    {
        if (count == 0) 
        {
            max = value;
        } 
        else 
        {
            if (value > max) 
            {
                max = value;
            }
        }
        
        sum += value;
        count++;
    }

    public double getAverage() 
    {
        if (count == 0) 
        {
            return 0;
        }
        
        return sum / count;
    }

    public double getLargest() 
    {
        return max;
    }
}