/*
 * Class: CSCI 306 Software engineering: The purpose of this class is to create the bank account and it's following methods along with exceptions
 * Authors: Cade Shiveley & Luke Bell
 * Date: 10/6/2025
 * Collaborators: None
 * Sources: None
 */


public class BankAccount{
    //initializes balance
    private double balance;

    public BankAccount(double balance){
        this.balance = balance;
    }
    public void withdraw(double normal) throws NegativeBalanceException {
        //if normal is greater than balance returns the negative
        if (normal > balance) {
            throw new NegativeBalanceException(balance-normal);
        }
        else{
            //subtracts normal withdraw from balance if else
            balance = balance - normal;
        }


}

    public void quickWithdraw(double quick) throws NegativeBalanceException{
        //if quick is greater than balance returns negative
        if (quick > balance){
            throw new NegativeBalanceException();
        }
        else{
            //subtracts quick withdraw from balance if else
            balance = balance - quick;
        }
    }
}