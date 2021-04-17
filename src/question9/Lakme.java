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
public class Lakme implements CosmeticBrand {
    private String brandEndorserFirstName;
    private String brandEndorserLastName;
    private double quantity;

    public Lakme(String brandEndorserFirstName, String brandEndorserLastName, 
            double quantity) {
        this.brandEndorserFirstName = brandEndorserFirstName;
        this.brandEndorserLastName = brandEndorserLastName;
        this.quantity = quantity;
        System.out.println("This is Lakme Constructor");
    }

    public String getBrandEndorserFirstName() {
        System.out.println("This is Lakme getBrandEndorserFirstName");
        return brandEndorserFirstName;
    }

    public String getBrandEndorserLastName() {
        System.out.println("This is Lakme getBrandEndorserLastName");
        return brandEndorserLastName;
    }
  
    @Override
   public String getBrandEndorserFullName(){
       System.out.println("This is Lakme getBrandEndorserFullName");
       return brandEndorserLastName+ "," +brandEndorserFirstName;
   }
    @Override
    public double totalProductPrice(){
        System.out.println("This is Lakme totalProductPrice");
        return quantity * PRICE_PER_QUANTITY;
    }
    @Override
    public String toString() {
        System.out.println("This is Lakme toString");
        return "BrandEndorser: "+getBrandEndorserFullName()+ 
                " TotalProductPrice: " +totalProductPrice();
    }
    
}
