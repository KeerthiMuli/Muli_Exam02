/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question7;

import java.util.Scanner;

/**
 *
 * @author S541906
 */
public class ContinentDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.println("Answer For Question 7: Keerthi Muli");
        System.out.print("Enter the Continent Name:");
        String enteredContinent = in.nextLine();
        Continent con = new Continent();
        if (enteredContinent.equalsIgnoreCase("ASIA")) {
            con.numberOfCountries(EnumContinents.ASIA);
        } else if (enteredContinent.equalsIgnoreCase("AFRICA")) {
            con.numberOfCountries(EnumContinents.AFRICA);
        } else if (enteredContinent.equalsIgnoreCase("EUROPE")) {
            con.numberOfCountries(EnumContinents.EUROPE);
        }
         else if (enteredContinent.equalsIgnoreCase("NORTHAMERICA")) {
            con.numberOfCountries(EnumContinents.NORTHAMERICA);
         }
          else if (enteredContinent.equalsIgnoreCase("SOUTHAMERICA")) {
            con.numberOfCountries(EnumContinents.SOUTHAMERICA);
         }
         else if (enteredContinent.equalsIgnoreCase("AUSTRALIA")) {
            con.numberOfCountries(EnumContinents.AUSTRALIA);
         }
        else {
            con.numberOfCountries(EnumContinents.ANTARCTICA);
        }

    }
    }
    

