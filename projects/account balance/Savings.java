public class Savings extends Account {
    private int minimumBalance;

    public int calculateInterest(int rate) {
        int interest = 0;
        if (getBalance() >= getMinimumBalance())
            interest = getBalance() * rate / 100;
        return interest;
    }

    public Savings() {
        this("0000000000", 0, 0);
    }

    public Savings(String accountNumber, int balance, int minimumBalance) {
        super(accountNumber, balance);
        setMinimumBalance(minimumBalance);
    }

    public void setMinimumBalance(int minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

    public int getMinimumBalance() {
        return minimumBalance;
    }

    public String toString() {
        return super.toString() + " and minimum balance " + getMinimumBalance();
    }
}
