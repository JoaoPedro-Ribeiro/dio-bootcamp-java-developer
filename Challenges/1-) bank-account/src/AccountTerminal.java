import java.util.Locale;
import java.util.Scanner;

public class AccountTerminal {

    public static void main(String[] args) throws Exception {
        int accountNumber;
        String accountAgency;
        String clientName;
        double accountBalance;

        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("What is your account number?");
            accountNumber = scanner.nextInt();

            System.out.println("What is your account agency?");
            accountAgency = scanner.next();
            
            scanner.nextLine();

            System.out.println("What is your name?");
            clientName = scanner.nextLine();

            System.out.println("What is your account balance?");
            accountBalance = scanner.nextDouble();

            System.out.println("Hello, " + clientName + ". Thanks for create your account in our bank. Your agency is " + accountAgency + ", your account number is " + accountNumber + " and your current balance of " + accountBalance + " dollars is already available for withdrawal.");
        }
    }
}
