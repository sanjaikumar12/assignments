public class Account {
    private double balance;

    // No-argument constructor
    public Account() {
        balance = 0.0;
    }

    // Parameterized constructor
    public Account(double initialBalance) {
        balance = initialBalance;
    }

    // Method to deposit amount to the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount. Please enter a positive value.");
        }
        displayBalance();
    }

    // Method to withdraw amount from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else if (amount <= 0) {
            System.out.println("Invalid withdrawal amount. Please enter a positive value.");
        } else {
            System.out.println("Insufficient funds. Cannot withdraw.");
        }
        displayBalance();
    }

    // Method to display the balance
    public void displayBalance() {
        System.out.println("Current Balance: $" + balance);
    }

    public static void main(String[] args) {
        // Example usage
        Account account1 = new Account(); // Creating an account with a zero balance
        account1.deposit(1000.0);
        account1.withdraw(500.0);

        Account account2 = new Account(500.0); // Creating an account with an initial balance of $500
        account2.deposit(200.0);
        account2.withdraw(300.0);
    }
}

