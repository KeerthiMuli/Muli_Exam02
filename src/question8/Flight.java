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
public abstract class Flight {
    private int flightId;
    private String flightName;
    private String ownerFirstName;
    private String ownerLastName;     

    public Flight(int flightId, String flightName, String ownerFirstName, 
            String ownerLastName) {
        this.flightId = flightId;
        this.flightName = flightName;
        this.ownerFirstName = ownerFirstName;
        this.ownerLastName = ownerLastName;
        System.out.println("Inside Flight Constructor");
    }

    public int getFlightId() {
        System.out.println("Inside Flight getFlightId");
        return flightId;
    }

    public String getFlightName() {
         System.out.println("Inside Flight getFlightName");
        return flightName;
    }

    public String getOwnerFirstName() {
        System.out.println("Inside Flight getOwnerFirstName");
        return ownerFirstName;
    }

    public String getOwnerLastName() {
        System.out.println("Inside Flight getOwnerLastName");
        return ownerLastName;
    }
    public  abstract String getOwnerFullName();

    @Override
    public String toString() {
        return  "FlightId: " + flightId + ", FlightName: " + 
                flightName;}
    
    
}
