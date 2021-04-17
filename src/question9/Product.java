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
public interface Product {
    public static final int MAXIMUM_GURANTEE_YEARS = 10;
    public static final String MAX_DURABILITY ="No Guarantee";
    default String getProductDetails(){
        return "This method is used to display Product Details";
    }
    public abstract double getProductPrice();
    
}
