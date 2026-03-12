import java.util.Scanner;

class Book {

    String title;
    String author;
    String ISBN;
    boolean isIssued;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isIssued = false;
    }

    public String displayInfo() {
        return "Title: " + title + "        " + "Author: " + author + "        " + "ISBN: " + ISBN + "        " + (isIssued ? "issued" : "Not issued");
    }

    @Override
    public String toString() {
        return "Title: " + title + "        " + "Author: " + author + "        " + "ISBN: " + ISBN + "        " + "Is Issued: " + (isIssued ? "issued" : "Not issued");
    }
}

class Library {

    String libraryType;
    Book[] books;
    int totalBooks = 5;

    public Library(String libraryType) {

        this.libraryType = libraryType;
        books = new Book[50];


        if (libraryType.equals("CS")) {
            books[0] = new Book("Java Basics", "Herbert Schildt", "JB01");
            books[1] = new Book("DSA in Java", "Mark Allen", "DS02");
            books[2] = new Book("Harry Potter", "J.K. Rowling", "HP01");
            books[3] = new Book("Java Programming", "Herbert Schildt", "JP02");
            books[4] = new Book("Data Structures", "Mark Allen", "DS03");
        } else if (libraryType.equals("MS")) {
            books[0] = new Book("Medical Anatomy", "Dr. Sara Khan", "MA01");
            books[1] = new Book("Pharmacology Essentials", "Dr. Ahmed Raza", "PH02");
            books[2] = new Book("Human Physiology", "Dr. Kamran Ali", "HP03");
            books[3] = new Book("Pathology Made Simple", "Dr. Nida Tariq", "PA04");
        } else if (libraryType.equals("GENERAL")) {
            books[0] = new Book("The Great Gatsby", "F. Scott Fitzgerald", "GG05");
            books[1] = new Book("1984", "George Orwell", "NIN06");
            books[2] = new Book("The Book Thief", "Markus Zusak", "BT07");
            books[3] = new Book("A Brief History of Time", "Stephen Hawking", "BH08");
        } else {
            System.out.println("No such library exists");
        }

    }

    public void addBook(String bookTitle, String bookAuthor, String ISBN) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = new Book(bookTitle, bookAuthor, ISBN);
                System.out.println("Book is Successfully added to the Library");
                break;
            }
        }
    }

    public void issueBook(String issueBook) {
        boolean found = false;
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) break;

            if (issueBook.equalsIgnoreCase(books[i].title)) {
                if (books[i].isIssued) {
                    System.out.println("Book is already issued");
                } else {
                    books[i].isIssued = true;
                    found = true;
                    System.out.println("Book is SuccessFully Issued");
                }
                break;
            }
        }
        if (!found) System.out.println("Book not Found");
    }

    public void returnBook(String returnBook) {
        boolean bookReturned = false;
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) break;
            if (books[i].title.equalsIgnoreCase(returnBook)) {
                books[i].isIssued = false;
                bookReturned = true;
                System.out.println("Book is Successfully returned");
                break;
            }
        }
        if (!bookReturned) System.out.println("Please enter the valid input or book not found in this library.");
    }

    public void displayInfo() {
        System.out.println("======== LIBRARY BOOKS ========");
        System.out.println("\n");
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) break;
            System.out.println(books[i]);
            System.out.println("\n");
        }
    }

    @Override
    public String toString() {
        return "====== Library Books ======\n" + books[0] + "\n" + books[1] + "\n" + books[2] + "\n" + books[3] + "\n" + books[4];
    }

}

