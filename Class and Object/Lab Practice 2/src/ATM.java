import java.util.Scanner;

public class ATM {
    String accountHolder;
    int accountNumber;
    double balance = 0;

    // Method to create account
    void createAccount(String accountHolder, int accountNumber, double initialBalance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        if (initialBalance > 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
            System.out.println("Initial balance must be positive. Set to 0.");
        }
        System.out.println("Account created successfully!");
        System.out.println("Account Holder: " + this.accountHolder);
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Initial Balance: $" + this.balance);
    }

    // Method to deposit money
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
            System.out.println("Now total balance is: $" + balance);
        } else {
            System.out.println("Invalid amount! Amount must be greater than 0.");
        }
    }

    // Method to withdraw money
    void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Amount withdrawn: $" + amount);
                System.out.println("Now balance is: $" + balance);
            } else {
                System.out.println("Insufficient balance! Current balance: $" + balance);
            }
        } else {
            System.out.println("Invalid amount! Amount must be greater than 0.");
        }
    }


    void display() {
        System.out.println("=== Account Details ===");
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ATM atm = new ATM();

        System.out.println("=== Welcome to ATM System ===");

        // Create account
        System.out.print("Enter Account Holder Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Account Number: ");
        int accNumber = scanner.nextInt();

        System.out.print("Enter Initial Balance: $");
        double initialBalance = scanner.nextDouble();

        atm.createAccount(name, accNumber, initialBalance);


        int choice;
        do {
            System.out.println("\n=== ATM Menu ===");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: $");
                    double depositAmount = scanner.nextDouble();
                    atm.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter withdrawal amount: $");
                    double withdrawAmount = scanner.nextDouble();
                    atm.withdraw(withdrawAmount);
                    break;

                case 3:
                    atm.display();
                    break;

                case 4:
                    System.out.println("Thank you for using our ATM!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}