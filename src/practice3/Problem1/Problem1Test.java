package practice3.Problem1;

public class Problem1Test 
{
	public static void main(String[] args) 
	{
        var defaultCat = new Cat();
        System.out.println("Color: " + defaultCat.getColor());
        defaultCat.sayName(); 
        System.out.println();
        
        var myCat = new Cat("Helicopter669", "Green");
        System.out.println("Color: " + myCat.getColor());        
        //Overriding
        myCat.sayName(); 
        System.out.println();
        
        //Overloading
        myCat.sayName(Language.Ru);
        myCat.sayName(Language.En);
        myCat.sayName(Language.De);
        System.out.println();
        
        var animal = new Animal();
        animal.sayName();
    }
}
