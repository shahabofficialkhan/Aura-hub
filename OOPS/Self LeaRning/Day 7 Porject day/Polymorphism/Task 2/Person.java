public class Person {
    private String name;
    private String address;
    public Person(String name, String  address) {
        this.name = name;
        this.address = address;
    }
    //Setter
    public void setName(String name){this.name = name;}
    public void setAddress(String address){this.address = address;}
    //Getter
    public String getName(){return name;}
    public String getAddress(){ return ("Address: " + address);}
 void displayInfo (){
    System.out.println("Name :" + getName()
    +"\n"   + getAddress());
 }

}
