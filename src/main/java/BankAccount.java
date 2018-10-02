//import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 5.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/5/">Lab 5 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */

    /**
     *
     */
    public enum BankAccountType {
        /**
         *
         */
        CHECKINGS,
        /**
         *
         */
        SAVINGS,
        /**
         *
         */
        STUDENT,
        /**
         *
         */
        WORKPLACE
    }

    /**
     * The account number of this bank account.
     */
    private int accountNumber;
    /**
     * The type of the account.
     */
    private BankAccountType accountType;
    /**
     * The balance of the account.
     */
    private double accountBalance;
    /**
     * The name of the owner of the account.
     */
    private String ownerName;
    /**
     * The interest rate of the account.
     */
    private double interestRate;
    /**
     * The interest earned on this account.
     */
    private double interestEarned;


    /**
     * The constructor of a BankAccount object.
     * @param name The name of the bank account.
     * @param accountCategory The category of the bank account.
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        this.ownerName = name;
        this.accountType = accountCategory;
        Bank.incrementTotalAccounts();
    }

    /**
     *
     * @return The number of the account.
     */
    public int getAccountNumber() {
        return this.accountNumber;
    }

    /**
     *
     * @return The type of the account.
     */
    public BankAccountType getAccountType() {
        return this.accountType;
    }

    /**
     *
     * @return The balance of the account.
     */
    public double getAccountBalance() {
        return this.accountBalance;
    }

    /**
     *
     * @return The name of the owner of the account.
     */
    public String getOwnerName() {
        return this.ownerName;
    }

    /**
     *
     * @return The interest earned on the account.
     */
    public double getInterestEarned() {
        return this.interestEarned;
    }

    /**
     *
     * @param newAccountNumber The new account number to set for the account.
     */
    public void setAccountNumber(final int newAccountNumber) {
        this.accountNumber = newAccountNumber;
    }

    /**
     *
     * @param newAccountType The new type of the account.
     */
    public void setAccountType(final BankAccountType newAccountType) {
        this.accountType = newAccountType;
    }

    /**
     *
     * @param newAccountBalance The new account balance to set for the account.
     */
    public void setAccountBalance(final double newAccountBalance) {
        this.accountBalance = newAccountBalance;
    }

    /**
     *
     * @param newOwnerName The name of the new owner of the account.
     */
    public void setOwnerName(final String newOwnerName) {
        this.ownerName = newOwnerName;
    }

    /**
     *
     * @param newInterestEarned The new interest earned to set for the account.
     */
    public void setInterestEarned(final int newInterestEarned) {
        this.interestEarned = newInterestEarned;
    }

}
