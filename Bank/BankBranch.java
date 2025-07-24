package Bank;

import java.util.*;

public class BankBranch {
    private String branchCode;
    private String branchTitle;
    private List<Customer> customerList;

    public BankBranch(String branchCode, String branchTitle) {
        this.branchCode = branchCode;
        this.branchTitle = branchTitle;
        this.customerList = new ArrayList<>();
        System.out.println("Branch Created: " + branchTitle + " [Branch ID: " + branchCode + "]");
    }

    public void registerCustomer(Customer newCustomer) {
        customerList.add(newCustomer);
        System.out.println("Customer added to branch.");
    }

    public Customer getCustomerById(String customerId) {
        for (Customer customer : customerList) {
            if (customer.getCustomerId().equals(customerId)) {
                return customer;
            }
        }
        return null;
    }

    public void showAllCustomers() {
        System.out.println("Customers in " + branchTitle + ":");
        for (Customer customer : customerList) {
            System.out.println(" - " + customer.getName() + " [ID: " + customer.getCustomerId() + "]");
        }
    }
}
