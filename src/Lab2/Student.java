package Lab2;

public class Student {
    String name;
    String id;
    int year;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
        this.year = 2026; 
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getYear() {
        return year;
    }

    public void nextYear() {
        this.year++;
    }
    
    public static void main(String[] args) {
        Student s1 = new Student("Abdulaziz", "24B031692");

        System.out.println("Имя: " + s1.getName());
        System.out.println("ID: " + s1.getId());
        System.out.println("Год обучения: " + s1.getYear());

        System.out.println("\n");        
        System.out.println("A few moment later...");
        s1.nextYear();

        System.out.println("Новый год обучения: " + s1.getYear());
    }
}
