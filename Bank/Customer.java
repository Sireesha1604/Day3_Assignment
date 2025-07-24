package Bank;

import java.util.*;

public class Customer {
    private String id;
    private String fullName;
    private List<Account> accountList;

    public Customer(String id, String fullName) {
        this.id = id;
        this.fullName = fullName;
        this.accountList = new ArrayList<>();
    }

    public void addNewAccount(Account newAccount) {
        accountList.add(newAccount);
    }

    public List<Account> getAllAccounts() {
        return accountList;
    }

    public String getCustomerId() {
        return id;
    }

    public String getName() {
        return fullName;
    }
}
