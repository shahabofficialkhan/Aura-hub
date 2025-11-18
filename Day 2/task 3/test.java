import javax.sound.sampled.SourceDataLine;

class LibraryBookManagement{

    String title= "Bio";
    String author="Shahab";
    boolean isAvailable=true;
    void borrowBook(String t){
    
        if (title.equals(t) && isAvailable) {
            isAvailable = false;
            System.out.println("Book borrowed.");
        }
        else {
            System.out.println("Not Available");
        }
    }
    void returnBook(String t){
        if (title.equals(t)) {
            isAvailable = true;
            System.out.println("Book Returned.");
        }
        else {
            System.out.println("Invaid Book");
        }
    }
}
public class test {
    public static void main(String[] args) {
        LibraryBookManagement B = new LibraryBookManagement();
        System.out.println("Book Library");
        B.borrowBook("Bio");
         B.borrowBook("Bio");
         B.returnBook("Bio");
    }
}