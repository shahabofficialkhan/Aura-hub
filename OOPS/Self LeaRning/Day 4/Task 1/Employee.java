 class Employee {
    private String name   ;
    private int id ;
    String cnci;
    public Employee(){     
                     }
    public Employee(String name , int id ){    
        set(name , id);
                     }
    public Employee(String name , int id , String cnci){    
        this(name,id);
        this.cnci=cnci;
                     }                 
    void set (String name , int id )  {
        this.name = name ;
        this.id = id ;
    }    
    String getName(){
        return name;
    } 
    int getId(){
        return id;
    }            
    
}
class EmployeeTest{

}