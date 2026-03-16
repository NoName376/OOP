package lab2.Problem1.PartB;

public class TestClass {
    public static void main(String[] args) {
        var inventory = new LibraryItem[2];

        inventory[0] = new Book("All Quiet on the Western Front", "Erich Maria Remarque", 1929, 296);
        inventory[1] = new Book("Liebe deinen Nächsten", "Erich Maria Remarque", 1945, 415);
        
        for (var item : inventory) {
            System.out.println(item.toString());
        }
    }
}