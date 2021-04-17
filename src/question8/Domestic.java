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
public class Domestic extends International{

    public Domestic(int numberOfPassengers, double ticketCost, int flightId, 
            String flightName, String ownerFirstName, String ownerLastName) {
        super(numberOfPassengers, ticketCost, flightId, flightName, 
                ownerFirstName, ownerLastName);
        System.out.println("Inside Domestic Constuctor");
    }
    
     @Override
    public String getOwnerFullName(){
       System.out.println("This is Domestic getOwnerFullName"); 
      return super.getOwnerLastName()+" ,"+super.getOwnerFirstName();
    }

    @Override
    public String toString() {
        System.out.println("Inside Domestic toString");
        return super.toString();
    }
    
}
