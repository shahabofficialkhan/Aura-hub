public class test {
    public static void main(String[] args) {

        // // ----------- New Account (age 22) -----------
        // System.out.println("Creating new account for Ali (age 22)...");
        // Account a1 = new Account("35202-1234567-1", "Ali", 22);

        // System.out.println("Name: " + a1.getName());
        // System.out.println("Age: " + a1.getAge());
        // System.out.println("Initial Balance: " + a1.getBalance());

        // a1.deposit(5000);
        // System.out.println("Balance After Deposit: " + a1.getBalance());

        // a1.withdraw(3000);
        // System.out.println("Balance After Withdraw: " + a1.getBalance());


        // ----------- New Account (age below 20 → Not Allowed) -----------
        // System.out.println("\nTrying to create account of age 18...");
        Account a2 = new Account("35201-0000000-0", "Usman", 18);
        System.out.println(a2.getAge());

        // ----------- Existing Account -----------
        // System.out.println("\nCreating existing account...");
        // Account existing = new Account("ACC-007");
        // System.out.println("Existing accountId: " + existing.getAccountId());
        // System.out.println("Balance: " + existing.getBalance());
    }
}
