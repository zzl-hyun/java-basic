package access;

public class BankAccount {
    private int balance;

    public BankAccount() {
        this.balance = 0;
    }

    public void deposit(int amount) {
        if (isAmountValid(amount)) balance += amount;
        else System.out.println("Invalid amount");
    }

    public void withdraw(int amount) {
        if( isAmountValid(amount) && balance - amount >= 0) balance -= amount;
        else System.out.println("Invalid amount");
    }

    public int getBalance() {
        return balance;
    }

    private boolean isAmountValid(int amount) {
        return amount > 0;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
