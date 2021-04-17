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
public class State {
    public void numberOfRivers(EnumStates sta) {
        if (sta == EnumStates.TELANGANA) {
      System.out.println("Number Of Rivers in Telangana: "+
              EnumStates.TELANGANA.getNumberOfRivers());
        } else if (sta == EnumStates.TAMILNADU) {
            System.out.println("Number Of Rivers in TamilNadu: "+
              EnumStates.TAMILNADU.getNumberOfRivers());
        } else {
            System.out.println("Number Of Rivers in AndhraPradesh: "+
                    EnumStates.ANDHRAPRADESH.getNumberOfRivers());

    }  
}
}