import java.util.Date;

public class SavingAccount { // public class
    private Date theDate; //private instance variable
    private int accountTotal;//private instance variable
    private Date interestDate;//private instance variable

    public SavingAccount(int deposit)//constructor
    {
        accountTotal = deposit;
        theDate = new Date();
    }
    public int getBalance()
    {
        return accountTotal;
    }
    public Date getDate()
    {
        return theDate;
    }
    private void checkDate()
    {
        interestDate = new Date();
    }
    /*//methods users have access to:
    public int getAccountBalance()//Account information
    {

    }
    public void deposit(int money)
    {

        return;
    }*/

}
