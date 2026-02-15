package practice3.Problem2;

import java.util.Scanner;
import java.util.HashSet;

public class TestClass 
{
    public static void main(String[] args) 
    {
        var users = new HashSet<Person>();
        var sc = new Scanner(System.in);

        while (true) 
        {
            System.out.println("1. Add Person | 2. Add Student | 3. Add Staff | 4. Print All | 5. Exit");
            
            int choice;
            try 
            {
                choice = Integer.parseInt(sc.nextLine());
            } 
            catch (Exception e) 
            {
                System.out.println("Error: Please enter a number!");
                continue;
            }
            
            if (choice < 1 || choice > 5) 
            {
                System.out.println("Error: Unsupported number (1-5 only)!");
                continue;
            }

            if (choice == 5) 
            {
                break;
            }
            
            if (choice == 4) 
            {
                for (var p : users) 
                {
                    System.out.println(p);
                }
                continue;
            }

            System.out.print("Name: "); 
            String name = sc.nextLine();
            
            System.out.print("Address: "); 
            String addr = sc.nextLine();

            boolean added = false;
            try 
            {
                if (choice == 3) 
                {
                    System.out.print("School: "); 
                    String school = sc.nextLine();
                    
                    System.out.print("Pay: "); 
                    double pay = Double.parseDouble(sc.nextLine());
                    
                    added = users.add(new Staff(name, addr, school, pay));   
                } 
                else if (choice == 2) 
                {
                    System.out.print("Program: "); 
                    String prog = sc.nextLine();
                    
                    System.out.print("Year: "); 
                    int yr = Integer.parseInt(sc.nextLine());
                    
                    System.out.print("Fee: "); 
                    double fee = Double.parseDouble(sc.nextLine());
                    
                    added = users.add(new Student(name, addr, prog, yr, fee));
                } 
                else if (choice == 1) 
                {
                    added = users.add(new Person(name, addr));
                }
            } 
            catch (Exception e) 
            {
                System.out.println("Error: Invalid input. Please enter a number!");
                continue;
            }

            if (!added) 
            {
                System.out.println("Error: This user already exists in the hashSet!");
            }
        }
    }
}