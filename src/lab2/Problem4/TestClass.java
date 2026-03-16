package lab2.Problem4;

public class TestClass {
    public static void main(String[] args) {
    		Circuit r1 = new Resistor(4);
    		Circuit r2 = new Resistor(3);
    		Circuit r3 = new Resistor(5);
    		Circuit r4 = new Resistor(7);


    		
    		Circuit r12 = new Parallel(r1, r2);
    		
    		Circuit r312 = new Series(r3, r12);
    		
    		Circuit total = new Parallel(r312, r4);
    		
    	
    		double R = total.getResistance();
    		
    		System.out.println("Resistance = " + R);
    }
}
