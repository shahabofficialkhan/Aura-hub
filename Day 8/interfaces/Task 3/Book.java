public class Book implements Comparable<Book>, Cloneable {
    private int id;
    private String title;
    private Author author;

    public Book(int id, String title, Author author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    // Getters
    public int getId() { return id; }
    public String getTitle() { return title; }
    public Author getAuthor() { return author; }

    
    @Override
    public int compareTo(Book other) {
        return this.title.compareTo(other.title);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Book cloned = (Book) super.clone();    
        cloned.author = (Author) author.clone(); 
        return cloned;
    }

    @Override
    public String toString() {
        return id + " " + title + " (Author: " + author + ")";
    }
}
