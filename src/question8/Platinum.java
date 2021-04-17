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
public class Platinum extends Jewellery {
private double grams;
private double costPerGram;

    public Platinum(double grams, double costPerGram, int hallMarkId) {
        super(hallMarkId);
        this.grams = grams;
        this.costPerGram = costPerGram;
        System.out.println("Inside Platinum constructor");
    }

    @Override
    public double price() {
        System.out.println("Inside Platinum price");
       return grams*costPerGram;      
    }
@Override
    public String toString(){
        System.out.println("Inside Platinum toString");
        return super.toString()+" "+"Price: "+price();
    }
    
}
