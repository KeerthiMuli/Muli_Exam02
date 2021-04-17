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
public class International extends Flight{
    private int numberOfPassengers;
    private double ticketCost;

    public International(int numberOfPassengers, double ticketCost,
            int flightId, String flightName, String ownerFirstName, 
            String ownerLastName) {
        super(flightId, flightName, ownerFirstName, ownerLastName);
        this.numberOfPassengers = numberOfPassengers;
        this.ticketCost = ticketCost;
        System.out.println("This is Internationl Constructor");
    }


    public int getNumberOfPassengers() {
        System.out.println("This is Internationl getNumberOfPassengers");
        return numberOfPassengers;
    }

    public double getTicketCost() {
        System.out.println("This is Internationl getTicketCost");
        return ticketCost;
    }

    @Override
    public String getOwnerFullName(){
       System.out.println("This is Internationl getOwnerFullName"); 
      return super.getOwnerFirstName()+" "+super.getOwnerLastName();
    }
   public double incomeFromFlight(){
       System.out.println("This is Internationl incomeFromFlight"); 
      return  numberOfPassengers * ticketCost;
   } 

    @Override
    public String toString() {
         System.out.println("This is Internationl toString"); 
        return super.toString()+" "+"OwnerName: "+getOwnerFullName()+" "+
                "TotalIncome: "+
                incomeFromFlight();}
   
}
