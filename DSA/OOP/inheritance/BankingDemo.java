package DSA.OOP.inheritance;

class BankAccount {
    public int accountNumber;
    public double balance;
    public String accountHolder;


    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }


    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println(amount + " deposited. New Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount)
        {
            balance = balance - amount;
            System.out.println(amount + " withdrawn. Remaining Balance: " + balance);
        }
        else {
            System.out.println("Insufficient balance!");
        }
    }

    public void displayAccountInfo() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}


class SavingsAccount extends BankAccount {
    public double interestRate;

    public SavingsAccount(int accNo, String holder, double balance, double interestRate) {
        super(accNo, holder, balance);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = balance * interestRate / 100;
        deposit(interest);
        System.out.println("Interest added: " + interest);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount < 500) {
            System.out.println("Cannot withdraw! Minimum balance of 500 must be maintained.");
        } else {
            super.withdraw(amount);
        }
    }
}


class CurrentAccount extends BankAccount {
    public double overdraftLimit;

    public CurrentAccount(int accNo, String holder, double balance, double overdraftLimit) {
        super(accNo, holder, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance = balance - amount;
            System.out.println(amount + " withdrawn using overdraft facility. Balance: " + balance);
        } else {
            System.out.println("Overdraft limit exceeded!");
        }
    }
}

public class BankingDemo {
    public static void main(String[] args) {
        BankAccount acc1 = new SavingsAccount(101, "Aditya", 2000, 5.0);
        BankAccount acc2 = new CurrentAccount(102, "Pratii", 1000, 5000);

        System.out.println("---- Savings Account ----");
        acc1.displayAccountInfo();
        acc1.withdraw(1800);
        ((SavingsAccount) acc1).addInterest();

        System.out.println("\n---- Current Account ----");
        acc2.displayAccountInfo();
        acc2.withdraw(4000);

    }
}
