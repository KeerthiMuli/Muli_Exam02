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
public enum EnumStates {
    TELANGANA(6),TAMILNADU(10),ANDHRAPRADESH(4);
    private int numberOfRivers;

    private EnumStates(int numberOfRivers) {
        this.numberOfRivers = numberOfRivers;
    }

    public int getNumberOfRivers() {
        return numberOfRivers;
    }    
}
