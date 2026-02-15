package lab1.Problem4;

import practice2.Student;
import java.util.Scanner;

public class GradeBookTest 
{
    public static void main(String[] args) 
    {
        Course course = new Course("CS101", "Object-oriented Programming and Design", 5, null);
         
        GradeBook book = new GradeBook(course);
             
        Student[] studentsGroup = 
        	{
        		new Student("Student A", "1"),
            new Student("Student B", "2"),
            new Student("Student C", "3"),
            new Student("Student D", "4"), 
            new Student("Student E", "5")
        };

        Scanner scanner = new Scanner(System.in);
        
        book.displayMessage();
        System.out.println("Please, input grades for students:");

        for (Student s : studentsGroup) 
        {
        	    int grade;
            do 
            {
                System.out.print(s.getName() + ": ");
               
                while (!scanner.hasNextInt()) 
                {
                    System.out.println("That's not a number! Try again.");
                    System.out.print(s.getName() + ": ");
                    scanner.next(); 
                }
                
                grade = scanner.nextInt();
            } while (!book.tryAddStudent(s, grade));
        }

        System.out.println();
        book.displayGradeReport();
        
        scanner.close();
    }
}