/*
 * Class: CSCI 306 Software engineering: THe purpose of this class is to create a negative balance exception
 * Authors: Cade Shiveley & Luke Bell
 * Date: 10/6/2025
 * Collaborators: None
 * Sources: None
 */


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class NegativeBalanceException extends Exception {
    private double negativeBalance;

    public NegativeBalanceException() {
        super("Error: negative balance");
        //stores negative balance 
        this.negativeBalance = 0.0;
    }

    public NegativeBalanceException(double negativeBalance) {
        //super constructor 
        super("Amount exceeds balance by " + negativeBalance);
        this.negativeBalance = negativeBalance;

        //try message that write to the log file
        try (PrintWriter writer = new PrintWriter(new FileWriter("logfile.txt", true))) {
            writer.println("Amount exceeds balance by " + negativeBalance);
        } catch (IOException e) {
            System.err.println("Failed to write to logfile: " + e.getMessage());
        }
    }
}