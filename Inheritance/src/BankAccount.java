public class BankAccount {
    int accountNumber;
    double balance;

    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}

class SavingAccount extends BankAccount {
    double interestRate;

    SavingAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void displayAccountType() {
        System.out.println("Account Type: Savings Account");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    CheckingAccount(int accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    void displayAccountType() {
        System.out.println("Account Type: Checking Account");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Withdrawal Limit: " + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    int tenureMonths;

    FixedDepositAccount(int accountNumber, double balance, int tenureMonths) {
        super(accountNumber, balance);
        this.tenureMonths = tenureMonths;
    }

    void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Tenure: " + tenureMonths + " months");
    }
}

class Main2 {
    public static void main(String[] args) {
        SavingAccount savings = new SavingAccount(1001, 5000.0, 4.5);
        CheckingAccount checking = new CheckingAccount(1002, 3000.0, 1000.0);
        FixedDepositAccount fd = new FixedDepositAccount(1003, 10000.0, 12);

        savings.displayAccountType();
        System.out.println();
        checking.displayAccountType();
        System.out.println();
        fd.displayAccountType();
    }
}