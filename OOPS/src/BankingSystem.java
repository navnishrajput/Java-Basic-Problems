import java.util.ArrayList;
import java.util.List;

interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
    double getLoanAmount();
    double getInterestRate();
}

abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;
    private String accountType;

    public BankAccount(String accountNumber, String holderName, double balance, String accountType) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
        this.accountType = accountType;
    }

    public abstract double calculateInterest();

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: ₹" + amount + " | New Balance: ₹" + balance);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount + " | New Balance: ₹" + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance");
        }
    }

    public String getAccountNumber() { return accountNumber; }
    public String getHolderName() { return holderName; }
    public double getBalance() { return balance; }
    public String getAccountType() { return accountType; }
    protected void setBalance(double balance) { this.balance = balance; }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: ₹" + balance);
    }
}

class SavingsAccount extends BankAccount implements Loanable {
    private double interestRate;
    private double minimumBalance;
    private double loanAmount;
    private double loanInterestRate;
    private boolean loanActive;

    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance, "Savings Account");
        this.interestRate = 4.5;
        this.minimumBalance = 1000;
        this.loanAmount = 0;
        this.loanInterestRate = 8.0;
        this.loanActive = false;
    }

    @Override
    public double calculateInterest() {
        double interest = (getBalance() * interestRate) / 100;
        System.out.println("Annual Interest: ₹" + interest + " at " + interestRate + "%");
        return interest;
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= minimumBalance) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal denied! Minimum balance requirement not met");
        }
    }

    @Override
    public void applyForLoan(double amount) {
        if (!loanActive && amount <= getBalance() * 5) {
            loanAmount = amount;
            loanActive = true;
            System.out.println("Loan approved: ₹" + amount + " at " + loanInterestRate + "% interest");
        } else {
            System.out.println("Loan application rejected");
        }
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 5000 && !loanActive;
    }

    @Override
    public double getLoanAmount() { return loanAmount; }

    @Override
    public double getInterestRate() { return loanInterestRate; }

    public void payLoanEMI() {
        if (loanActive) {
            double emi = loanAmount * (loanInterestRate/100) / 12;
            if (getBalance() >= emi) {
                withdraw(emi);
                loanAmount -= (emi - (loanAmount * loanInterestRate/100/12));
                System.out.println("EMI paid: ₹" + emi + " | Remaining loan: ₹" + loanAmount);
                if (loanAmount <= 0) {
                    loanActive = false;
                    loanAmount = 0;
                    System.out.println("Loan fully repaid!");
                }
            } else {
                System.out.println("Insufficient balance for EMI payment");
            }
        }
    }

    @Override
    public void displayAccountInfo() {
        super.displayAccountInfo();
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Minimum Balance: ₹" + minimumBalance);
        if (loanActive) {
            System.out.println("Active Loan: ₹" + loanAmount + " at " + loanInterestRate + "%");
        }
    }
}

class CurrentAccount extends BankAccount implements Loanable {
    private double overdraftLimit;
    private double loanAmount;
    private double loanInterestRate;
    private boolean loanActive;

    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance, "Current Account");
        this.overdraftLimit = 50000;
        this.loanAmount = 0;
        this.loanInterestRate = 12.0;
        this.loanActive = false;
    }

    @Override
    public double calculateInterest() {
        System.out.println("Current accounts typically don't earn interest");
        return 0;
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() + overdraftLimit >= amount) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawn: ₹" + amount + " | New Balance: ₹" + getBalance());
        } else {
            System.out.println("Withdrawal exceeds overdraft limit");
        }
    }

    @Override
    public void applyForLoan(double amount) {
        if (!loanActive && amount <= getBalance() * 10) {
            loanAmount = amount;
            loanActive = true;
            deposit(amount);
            System.out.println("Business loan approved: ₹" + amount + " at " + loanInterestRate + "% interest");
        } else {
            System.out.println("Business loan application rejected");
        }
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 10000 && !loanActive;
    }

    @Override
    public double getLoanAmount() { return loanAmount; }

    @Override
    public double getInterestRate() { return loanInterestRate; }

    public void payBusinessLoan() {
        if (loanActive) {
            double quarterlyInterest = loanAmount * (loanInterestRate/100) / 4;
            if (getBalance() >= quarterlyInterest) {
                withdraw(quarterlyInterest);
                System.out.println("Quarterly interest paid: ₹" + quarterlyInterest);
            } else {
                System.out.println("Insufficient balance for interest payment");
            }
        }
    }

    @Override
    public void displayAccountInfo() {
        super.displayAccountInfo();
        System.out.println("Overdraft Limit: ₹" + overdraftLimit);
        if (loanActive) {
            System.out.println("Business Loan: ₹" + loanAmount + " at " + loanInterestRate + "%");
        }
    }
}

