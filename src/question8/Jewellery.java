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
public abstract class Jewellery {
    private int hallMarkId;
    
    public Jewellery(int hallMarkId) {
        System.out.println("Inside Jewellery Constructor");
        this.hallMarkId = hallMarkId;
    }
    public int getHallMarkId() {
        System.out.println("Inside Jewellery getHallMarkId");
        return hallMarkId;
    }
    public abstract double price();

    @Override
    public String toString() {
        return  "HallMarkId: " + hallMarkId ;
    }
    
}