@SuppressWarnings("unused")
public class librarySystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Library[] libraries = new Library[3];

        libraries[0] = new Library("CS");
        libraries[1] = new Library("MS");
        libraries[2] = new Library("GENERAL");

        int libChoice;
        do {

            System.out.println("\n===== Welcome to the Library Management System =====");
            System.out.println("1. CS-library");
            System.out.println("2. MS-library");
            System.out.println("3. General library");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            libChoice = sc.nextInt();
            sc.nextLine();

            switch (libChoice) {

                case 1:
                    int choice1;
                    do {
                        System.out.println("\n===== CS Library Menu =====");
                        System.out.println("1. Add Book");
                        System.out.println("2. Issue Book");
                        System.out.println("3. Return Book");
                        System.out.println("4. Display Books");
                        System.out.println("5. Exit");
                        System.out.print("Enter your choice: ");
                        choice1 = sc.nextInt();
                        sc.nextLine();

                        switch (choice1) {
                            case 1:
                                System.out.print("Title: ");
                                String title = sc.nextLine();
                                System.out.print("Author: ");
                                String author = sc.nextLine();
                                System.out.print("ISBN: ");
                                String isbn = sc.nextLine();
                                libraries[0].addBook(title, author, isbn);
                                break;
                            case 2:
                                System.out.print("Enter the Title of the Book to be issued: ");
                                String issueBook = sc.nextLine();
                                libraries[0].issueBook(issueBook);
                                break;
                            case 3:
                                System.out.print("Enter the Title of the Book to be returned: ");
                                String returnBook = sc.nextLine();
                                libraries[0].returnBook(returnBook);
                                break;
                            case 4:
                                libraries[0].displayInfo();
                                break;
                            case 5:
                                System.out.println("Returning to main menu...");
                                break;
                            default:
                                System.out.println("Invalid choice. Try again.");
                                break;
                        }
                    } while (choice1 != 5);
                    break;

                case 2:
                    int choice2;
                    do {
                        System.out.println("\n===== MS Library Menu =====");
                        System.out.println("1. Add Book");
                        System.out.println("2. Issue Book");
                        System.out.println("3. Return Book");
                        System.out.println("4. Display Books");
                        System.out.println("5. Exit");
                        System.out.print("Enter your choice: ");
                        choice2 = sc.nextInt();
                        sc.nextLine();

                        switch (choice2) {
                            case 1:
                                System.out.print("Title: ");
                                String title2 = sc.nextLine();
                                System.out.print("Author: ");
                                String author2 = sc.nextLine();
                                System.out.print("ISBN: ");
                                String isbn2 = sc.nextLine();
                                libraries[1].addBook(title2, author2, isbn2);
                                break;
                            case 2:
                                System.out.print("Enter the Title of the Book to be issued: ");
                                String issueBook2 = sc.nextLine();
                                libraries[1].issueBook(issueBook2);
                                break;
                            case 3:
                                System.out.print("Enter the Title of the Book to be returned: ");
                                String returnBook2 = sc.nextLine();
                                libraries[1].returnBook(returnBook2);
                                break;
                            case 4:
                                libraries[1].displayInfo();
                                break;
                            case 5:
                                System.out.println("Returning to main menu...");
                                break;
                            default:
                                System.out.println("Invalid choice. Try again.");
                                break;
                        }
                    } while (choice2 != 5);
                    break;

                case 3:
                    int choice3;
                    do {
                        System.out.println("\n===== General Library Menu =====");
                        System.out.println("1. Add Book");
                        System.out.println("2. Issue Book");
                        System.out.println("3. Return Book");
                        System.out.println("4. Display Books");
                        System.out.println("5. Exit");
                        System.out.print("Enter your choice: ");
                        choice3 = sc.nextInt();
                        sc.nextLine();

                        switch (choice3) {
                            case 1:
                                System.out.print("Title: ");
                                String title3 = sc.nextLine();
                                System.out.print("Author: ");
                                String author3 = sc.nextLine();
                                System.out.print("ISBN: ");
                                String isbn3 = sc.nextLine();
                                libraries[2].addBook(title3, author3, isbn3);
                                break;
                            case 2:
                                System.out.print("Enter the Title of the Book to be issued: ");
                                String issueBook3 = sc.nextLine();
                                libraries[2].issueBook(issueBook3);
                                break;
                            case 3:
                                System.out.print("Enter the Title of the Book to be returned: ");
                                String returnBook3 = sc.nextLine();
                                libraries[2].returnBook(returnBook3);
                                break;
                            case 4:
                                libraries[2].displayInfo();
                                break;
                            case 5:
                                System.out.println("Returning to main menu...");
                                break;
                            default:
                                System.out.println("Invalid choice. Try again.");
                                break;
                        }
                    } while (choice3 != 5);
                    break;

                case 4:
                    System.out.println("Exiting the Library Management System. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
                    break;
            }

        } while (libChoice != 4);

        sc.close();
    }
}
