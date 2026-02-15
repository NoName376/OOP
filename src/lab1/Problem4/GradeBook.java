package lab1.Problem4;

import practice2.Student;
import java.util.ArrayList;

public class GradeBook 
{
    private Course course;
    private ArrayList<Student> students;
    private ArrayList<Integer> grades; 

    public GradeBook(Course course) 
    {
        this.course = course;
        this.students = new ArrayList<>();
        this.grades = new ArrayList<>();
    }

    public boolean tryAddStudent(Student s, int grade) 
    {
        if (s != null && grade >= 0 && grade <= 100) 
        {
        		students.add(s);
            grades.add(grade);
            
            return true;
        }
        else 
        {
        		System.out.println("Invalid arguments. Grade must been in range [0; 100]");
        		return false;
        }
    }

    public void displayMessage() 
    {
        System.out.println("Welcome to the grade book for " + course.toString() + "!");
    }

    public void displayGradeReport() 
    {
        if (students.isEmpty()) 
        {
            System.out.println("No students registered.");
            return;
        }

        determineClassAverage();
        System.out.println();
        outputBarChart();
    }

    private void determineClassAverage() 
    {
        int total = 0;
        int minGrade = Integer.MAX_VALUE;
        int maxGrade = Integer.MIN_VALUE;
        
        Student minStudent = null;
        Student maxStudent = null;

        for (int i = 0; i < students.size(); i++) 
        {
            int g = grades.get(i);
            Student s = students.get(i);

            total += g;

            if (g < minGrade) 
            {
                minGrade = g;
                minStudent = s;
            }
            
            if (g > maxGrade) 
            {
                maxGrade = g;
                maxStudent = s;
            }
        }

        double average = (double) total / students.size();
        double roundedAverage = Math.round(average * 100.0) / 100.0;

        System.out.println("Class average is " + roundedAverage + ". Lowest grade is " + minGrade + 
                " (" + minStudent.getName() + "). Highest grade is " + maxGrade + " (" + maxStudent.getName() + ").");
    }

    private void outputBarChart() 
    {
        System.out.println("Grades distribution:");
        
        int[] frequency = new int[11];

        for (Integer grade : grades) 
        {
            frequency[grade / 10]++;
        }

        for (int i = 0; i < frequency.length; i++) 
        {
            String label;
            if (i == 10) 
            {
                label = "  100: ";
            } 
            else 
            {
                int low = i * 10;
                int high = i * 10 + 9;
                
                String lowStr = (low < 10) ? "0" + low : "" + low;
                String highStr = (high < 10) ? "0" + high : "" + high;
                
                label = lowStr + "-" + highStr + ": ";
            }

            System.out.print(label);

            for (int stars = 0; stars < frequency[i]; stars++) 
            {
                System.out.print("*");
            }
            
            System.out.println(); 
        }
    }
}