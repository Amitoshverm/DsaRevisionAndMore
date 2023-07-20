package OOPs;

public class BankAccount {
    private int accountNumber;
    private String customerName;
    private String email;
    private String phoneNumber;
    private double accountBalance;
    public void withDrawFunds(double amount) {
        if (accountBalance - amount < 0) {
            System.out.println("Insufficient funds! You only have "+accountBalance+" left in your account");
        } else {
            accountBalance -= amount;
            System.out.println("Withdrawal of "+amount+" processed,  remaining balance: " + accountBalance);
        }
    }
    public void depositFunds(double amount) {
        accountBalance += amount;
        System.out.println("Deposited: "+amount+
                ", New balance is: "+ accountBalance);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
}
