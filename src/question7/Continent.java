/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question7;

/**
 *
 * @author Keerthi Muli
 */
public class Continent {
    public void numberOfCountries(EnumContinents cont) {
        if (cont == EnumContinents.ASIA) {
      System.out.println("Number Of Countries in Asia: "+
              EnumContinents.ASIA.getNumberOfCountries());
        } else if (cont == EnumContinents.AFRICA) {
            System.out.println("Number Of Countries in Africa: "+
              EnumContinents.AFRICA.getNumberOfCountries());
        } else if (cont == EnumContinents.EUROPE) {
            System.out.println("Number Of Countries in Africa: "+
                    EnumContinents.AFRICA.getNumberOfCountries());
        }else if (cont == EnumContinents.NORTHAMERICA) {
         System.out.println("Number Of Countries in NorthAmerica: "+
                 EnumContinents.NORTHAMERICA.getNumberOfCountries());
        } 
        else if (cont == EnumContinents.SOUTHAMERICA) {
            System.out.println("Number Of Countries in SouthAmerica: "+
                    EnumContinents.SOUTHAMERICA.
                    getNumberOfCountries());
        } 
        else if (cont == EnumContinents.AUSTRALIA) {
            System.out.println("Number Of Countries in Australia: "+
                    EnumContinents.AUSTRALIA.
                    getNumberOfCountries());
        }       
        else {
            System.out.println("Number Of Countries in Antarctica: "+
                    EnumContinents.ANTARCTICA.
                    getNumberOfCountries());
        }
    }
    
}
