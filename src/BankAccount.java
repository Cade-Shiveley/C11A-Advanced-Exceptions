public class BankAccount{
    private double balance;

    public BankAccount(double balance){
        this.balance = balance;
    }
    public void withdraw(double normal) throws NegativeBalanceException {
        if (normal > balance) {
            throw new NegativeBalanceException(balance-normal);
        }
        else{
            balance = balance - normal;
        }


}

    public void quickWithdraw(double quick) throws NegativeBalanceException{
        if (quick > balance){
            throw new NegativeBalanceException();
        }
        else{
            balance = balance - quick;
        }
    }
}