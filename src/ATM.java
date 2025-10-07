public class ATM{
    BankAccount account = new BankAccount(500);

    public void handleTransactions(){
        try{
            //withdraws normal 600 not quick
            account.withdraw(600);
            //if 
        }catch(NegativeBalanceException e){
            System.out.println(e);
            System.out.println(e.getMessage());
        }
        try{
            //withdraws quick 600
            account.quickWithdraw(600);
        }catch(NegativeBalanceException e){
            System.out.println(e);
            System.out.println(e.getMessage());

        }
    }
public static void main(String[] args) {
        ATM atm = new ATM();
        atm.handleTransactions();
    }

}
