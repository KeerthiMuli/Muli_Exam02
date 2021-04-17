/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

/**
 *
 * @author Keerthi Muli
 */
public class Loan {
    private int loanID;
    private double amount;
    private String bankName;

    public Loan(int loanID, double amount, String bankName) {
        this.loanID = loanID;
        this.amount = amount;
        this.bankName = bankName;
    }

    @Override
    public String toString() {
        return "Loan{" + "loanID=" + loanID + ", amount=" + amount + ", "
                + "bankName=" + bankName + '}';
    }
    
}

    
