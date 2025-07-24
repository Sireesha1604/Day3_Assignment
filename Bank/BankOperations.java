package Bank;

public interface BankOperations {
    void depositAmount(double depositValue);
    void withdrawAmount(double withdrawalValue);
    void transferAmount(Account targetAccount, double transferValue);
    double getAccountBalance();
    void displayTransactionHistory();
}
