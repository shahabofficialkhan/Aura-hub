public class BankAccount {
    private double balance;
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
    void withdraw (double amount){
        if (amount <= 0) {
            System.out.println("Invalid amount.");
        }
    else if (amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Withdrawal Successful. New Balance: " + balance);
        }
    else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }
    int checkBalance() {
        System.out.println("Current Balance: " + balance);
    
        return (int) balance;
    }  
}