package Packages;
import java.util.Random;

public class BankAccount {
    public String name;
    public String accountType; // Using camelCase for naming conventions
    private String password;
    String user;

    public BankAccount() {
        this.password = generateRandomPassword();
    }

    // Getter to access private password
    public String getPassword() {
        return this.password;
    }

    // Setter to modify private password
    protected void setPassword(String pass) {
        this.password = pass;
    }

    // Private helper method to generate password
    private String generateRandomPassword() {
        Random random = new Random();
        int randomNum = 100000 + random.nextInt(900000); // Generates 6-digit random number
        return String.valueOf(randomNum);
    }
}