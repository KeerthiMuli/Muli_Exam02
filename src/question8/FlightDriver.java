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
public class FlightDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer For Question 8: Keerthi Muli");
        Flight fly = new International(50,5000,10333444,"Indigo",
                "Rakesh","Gangwal");
        System.out.println(fly);
        Flight flies = new Domestic(75,3500,20222555,
                "Air Asia","Tony","Fernandes");
         System.out.println(flies);
    }
    }
    

