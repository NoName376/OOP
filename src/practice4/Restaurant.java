package practice4;

import java.util.Vector;

public class Restaurant {
    public Restaurant(String name, Iterable<String> menu) {
        this.name = name;
        this.menu = new Vector<>();

        for (var m: menu) {
        		this.menu.add(m);
        }
    }

    public void servePizza(CanHavePizza recipient, String pizzaType) {
        System.out.println("\n[Restaurant: " + name + "] Serving " + pizzaType
                + " pizza to " + recipient.getName() + "...");
        
        recipient.receivePizza(pizzaType);
    }

    public void servePizza(CanHavePizza recipient) {
        String randomPizza = menu.get((int)(Math.random() * menu.size()));
        
        servePizza(recipient, randomPizza);
    }

    public Iterable<String> getMenu() { return menu; }
    public String getName() { return name; }

    private String name;
    private Vector<String> menu;
}