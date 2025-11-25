import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter number of teachers:");
    int n = input.nextInt();
    input.nextLine(); // consume newline left by nextInt()

    Faculty[] NumberofStaff = new Faculty[n];

    for (int i = 0; i < n; i++) {
        System.out.println("Enter 1 for Permanent Faculty");
        System.out.println("Enter 2 for Visiting Faculty");
        int option = input.nextInt();
        input.nextLine(); // consume newline after nextInt()

        if (option == 1) {
            System.out.print("Enter the ID: ");
            String id = input.nextLine();

            System.out.print("Enter the Name: ");
            String name = input.nextLine();

            System.out.print("Enter the Salary: ");
            double salary = input.nextDouble();
            input.nextLine(); // consume newline

            NumberofStaff[i] = new PermanentFaculty(id, name, salary);

        } else if (option == 2) {
            System.out.print("Enter the ID: ");
            String id = input.nextLine();

            System.out.print("Enter the Name: ");
            String name = input.nextLine();

            System.out.print("Enter the Salary per Hour: ");
            double salaryPerHr = input.nextDouble();

            System.out.print("Enter the Hours: ");
            double hours = input.nextDouble();
            input.nextLine(); // consume newline

            NumberofStaff[i] = new VisitingFaculty(id, name, hours, salaryPerHr);

        } else {
            System.out.println("Invalid option! Skipping this entry.");
            i--; // stay on the same index to re-enter
            continue;
        }

        System.out.println("Entry Done!\n");
    }

    // Print all faculty details
    System.out.println("All Faculty Details:");
    for (Faculty a : NumberofStaff) {
        System.out.println(a); // calls overridden toString()
    }

    input.close();
}

    }

