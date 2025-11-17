
import java.util.Scanner;
class Student {
    private String name;
    private int roll;
    private double cgpa;

    // Constructor
    public Student(String name, int roll, double cgpa) {
        this.name = name;
        this.roll = roll;
        this.cgpa = cgpa;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getRoll() {
        return roll;
    }

    public double getCgpa() {
        return cgpa;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }
}