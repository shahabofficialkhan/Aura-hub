class Book {
    String title;
    Book(String t) { title = t; }
    Book(Book b) { title = b.title + " Pro"; }
}

class Test {
    public static void main(String[] args) {
        Book b1 = new Book("Java");
        Book b2 = new Book(b1);
        System.out.println(b2.title);
    }
}
