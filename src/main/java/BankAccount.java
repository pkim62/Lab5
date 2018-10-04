import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 5.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/5/">Lab 5 Description</a>
 */
public class BankAccount {
    /**
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        /**
         * checking.
         */
        CHECKINGS,
        /**
         * saving.
         */
        SAVINGS,
        /**
         * HS and college student lyfe.
         */
        STUDENT,
        /**
         * Yfor work.
         */
        WORKPLACE
    }
    /**
     * You may want to use this to distinguish between different kinds of accounts#s.
     */
    private int accountNumber;
    /**
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public BankAccountType accountType;
    /**
     * acc balance.
     */
    private double accountBalance;
    /**
     * owner name.
     */
    private String ownerName;
    /**
     * Intrest rate of bank acc.
     */
    public double interestRate;
    /**
     * You may want to use this to distinguish between different kinds of accounts.
     */
    private double interestEarned;

    /**
     * bank acc class.
     * @param name of owner
     * @param accountCategory category of bank accs
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        /*
         * Implement this function
         */
        accountType = accountCategory;
        ownerName = name;
    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */
    /**
    * it returns acc number bby.
     * @return acc number
     */
    public int getAccountNumber() {
        return accountNumber;
    }
    /**
     * sets acc number.
     * @param a a int to set accnumber to
     */
    public void setAccountNumber(final int a) {
        accountNumber = a;
    }
    /**
     * it returns acc balance bby.
     * @return account balance.
     */
    public double getAccountBalance() {
        return accountBalance;
    }
    /**
     * i sets acc bal.
     * @param b double to set acc bal
     */
    public void setAccountBalance(final double b) {
        accountBalance = b;
    }

    /**
     * @return owners name
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * gets owners name.
     * @param oN new name
     */
    public void setOwnerName(final String oN) {
        this.ownerName = ownerName;
    }

    /**
     * intrest earned.
     * @return all the int earned
     */
    public double getInterestEarned() {
        return interestEarned;
    }

    /**
     * intrest earned.
     * @param ie variable to set to
     */
    public void setInterestEarned(final double ie) {
        interestEarned = ie;
    }
}
