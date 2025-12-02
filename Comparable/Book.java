public class Book  implements Comparable<Book>{
    int id ;
    String title;
    Author author;
    Book (int id , String title,Author author){
        this.id=id;
        this.title=title;
        this.author=author;
    }
   public int getId() {
       return id;
   }
   public String gettitle(){
    return title ;
   } 
   public Author getAuthor() {
       return author;
   }
    @Override
    public int compareTo(Book otherBook) {
        // if (this.id>otherBook.id){
        //     return 1;
        // }
        // else if (this.id<otherBook.id){
        //     return -1;
        // }
        // else {
        //     return 0;
        // }

        // if (this.title.compareTo(otherBook.title) > 0) {
        //     return 1;
        // } else if (this.title.compareTo(otherBook.title) < 0) {
        //     return -1;
        // } else {
        //     return 0;
        // }

        if (this.author.getName().compareTo(otherBook.author.getName()) > 0) {
            return 1;
        } else if (this.author.getName().compareTo(otherBook.author.getName()) < 0) {
            return -1;
        } else {
            return 0;
        }
    }


}
