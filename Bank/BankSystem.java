package Bank;

public class BankSystem {
    public static void main(String[] args) {
        BankBranch mainBranch = new BankBranch("B001", "Main Branch");

        Customer customerAlice = new Customer("C001", "Alice");
        System.out.println("Customer Created: " + customerAlice.getName() + " [Customer ID: " + customerAlice.getCustomerId() + "]");

        mainBranch.registerCustomer(customerAlice);

        SavingsAccount aliceSavingsAccount = new SavingsAccount("S001", 5000.0);
        CurrentAccount aliceCurrentAccount = new CurrentAccount("C001", 2000.0);

        System.out.println("Savings Account [S001] opened with initial balance: 5000.0");
        System.out.println("Current Account [C001] opened with initial balance: 2000.0 and overdraft limit 2000.0");

        customerAlice.addNewAccount(aliceSavingsAccount);
        customerAlice.addNewAccount(aliceCurrentAccount);

        aliceSavingsAccount.depositAmount(2000.0);
        System.out.println("Deposited 2000.0 to Savings Account [S001]");
        System.out.println("Current Balance: " + aliceSavingsAccount.getAccountBalance());

        aliceCurrentAccount.withdrawAmount(2500.0);
        System.out.println("Withdrawn 2500.0 from Current Account [C001]");
        System.out.println("Current Balance: " + aliceCurrentAccount.getAccountBalance());

        aliceSavingsAccount.transferAmount(aliceCurrentAccount, 1000.0);
        System.out.println("Transferred 1000.0 from Savings to Current Account");
        System.out.println("Savings Balance: " + aliceSavingsAccount.getAccountBalance());
        System.out.println("Current Balance: " + aliceCurrentAccount.getAccountBalance());

        System.out.println("\nTransaction History:");
        aliceSavingsAccount.displayTransactionHistory();
        aliceCurrentAccount.displayTransactionHistory();
    }
}
