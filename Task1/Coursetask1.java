import java.util.*;

public class Coursetask1 {
    public static void main(String[] args) {
        // System.out.println("SP25-BSE-102\nMuhammad Shahab");
        Course obj = new Course();
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Number of the Course : ");
        int numberofthecourse = input.nextInt ();

       // We are Created an Array of the Object 
         Course[] Coursearray = new Course[numberofthecourse];
         for (int i = 0; i < numberofthecourse; i++) {
             Coursearray[i] = new Course();
             System.out.println("Please Enter the Course Title : ");
             String coursetitle = input.next();
             System.out.println("Please Enter the Course Code : ");
             int coursecode = input.nextInt();
             System.out.println("Please Enter the Course Credit Hours : ");
             int coursecredithours = input.nextInt();
             Coursearray[i].Setter(coursetitle, coursecode, coursecredithours);
         }
            System.out.println("You have Entered the Following Courses : ");
            for (int i = 0; i < numberofthecourse; i++) {
                System.out.println("Course " + (i + 1) + " Details:");
                Coursearray[i].Getter();
            }
    }
}
