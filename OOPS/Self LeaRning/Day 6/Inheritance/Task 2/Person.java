public class Person {
    private String name;
    private Address address;
    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }
    //Setter
    public void setName(String name){this.name = name;}
    public void setAddress(Address address){this.address = address;}
    //Getter
    public String getName(){return name;}
    public String getAddress(){ return ("Address: " + address);}
 void displayInfo (){
    System.out.println("Name :" + getName()
    +"\n"   + getAddress());
 }

}
