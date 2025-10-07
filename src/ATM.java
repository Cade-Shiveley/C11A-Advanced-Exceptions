public class ATM{
    BankAccount account = new BankAccount(500);

    public void handleWithdraw(){
        try{
            //withdraws normal 600 not quick
            normal.withdraw(600);
            //if 
        }catch(NegativeBalanceException e){
            System.out.println(e);
            System.out.println(e.getMessage());
        }

        }
        
        try{
            //withdraws quick 600
            quick.quickWithdraw(600);
        }catch(NegativeBalanceException e){
            System.out.println(e);
            System.out.println(e.getMessage());

    }


}
