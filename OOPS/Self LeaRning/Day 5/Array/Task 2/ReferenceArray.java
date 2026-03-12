import java.util.Scanner;

public class ReferenceArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] number  = new String [2];
        System.out.println("Please Enter three  Name ");
        
        number[0] = "shahab";
        number[1] = "Fadii";
       
        System.out.println("Student Names");
       for (String n : number ){
        
        System.out.println(n);

       }



       
}}
