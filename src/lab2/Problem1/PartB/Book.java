package lab2.Problem1.PartB;

public class Book extends LibraryItem {
	public Book(String title, String author, int publicationYear, int pages) {
        super(title, author, publicationYear);
        this.pages = pages;
    }
	
    private int pages;

    @Override
    public String toString() {
        return super.toString() + ", Type: Book, Pages: " + pages;
    }
}