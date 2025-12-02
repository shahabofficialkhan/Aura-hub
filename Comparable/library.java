import java.util.ArrayList;

import javax.xml.crypto.Data;

public class library {
// 
public static void main(String[] args) {
    //  Original List:
// 101 Java Basics (Author: Ali)
// 103 Data Structures (Author: Sana)
// 102 OOP Concepts (Author: Bilal)
// 104 Algorithms (Author: Hina)
Book b1 = new Book(11, "Java", new Author("Shahab", "Shahab@email.com"));
Book b2 = new Book(112, "Data", new Author("Ahsan", "Shahab@email.com"));
Book b3 = new Book(133, "OOP", new Author("ali", "Shahab@email.com"));
Book b4 = new Book(104, "DS", new Author("Ahmad", "Shahab@email.com"));
ArrayList <Book> libaray =  new ArrayList<>(4);
libaray.add(b3);
libaray.add(b2);
libaray.add(b4);
libaray.add(b1);
 for (Book b: libaray){
    System.out.println(b.getId()+" "+b.gettitle()+" Author: "+b.getAuthor().getName());
}
 System.out.println("After Sorting ");
libaray.sort(Book::compareTo); 
 for (Book b: libaray){
    System.out.println(b.getId()+" "+b.gettitle()+" Author: "+b.getAuthor().getName());
}



}

}