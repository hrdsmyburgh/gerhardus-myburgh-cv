
public class Credit extends Account {
    private int overdraftLimit;

    public Credit() {
        this("0000000000", 0, 0);
    }

    public Credit(String accountNumber, int balance, int overdraftLimit) {
        super(accountNumber, balance);
        setOverdraftLimit(overdraftLimit);
    }

    public int calculateInterest(int rate) {
        int interest = 0;
        if (getBalance() < getOverdraftLimit())
            interest = getBalance() * 4 * rate / 100;
        else if (getBalance() < 0)
            interest = getBalance() * 2 * rate / 100;
        else
            interest = getBalance() * rate / 100;
        return interest;
    }

    public void setOverdraftLimit(int overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public int getOverdraftLimit() {
        return overdraftLimit;
    }

    public String toString() {
        return super.toString() + " and overdraft limit " + getOverdraftLimit();
    }
}