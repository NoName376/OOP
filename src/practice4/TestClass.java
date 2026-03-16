package practice4;

import java.util.Vector;

public class TestClass {
    public static void main(String[] args) {
    		Vector<String> menu = new Vector<>();
    		menu.add("Margherita");
    		menu.add("Pepperoni");
    		menu.add("Square pizza");
    		menu.add("Hawaiian");
    	
        var restaurant = new Restaurant("GogoPizza",menu);

        var meow = new Cat("Meow");
        var meeeeeeeow = new Cat("Meeeeeeeow");

        var aaaa = new Student("AAAA", 20, "MIT");
        var someone = new Student("Someone", 22, "KBTU");

        System.out.println("Welcome to " + restaurant.getName() + "\n");

        restaurant.servePizza(aaaa, "Margherita");
        restaurant.servePizza(someone, "Pepperoni");
        restaurant.servePizza(meow, "Square pizza");
        restaurant.servePizza(meeeeeeeow);

        restaurant.servePizza(aaaa, "Hawaiian");

        System.out.println("\n");
        System.out.println(aaaa.getName() + " ate " + aaaa.getSlicesEaten() + " slice(s).");
        System.out.println(someone.getName() + " ate " + someone.getSlicesEaten() + " slice(s).");
        System.out.println(meow.getName() + " is hungry: " + meow.isHungry());
    }
}