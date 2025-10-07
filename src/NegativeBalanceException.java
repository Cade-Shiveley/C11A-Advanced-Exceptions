import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class NegativeBalanceException extends Exception {
    private double negativeBalance;

    public NegativeBalanceException() {
        super("Error: negative balance");
        this.negativeBalance = 0.0;
    }

    public NegativeBalanceException(double negativeBalance) {
        super("Amount exceeds balance by " + negativeBalance);
        this.negativeBalance = negativeBalance;

        try (PrintWriter writer = new PrintWriter(new FileWriter("logfile.txt", true))) {
            writer.println("Amount exceeds balance by " + negativeBalance);
        } catch (IOException e) {
            System.err.println("Failed to write to logfile: " + e.getMessage());
        }
    }
}