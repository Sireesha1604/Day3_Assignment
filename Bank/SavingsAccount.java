package Bank;

public class SavingsAccount extends Account {
    private final double minimumRequiredBalance = 1000.0;

    public SavingsAccount(String accountId, double openingBalance) {
        super(accountId, openingBalance);
    }

    public void depositAmount(double depositValue) {
        accBalance += depositValue;
        logTransaction("Deposited: " + depositValue);
    }

    public void withdrawAmount(double withdrawalValue) {
        if ((accBalance - withdrawalValue) >= minimumRequiredBalance) {
            accBalance -= withdrawalValue;
            logTransaction("Withdrawn: " + withdrawalValue);
        } else {
            System.out.println("Withdrawal failed: Minimum balance required.");
        }
    }
}
