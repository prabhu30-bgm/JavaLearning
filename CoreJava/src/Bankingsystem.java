import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// ============================================================================
// 1. ABSTRACTION & ENCAPSULATION
// ============================================================================

interface Transactional {
    boolean deposit(double amount);
    boolean withdraw(double amount);
}

abstract class Account implements Transactional {

    private final String accountNumber;
    private final String accountHolder;
    private double balance;
    private final String pin;

    public Account(String accountNumber, String accountHolder,
                   double initialBalance, String pin) {

        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = Math.max(initialBalance, 0.0);
        this.pin = pin;
    }

    // Getters
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public boolean validatePin(String inputPin) {
        return this.pin.equals(inputPin);
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean deposit(double amount) {

        if (amount <= 0) {
            System.out.println("[ERROR] Deposit amount must be greater than zero.");
            return false;
        }

        balance += amount;

        System.out.printf(
                "[SUCCESS] Deposited %.2f into %s. New Balance: %.2f%n",
                amount,
                accountNumber,
                balance
        );

        return true;
    }

    public boolean transfer(Account targetAccount, double amount) {

        if (targetAccount == null) {
            System.out.println("[ERROR] Recipient account does not exist.");
            return false;
        }

        if (this.getAccountNumber()
                .equalsIgnoreCase(targetAccount.getAccountNumber())) {

            System.out.println("[ERROR] Cannot transfer money to the same account.");
            return false;
        }

        if (this.withdraw(amount)) {

            targetAccount.deposit(amount);

            System.out.printf(
                    "[SUCCESS] Successfully transferred $%.2f to %s (%s)%n",
                    amount,
                    targetAccount.getAccountHolder(),
                    targetAccount.getAccountNumber()
            );

            return true;
        }

        return false;
    }

    @Override
    public abstract boolean withdraw(double amount);

    public abstract void applyMonthlyProcess();

    public void displayAccountInfo() {

        System.out.println("\n---------------------------------");
        System.out.println(" Account Number : " + accountNumber);
        System.out.println(" Account Holder : " + accountHolder);

        System.out.printf(
                " Current Balance: $%.2f%n",
                balance
        );

        System.out.println("---------------------------------");
    }
}

// ============================================================================
// 2. INHERITANCE & POLYMORPHISM
// ============================================================================

class SavingsAccount extends Account {

    private static final double MINIMUM_BALANCE = 500.0;
    private static final double ANNUAL_INTEREST_RATE = 0.04;

    public SavingsAccount(
            String accountNumber,
            String accountHolder,
            double initialBalance,
            String pin) {

        super(accountNumber, accountHolder, initialBalance, pin);
    }

    @Override
    public boolean withdraw(double amount) {

        if (amount <= 0) {
            System.out.println(
                    "[ERROR] Withdrawal amount must be greater than zero."
            );
            return false;
        }

        if (getBalance() - amount < MINIMUM_BALANCE) {

            System.out.printf(
                    "[ERROR] Transaction Declined: Savings Account must maintain a minimum balance of $%.2f%n",
                    MINIMUM_BALANCE
            );

            return false;
        }

        setBalance(getBalance() - amount);

        System.out.printf(
                "[SUCCESS] Withdrew %.2f from %s. Remaining Balance: %.2f%n",
                amount,
                getAccountNumber(),
                getBalance()
        );

        return true;
    }

    @Override
    public void applyMonthlyProcess() {

        double monthlyInterest =
                getBalance() * (ANNUAL_INTEREST_RATE / 12);

        deposit(monthlyInterest);

        System.out.printf(
                "[INFO] Applied monthly interest of $%.2f to Savings Account %s%n",
                monthlyInterest,
                getAccountNumber()
        );
    }
}

class CheckingAccount extends Account {

    private final double overdraftLimit;

