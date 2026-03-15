package lab2.Problem1.PartB;

public abstract class LibraryItem {
	public LibraryItem(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }
	
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getPublicationYear() { return publicationYear; }
	
    private String title;
    private String author;
    private int publicationYear;

    @Override
    public String toString() {
        return "Title: " + title + ", " +
        		"Author: " + author + ", " + 
        		"Year: " + publicationYear;
    }
}