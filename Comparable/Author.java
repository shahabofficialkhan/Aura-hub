public class Author implements Cloneable {
    String name;
    String email ;
    Author (String name , String email){
        this.name= name;
        this.email=email;
    }
    String getEmail (){
        return email;
    }
    String getName(){
        return name;
    }
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    
}
