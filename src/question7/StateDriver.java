/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question7;

import java.util.Scanner;

/**
 *
 * @author Keerthi Muli
 */
public class StateDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.println("Answer For Question 7: Keerthi Muli");
        System.out.print("Enter the State Name:");
        String enteredState = in.nextLine();
        State stat = new State();
        if (enteredState.equalsIgnoreCase("TELANGANA")) {
            stat.numberOfRivers(EnumStates.TELANGANA);
        } else if (enteredState.equalsIgnoreCase("TAMILNADU")) {
           stat.numberOfRivers(EnumStates.TAMILNADU);
    }
        else{
            stat.numberOfRivers(EnumStates.ANDHRAPRADESH);
        }
    
}
}
