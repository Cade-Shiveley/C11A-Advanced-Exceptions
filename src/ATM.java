/*
 * Class: CSCI 306 Software engineering: The purpose of this class is to create the ATM class and hanlde two different try and catch exceptions one for normal and one for quick withdraw
 * Authors: Cade Shiveley & Luke Bell
 * Date: 10/6/2025
 * Collaborators: None
 * Sources: None
 */

public class ATM{
    //initializes bank account with 500
    BankAccount account = new BankAccount(500);

    public void handleTransactions(){
        try{
            //withdraws normal 600 not quick
            account.withdraw(600);
            //if 
        }catch(NegativeBalanceException e){
            //prints given messages
            System.out.println(e);
            System.out.println(e.getMessage());
        }
        try{
            //withdraws quick 600
            account.quickWithdraw(600);
        }catch(NegativeBalanceException e){
            //prints give messages
            System.out.println(e);
            System.out.println(e.getMessage());

        }
    }
    //main 
public static void main(String[] args) {
        ATM atm = new ATM();
        atm.handleTransactions();
    }

}
