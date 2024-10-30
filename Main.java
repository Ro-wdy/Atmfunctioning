import java.util.Scanner;  // Import Scanner

public class Main {
    public static void main(String[] args) {
        // User input
        Scanner scanner = new Scanner(System.in);

        SimpleATM atm = new SimpleATM();  // Assuming this class is defined elsewhere

        boolean atmRunning = true;

        // Ask for the user input
        while (atmRunning) {
            System.out.println("Choose a transaction:");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. OK");
            System.out.println("5. Cancel");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Enter the amount to withdraw: ");
                    double withdrawalAmount = scanner.nextDouble();  // Fixed typo
                    atm.withDraw(withdrawalAmount);  // Assuming this method is defined
                    break;

                case 2:
                    System.out.println("Enter the amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    atm.deposit(depositAmount);  // Assuming this method is defined
                    break;

                case 3:
                    atm.checkBalance();  // Assuming this method is defined
                    break;

                case 4:
                    atm.OK();  // Assuming this method is defined
                    break;

                case 5:
                    atm.cancel();  // Assuming this method is defined
                    atmRunning = false;
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();  // Close the scanner to ensure the resource is properly released.
    }
}

