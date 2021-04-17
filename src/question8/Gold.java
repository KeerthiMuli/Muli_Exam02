/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question8;

/**
 *
 * @author Keerthi Muli
 */
public class Gold extends Platinum {

    public Gold(double grams, double costPerGram, int hallMarkId) {
        super(grams, costPerGram, hallMarkId);
        System.out.println("Inside Gold Constructor");
    }
   
    @Override
    public double price(){
        System.out.println("Inside Gold Price");
        return super.price();
    }
    @Override
    public String toString() {
        System.out.println("Inside Gold toString");
        return super.toString();
    }
    
    
}
