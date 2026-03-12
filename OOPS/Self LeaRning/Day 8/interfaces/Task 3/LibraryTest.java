import java.util.ArrayList;
import java.util.Collections;

public class LibraryTest {
    public static void main(String[] args) throws Exception {

        Author a1 =new Author("fahad", "ali@gmail.com");
        Book b1 = new Book(101, "Java Basics", a1);
        Book b2 = new Book(103, "Data Structures", new Author("Ahmad", "sana@gmail.com"));
        Book b3 = new Book(102, "OOP Concepts", new Author("shahab", "bilal@gmail.com"));
        Book b4 = new Book(104, "PP", new Author("Huzifia ", "hina@gmail.com"));

        ArrayList<Book> list = new ArrayList<>();
        list.add(b1);
        list.add(b2);
        list.add(b3);
        list.add(b4);     

        
        System.out.println("Original List:");
        for (Book b : list) {
            System.out.println(b);
        }
        System.out.println();

    //     Collections.sort(list);

    //     System.out.println("Sorted by Title (Comparable):");
    //     for (Book b : list) {
    //         System.out.println(b.getId() + " " + b.getTitle());
    //     }
    //     System.out.println();


    //     System.out.println("Cloning book rgba(187, 15, 15, 1)...");
    //     Book original = b3;    
    //     Book cloned = (Book) original.clone();

    //     System.out.println("\nBefore modifying clone:");
    //     System.out.println("Original author: " + original.getAuthor().getName());
    //     System.out.println("Clone author:     " + cloned.getAuthor().getName());

    //     // Modify cloned author's name
    //     cloned.getAuthor().setName("Zara");

    //     System.out.println("\nAfter modifying clone:");
    //     System.out.println("Original author: " + original.getAuthor().getName());
    //     System.out.println("Clone author:     " + cloned.getAuthor().getName());
    }
}
