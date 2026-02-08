package lab1.Problem2;

public class IPhone 
{
    public enum State 
    {
        OFF, LOCKED, UNLOCKED 
    }

    public static final String BRAND = "Apple";
    public static final String OS_NAME = "iOS";
    
    private static int totalIPhonesProduced = 0;
    private static String latestIOSVersion = "26.2.1";
    
    private final long imei;

    private String model;
    private int memoryGb;
    
    private State currentState;


    {
        System.out.println("Assembling new IPhone unit...");
        this.currentState = State.OFF;
    }

    
    public IPhone(String model, int memoryGb, long imei) 
    {
        this.model = model;
        this.memoryGb = memoryGb;
        this.imei = imei;
        
        totalIPhonesProduced++;
    }

    public IPhone(String model, int memoryGb) 
    {
        
        this(model, memoryGb, System.nanoTime());
    }

    
    public void unlock(String touchHash) 
    {
    	if(touchHash.equals("dsgbq3y8o4f9mu023ip"))
    	{
    		this.currentState = State.UNLOCKED;
            System.out.println("TouchID recognized owner.");
    	}
    	else
    	{
    		System.out.println("Wrong Passcode. Try again in 1 minute.");
            this.currentState = State.LOCKED;
    	}
    }

    public void unlock(int password) 
    {
        if (password == 1234) 
        { 
            this.currentState = State.UNLOCKED;
            System.out.println("Passcode correct. Unlocked.");
        } 
        else 
        {
            System.out.println("Wrong Passcode. Try again in 1 minute.");
            this.currentState = State.LOCKED;
        }
    }
    
    public long getImei() { return imei; }
    public State getCurrentState() { return currentState; }
    
 
    public static int getTotalIPhonesProduced() { return totalIPhonesProduced; }
    public static String getLatestIOSVersion() { return latestIOSVersion; }

    @Override
    public String toString() 
    {
        return "iPhone " + model + " (" + memoryGb + "GB) (IMEI: " + imei + ")"; 
    }

    
    public static void main(String[] args) 
    {

        IPhone newPhone = new IPhone("15 Pro", 512); 
        IPhone oldPhone = new IPhone("14 Plus", 256, 999888777L);

        System.out.println("\n");
        
        newPhone.unlock("dsgbq3y8o4f9mu023ip"); 
        oldPhone.unlock(1234);
        
        System.out.println("\n");
        
        System.out.println("Total iPhones created: " + IPhone.getTotalIPhonesProduced()); // Будет 2
        System.out.println("Creator: " + IPhone.BRAND);
    }
}