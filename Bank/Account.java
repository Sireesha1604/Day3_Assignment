package Bank;

import java.util.*;

public abstract class Account implements BankOperations {
    protected String accNumber;
    protected double accBalance;
    protected List<String> accTransactions;

    public Account(String accNumber, double initialAmount) {
        this.accNumber = accNumber;
        this.accBalance = initialAmount;
        this.accTransactions = new ArrayList<>();
    }

    protected void logTransaction(String transactionDetail) {
        accTransactions.add(transactionDetail);
    }

    public void transferAmount(Account targetAccount, double transferAmount) {
        if (this.accBalance >= transferAmount) {
            this.accBalance -= transferAmount;
            targetAccount.accBalance += transferAmount;

            this.logTransaction("Transferred to Account " + targetAccount.accNumber + ": " + transferAmount);
            targetAccount.logTransaction("Received from Account " + this.accNumber + ": " + transferAmount);
        } else {
            System.out.println("Transfer failed: Insufficient balance.");
        }
    }

    public double getAccountBalance() {
        return accBalance;
    }

    public void displayTransactionHistory() {
        System.out.println("Transaction History for Account: " + accNumber);
        for (String transaction : accTransactions) {
            System.out.println(" - " + transaction);
        }
    }
}
