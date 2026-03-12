public class Student {
    private String name;
    private String studentid;
    private Address address;
    private Course course1;
    private Course course2;

    Student(String name, String studentid, Address address){
        setName(name);
        setStudentid(studentid);
        setAddress(address);
        
    }



    //Setter Method
    public void setName(String name){
        this.name = name;
    }
    public void setStudentid(String studentid){
        this.studentid = studentid;
    }
    public boolean setAddress(Address address){
        if (address == null) {
            return false;
        }
        this.address = address;
        return true;

    }
    public void setCourse1(Course course1){
        this.course1 = course1;
    }
    public void setCourse2(Course course2){
        this.course2 = course2;
    }

   


    //Getter Method
    public String getName(){
        return name;
    }
    public String getStudentid(){
        return studentid;
    }
    public Address getAddress(){
        return address;
    }
    public Course getCourse1(){
        return course1;
    }
    public Course getCourse2(){
        return course2;
    }
    public String toString(){
        return "Student Name: " + name + "\nStudent ID: " + studentid + "\n" + address.toString();
    }

}
