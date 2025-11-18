import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        // Setting Data
        
        s1.setName("Ali");
        s1.setRoll(101);
        s1.setCgpa(3.2);

        s2.setName("Sara");
        s2.setRoll(102);
        s2.setCgpa(3.8);

        s3.setName("Bilal");
        s3.setRoll(103);
        s3.setCgpa(3.5);

        // Finding Highest CGPA
        Student topper = s1;

        if (s2.getCgpa() > topper.getCgpa()) {
            topper = s2;
        }
        if (s3.getCgpa() > topper.getCgpa()) {
            topper = s3;
        }

        // Printing Result
        System.out.println("Top Student:");
        System.out.println("Name: " + topper.getName());
        System.out.println("Roll No: " + topper.getRoll());
        System.out.println("CGPA: " + topper.getCgpa());
    }
}