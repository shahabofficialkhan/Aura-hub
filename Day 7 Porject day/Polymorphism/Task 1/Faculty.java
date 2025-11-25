public abstract class Faculty {
    private String id ;
    private String name;
    public Faculty (String id, String name) {
        this.id = id;
        this.name = name;
    }   
     public String getId() {
        return id;
    }    public String getName() {
        return name;}
    abstract void calculatesalary ();

   @Override
   public String toString(){
    return String.format(" Id " + id, "Name " +  name);
   }

}