class FixedDepositAccount extends BankAccount {
    private double interestRate;
    private int tenure;

    public FixedDepositAccount(String accountNumber, String holderName, double balance, int tenure) {
        super(accountNumber, holderName, balance, "Fixed Deposit");
        this.tenure = tenure;
        this.interestRate = 6.5 + (tenure / 12.0);
    }

    @Override
    public double calculateInterest() {
        double interest = (getBalance() * interestRate * tenure) / (12 * 100);
        System.out.println("FD Interest for " + tenure + " months: ₹" + interest + " at " + interestRate + "%");
        return interest;
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Early withdrawal not allowed for Fixed Deposits");
    }

    public void mature() {
        double maturityAmount = getBalance() + calculateInterest();
        System.out.println("FD matured! Maturity amount: ₹" + maturityAmount);
    }
}

class Bank {
    private List<BankAccount> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
        initializeAccounts();
    }

    private void initializeAccounts() {
        SavingsAccount sa1 = new SavingsAccount("SA001", "John Doe", 25000);
        SavingsAccount sa2 = new SavingsAccount("SA002", "Jane Smith", 50000);

        CurrentAccount ca1 = new CurrentAccount("CA001", "Business Corp", 100000);
        CurrentAccount ca2 = new CurrentAccount("CA002", "Enterprise Ltd", 200000);

        FixedDepositAccount fd1 = new FixedDepositAccount("FD001", "John Doe", 100000, 24);
        FixedDepositAccount fd2 = new FixedDepositAccount("FD002", "Jane Smith", 50000, 12);

        accounts.add(sa1);
        accounts.add(sa2);
        accounts.add(ca1);
        accounts.add(ca2);
        accounts.add(fd1);
        accounts.add(fd2);
    }

    public void processAllAccounts() {
        System.out.println("=== BANKING SYSTEM - ACCOUNT PROCESSING ===");

        for (BankAccount account : accounts) {
            System.out.println("\n" + "=".repeat(50));
            account.displayAccountInfo();

            double interest = account.calculateInterest();

            if (account instanceof Loanable) {
                Loanable loanableAccount = (Loanable) account;
                boolean eligible = loanableAccount.calculateLoanEligibility();
                System.out.println("Loan Eligible: " + eligible);
                if (eligible && loanableAccount.getLoanAmount() == 0) {
                    loanableAccount.applyForLoan(account.getBalance() * 2);
                }
            }

            if (account instanceof SavingsAccount) {
                SavingsAccount sa = (SavingsAccount) account;
                if (sa.getLoanAmount() > 0) {
                    sa.payLoanEMI();
                }
            }

            if (account instanceof CurrentAccount) {
                CurrentAccount ca = (CurrentAccount) account;
                if (ca.getLoanAmount() > 0) {
                    ca.payBusinessLoan();
                }
            }

            System.out.println("--- Transaction Simulation ---");
            account.deposit(5000);
            account.withdraw(2000);
        }
    }

    public void showLoanAccounts() {
        System.out.println("\n=== LOAN ACCOUNTS SUMMARY ===");
        for (BankAccount account : accounts) {
            if (account instanceof Loanable) {
                Loanable loanable = (Loanable) account;
                if (loanable.getLoanAmount() > 0) {
                    System.out.println(account.getHolderName() + " - Loan: ₹" +
                            loanable.getLoanAmount() + " at " + loanable.getInterestRate() + "%");
                }
            }
        }
    }

    public void calculateTotalAssets() {
        double totalDeposits = 0;
        double totalLoans = 0;

        for (BankAccount account : accounts) {
            totalDeposits += account.getBalance();
            if (account instanceof Loanable) {
                totalLoans += ((Loanable) account).getLoanAmount();
            }
        }

        System.out.println("\n=== BANK FINANCIAL SUMMARY ===");
        System.out.println("Total Customer Deposits: ₹" + totalDeposits);
        System.out.println("Total Loans Given: ₹" + totalLoans);
        System.out.println("Net Assets: ₹" + (totalDeposits - totalLoans));
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.processAllAccounts();
        bank.showLoanAccounts();
        bank.calculateTotalAssets();

        System.out.println("\n" + "=".repeat(50));
        System.out.println("INDIVIDUAL ACCOUNT DEMONSTRATION:");

        SavingsAccount testAccount = new SavingsAccount("TEST001", "Test User", 15000);
        testAccount.displayAccountInfo();
        testAccount.calculateInterest();

        if (testAccount.calculateLoanEligibility()) {
            testAccount.applyForLoan(25000);
        }

        testAccount.deposit(10000);
        testAccount.payLoanEMI();
    }
}