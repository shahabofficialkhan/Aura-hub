import java.util.Scanner;

public class BankAccount_Test {
    public static void main(String[] args) {
        BankAccount account = new BankAccount ();
        System.out.println("Please Deposit an Amount: ");
        Scanner input = new Scanner (System.in);
        int amount = input .nextInt ();
        account .deposit (amount);
        System.out.println("Please Select an Option:\n1. Withdraw \n2. checkBalence \n3. Exit");
        int option = input .nextInt ();
        switch (option) {
            case 1:
                System.out.println("Enter Withdraw Amount: ");
                int withdrawAmount = input .nextInt ();
                account .withdraw (withdrawAmount);     
                break;
            case 2:
                System.out.println("Your Current Balance is: " + account .checkBalance());
                break;
            case 3:
                System.out.println("Exiting. Thank you!");
                break;
            default:
                System.out.println("Invalid Option Selected."); 
    }}
}
