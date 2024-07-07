import java.util.Scanner;

public class ATMinterface {
    private BankAccount account;
    private Scanner scanner;

    public ATMinterface(BankAccount account) {
        this.account = account;
        this.scanner = new Scanner(System.in);
    }


    // user interface of the ATM

    public void start() {
        boolean running = true;
        while (running) {
            System.out.println("Welcome to the ATM!");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Please choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    running = false;
                    System.out.println("Thank you for using the ATM. Goodbye! 😊😊");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }



    // Different methods to perform tasks on ATM

    private void checkBalance() {

        System.out.println("Current balance: " + account.getBalance());
    }

    private void deposit() {
        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();
        account.deposit(amount);
    }

    private void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();
        account.withdraw(amount);
    }
}
