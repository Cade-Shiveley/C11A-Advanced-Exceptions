public class NegativeBalanceException extends Exception{
    public NegativeBalanceException(double negativeBalance){
        super(negativeBalance);

    }
}