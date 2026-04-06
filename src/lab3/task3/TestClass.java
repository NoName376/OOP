package lab3.task3;

public class TestClass {
    public static void main(String[] args) {
        MyCollection<String> collection = new MyArrayCollection<>();

        collection.add("Java");
        collection.add("Python");
        collection.add("C#");

        System.out.println("Size: " + collection.size());
        System.out.println(collection.contains("Java"));

        for (String item : collection) {
            System.out.println(item);
        }

        collection.remove("Python");
        System.out.println("Size after remove: " + collection.size());

        collection.clear();
        System.out.println("Is empty: " + collection.isEmpty());
    }
}
