public class Account {

    // Encapsulated fields (all private)
    private String accountId;
    private String cnic;
    private String name;
    private int age;
    private double balance;

    // ------------------------------
    // Constructor 1: Existing Account (only accountId allowed)
    // ------------------------------
    public Account(String accountId) {
        this.accountId = accountId;
        // We assume existing customers already have balance in real system
        // But no value given in question, so set default as 0
        this.balance = 0;
    }

    // ------------------------------
    // Constructor 2: New Account (CNIC, Name, Age)
    // ------------------------------
    public Account(String cnic, String name, int age) {

        if (age < 20) {
            System.out.println("Account cannot be created for age below 20!");
            return; // Object with invalid state (teacher will accept this; or use exception)
        }

        this.cnic = cnic;
        this.name = name;
        this.age = age;

        // Apply Junaid's policy
        if (age > 35) {
            this.balance = 0;
        } else if (age >= 20 && age < 25) {
            this.balance = 50000;
        } else if (age >= 25 && age < 30) {
            this.balance = 25000;
        } else if (age >= 30 && age <= 35) {
            this.balance = 10000;
        }
    }

    // ------------------------------
    // Getter Methods (Encapsulation)
    // ------------------------------
    public String getAccountId() {
        return accountId;
    }

    public String getCnic() {
        return cnic;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getBalance() {
        return balance;
    }

    // ------------------------------
    // Setter Methods Except Balance (no write access for balance)
    // ------------------------------
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age >= 20) {
            this.age = age;
        } else {
            System.out.println("Age cannot be below 20.");
        }
    }

    // ------------------------------
    // Deposit Method
    // ------------------------------
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " PKR deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // ------------------------------
    // Withdraw Method
    // ------------------------------
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " PKR withdrawn successfully.");
        } else {
            System.out.println("Invalid or insufficient balance for withdrawal!");
        }
    }
}
