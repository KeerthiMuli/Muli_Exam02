/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question9;

/**
 *
 * @author Keerthi Muli
 */
public interface CosmeticBrand {
    public static final double PRICE_PER_QUANTITY = 10;
    default String getBrandEndorserFullName(){
       return "This method displays Cosmetic Brand Details";
    }
    public abstract double totalProductPrice();   
}
