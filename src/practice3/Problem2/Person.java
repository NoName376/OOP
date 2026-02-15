package practice3.Problem2;

public class Person 
{	
    public Person(String name, String address) 
    {
        this.name = name;
        this.address = address;
    }
	
    @Override
    public String toString() 
    {
        return "Person[name=" + name + ",address=" + address + "]";
    }

    @Override
    public boolean equals(Object obj) 
    {   
    		if (obj != null && obj instanceof Person person) 
    		{     
    			if(name == null && address == null) return true;
    			if(name == null || address == null) return false;
    			
    	        return name.equals(person.name) 
    	        		&& address.equals(person.address);
    		}
    		else
    		{
    			return false;
    		}
    }

    @Override
    public int hashCode() 
    {
    		if (name == null || address == null) return 0;
    	
        return name.hashCode() + address.hashCode();
    }
    
    public void setAddress(String address) { this.address = address; }
    public String getAddress() { return address; }
    private String address;

    public String getName() { return name; }
    private String name;
}