interface BankingInterface {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}

// SavingsAccount class implementing the BankingInterface
class SavingsAccount implements BankingInterface {
    private double balance;

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}

// CurrentAccount class implementing the BankingInterface
class CurrentAccount implements BankingInterface {
    private double balance;

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        // Current accounts typically allow overdraft
        balance -= amount;
    }

    @Override
    public double getBalance() {
        return balance;
    }
}

// Main class to test the banking functionality
public class Bank {
    public static void main(String[] args) {
        // Creating objects of SavingsAccount and CurrentAccount classes
        SavingsAccount savingsAccount = new SavingsAccount();
        CurrentAccount currentAccount = new CurrentAccount();

        // Depositing and withdrawing from savings account
        savingsAccount.deposit(1000);
        System.out.println("Savings Account Balance: " + savingsAccount.getBalance());
        savingsAccount.withdraw(500);
        System.out.println("Savings Account Balance after withdrawal: " + savingsAccount.getBalance());

        // Depositing and withdrawing from current account
        currentAccount.deposit(2000);
        System.out.println("Current Account Balance: " + currentAccount.getBalance());
        currentAccount.withdraw(1500);
        System.out.println("Current Account Balance after withdrawal: " + currentAccount.getBalance());
    }
}