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
public enum EnumContinents {
    ASIA(48),AFRICA(54),EUROPE(44),NORTHAMERICA(23),SOUTHAMERICA(12),
    AUSTRALIA(3)
    ,ANTARCTICA(29);
    private int numberOfCountries;

    private EnumContinents(int numberOfCountries) {
        this.numberOfCountries = numberOfCountries;
    }

    public int getNumberOfCountries() {
        return numberOfCountries;
    }
    
}