    public CheckingAccount(
            String accountNumber,
            String accountHolder,
            double initialBalance,
            String pin,
            double overdraftLimit) {

        super(accountNumber, accountHolder, initialBalance, pin);

        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public boolean withdraw(double amount) {

        if (amount <= 0) {
            System.out.println(
                    "[ERROR] Withdrawal amount must be greater than zero."
            );
            return false;
        }

        if (getBalance() - amount < -overdraftLimit) {

            System.out.printf(
                    "[ERROR] Transaction Declined: Exceeds overdraft limit of $%.2f%n",
                    overdraftLimit
            );

            return false;
        }

        setBalance(getBalance() - amount);

        System.out.printf(
                "[SUCCESS] Withdrew %.2f from %s. Remaining Balance: %.2f%n",
                amount,
                getAccountNumber(),
                getBalance()
        );

        return true;
    }

    @Override
    public void applyMonthlyProcess() {

        if (getBalance() < 0) {

            double penaltyFee = 15.0;

            setBalance(getBalance() - penaltyFee);

            System.out.printf(
                    "[WARNING] Overdraft fee of $%.2f charged to Checking Account %s%n",
                    penaltyFee,
                    getAccountNumber()
            );
        }
    }
}

// ============================================================================
// 3. BANK SERVICE
// ============================================================================

class BankService {

    // FIX:
    // Use generics here.
    private final List<Account> accounts = new ArrayList<>();

    public void addAccount(Account account) {

        accounts.add(account);

        System.out.println(
                "[SUCCESS] Registered account [" +
                        account.getAccountNumber() +
                        "] for " +
                        account.getAccountHolder()
        );
    }

    public Account findAccount(String accountNumber) {

        for (Account acc : accounts) {

            if (acc.getAccountNumber()
                    .equalsIgnoreCase(accountNumber)) {

                return acc;
            }
        }

        return null;
    }

    public void processMonthlyMaintenance() {

        System.out.println(
                "\n--- Processing Monthly Interest & Maintenance ---"
        );

        for (Account acc : accounts) {
            acc.applyMonthlyProcess();
        }
    }
}

// ============================================================================
// 4. MAIN ENTRY POINT
// ============================================================================

public class Bankingsystem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BankService bank = new BankService();

        // Demo accounts
        bank.addAccount(
                new SavingsAccount(
                        "ACC101",
                        "Alice Smith",
                        1200.0,
                        "1234"
                )
        );

        bank.addAccount(
                new CheckingAccount(
                        "ACC102",
                        "Bob Jones",
                        300.0,
                        "5678",
                        200.0
                )
        );

        while (true) {

            System.out.println("\n=================================");
            System.out.println("   WELCOME TO BSK BANK ");
            System.out.println("=================================");
            System.out.println("1. Existing Account Holder (Login)");
            System.out.println("2. Create New Account");
            System.out.println("3. Run Monthly Maintenance (Bank Admin)");
            System.out.println("4. Exit");

            System.out.print("Select an option (1-4): ");

            int choice = readInt(scanner);

            switch (choice) {

                case 1:
                    loginAndHandleAccount(scanner, bank);
                    break;

                case 2:
                    handleNewAccountCreation(scanner, bank);
                    break;

                case 3:
                    bank.processMonthlyMaintenance();
                    break;

                case 4:
                    System.out.println(
                            "\nThank you for choosing OOP Banking System. Have a great day!"
                    );

                    scanner.close();
                    return;

                default:
                    System.out.println(
                            "[ERROR] Invalid choice. Please enter a number between 1 and 4."
                    );
            }
        }
    }

    // ========================================================================
    // LOGIN
    // ========================================================================

