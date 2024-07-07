public class Main {
    public static void main(String[] args) {

        // the main function to calling actions
        BankAccount account = new BankAccount(10000.0); // Initial balance
        ATMinterface atm = new ATMinterface(account);
        atm.start();
    }
}
