package Bank;

public class CurrentAccount extends Account {
    private final double maxOverdraftLimit = 2000.0;

    public CurrentAccount(String accountId, double openingBalance) {
        super(accountId, openingBalance);
    }

    public void depositAmount(double depositValue) {
        accBalance += depositValue;
        logTransaction("Deposited: " + depositValue);
    }

    public void withdrawAmount(double withdrawalValue) {
        if ((accBalance - withdrawalValue) >= -maxOverdraftLimit) {
            accBalance -= withdrawalValue;
            logTransaction("Withdrawn: " + withdrawalValue);
        } else {
            System.out.println("Withdrawal failed: Overdraft limit exceeded.");
        }
    }
}