    private static void loginAndHandleAccount(
            Scanner scanner,
            BankService bank) {

        System.out.print("\nEnter Account Number: ");

        String accNum = scanner.nextLine().trim();

        Account account = bank.findAccount(accNum);

        if (account == null) {

            System.out.println("[ERROR] Account not found!");

            return;
        }

        System.out.print("Enter 4-digit PIN: ");

        String pin = scanner.nextLine().trim();

        if (!account.validatePin(pin)) {

            System.out.println(
                    "[ERROR] Authentication Failed: Invalid PIN."
            );

            return;
        }

        boolean activeSession = true;

        while (activeSession) {

            System.out.println(
                    "\n--- Session: " +
                            account.getAccountHolder() +
                            " (" +
                            account.getAccountNumber() +
                            ") ---"
            );

            System.out.println("1. Deposit / Credit");
            System.out.println("2. Withdraw / Debit");
            System.out.println("3. Transfer Money");
            System.out.println("4. Account Details & Balance");
            System.out.println("5. Logout");

            System.out.print("Select option: ");

            int choice = readInt(scanner);

            switch (choice) {

                case 1:

                    System.out.print("Enter deposit amount: $");

                    double depAmount = readDouble(scanner);

                    account.deposit(depAmount);

                    break;

                case 2:

                    System.out.print("Enter withdrawal amount: $");

                    double withAmount = readDouble(scanner);

                    account.withdraw(withAmount);

                    break;

                case 3:

                    System.out.print("Enter target Account Number: ");

                    String targetAccNum =
                            scanner.nextLine().trim();

                    Account targetAcc =
                            bank.findAccount(targetAccNum);

                    System.out.print("Enter transfer amount: $");

                    double xferAmount =
                            readDouble(scanner);

                    account.transfer(targetAcc, xferAmount);

                    break;

                case 4:

                    account.displayAccountInfo();

                    break;

                case 5:

                    System.out.println(
                            "Logged out successfully."
                    );

                    activeSession = false;

                    break;

                default:

                    System.out.println(
                            "[ERROR] Invalid option selection."
                    );
            }
        }
    }

    // ========================================================================
    // CREATE ACCOUNT
    // ========================================================================

    private static void handleNewAccountCreation(
            Scanner scanner,
            BankService bank) {

        System.out.println("\n--- Open a New Account ---");

        System.out.print(
                "Enter Desired Account Number (e.g., ACC103): "
        );

        String accNum = scanner.nextLine().trim();

        if (bank.findAccount(accNum) != null) {

            System.out.println(
                    "[ERROR] Account creation failed: Account number already exists."
            );

            return;
        }

        System.out.print("Enter Full Name: ");

        String name = scanner.nextLine().trim();

        System.out.print("Create a 4-digit PIN: ");

        String pin = scanner.nextLine().trim();

        System.out.println("Select Account Type:");
        System.out.println("1. Savings Account ($500 Min Balance)");
        System.out.println("2. Checking Account ($200 Overdraft Limit)");

        System.out.print("Choice: ");

        int type = readInt(scanner);

        System.out.print("Enter Initial Deposit Amount: $");

        double initialDeposit = readDouble(scanner);

        if (type == 1) {

            if (initialDeposit < 500.0) {

                System.out.println(
                        "[ERROR] Savings account creation failed: Must deposit at least $500."
                );

                return;
            }

            bank.addAccount(
                    new SavingsAccount(
                            accNum,
                            name,
                            initialDeposit,
                            pin
                    )
            );

        } else if (type == 2) {

            bank.addAccount(
                    new CheckingAccount(
                            accNum,
                            name,
                            initialDeposit,
                            pin,
                            200.0
                    )
            );

        } else {

            System.out.println(
                    "[ERROR] Invalid account type selected."
            );
        }
    }

    // ========================================================================
    // INPUT HELPERS
    // ========================================================================

    private static int readInt(Scanner scanner) {

        try {

            return Integer.parseInt(
                    scanner.nextLine().trim()
            );

        } catch (NumberFormatException e) {

            return -1;
        }
    }

    private static double readDouble(Scanner scanner) {

        try {

            return Double.parseDouble(
                    scanner.nextLine().trim()
            );

        } catch (NumberFormatException e) {

            return 0.0;
        }
    }
}
