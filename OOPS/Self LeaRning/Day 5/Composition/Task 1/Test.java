public class Test {

    public static void main(String[] args) {
        
        Phonenumber phonenumber = new Phonenumber("+1", "555-1234");
        Address address = new Address ("271 LDA", "lahore", "12345", phonenumber);
        Student student1 = new Student ("Shahab" , "102", address);
        Student student2 = new Student ("Shahab" , "102", address);
        student2.getAddress().setPhonenumber(new Phonenumber("+1", "555-5678"));
        Course course1 = new Course ("OOP", "CS201");
        Course course2 = new Course ("DS", "CS202");
        student1.setCourse1(course1);
        student1.setCourse2(course2);
        student2.setCourse1(course1);
        student2.setCourse2(course2);


        // System.out.println("Student 1 Details:"+ student1);
        Address updatedAddress;

        System.out.println("Student Address" + student1.setAddress(updatedAddress = new Address("123 New St", "New City", "67890", new Phonenumber("+1", "555-9999"))));

    }
}
