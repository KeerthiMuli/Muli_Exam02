/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question4;

/**
 *
 * @author Keerthi Muli
 */
public class PersonalBrand extends Brand {
    private int sales;
    private double avgPrice;   

    public PersonalBrand(String brandName, String 
        brandAmbassadorFirstName, String brandAmbassadorLastName, int brandID,
        int sales, double avgPrice) {
        super(brandName, brandAmbassadorFirstName, brandAmbassadorLastName, 
        brandID);
        this.sales = sales;
        this.avgPrice = avgPrice;
         System.out.println("Inside PersonalBrand Constructor");
    }
    @Override
    public String getFullName(){
        System.out.println("Inside PersonalBrand getFullName");
        return super.getBrandAmbassadorLastName()+","+
                super.getBrandAmbassadorFirstName();
    }
   public double revenue(){
       System.out.println("Inside PersonalBrand revenue");
       return sales * avgPrice;
   } 

    @Override
    public String toString() {
        System.out.println("Inside PersonalBrand toString");
        return super.toString()+" ,"+"Revenue: "+revenue();
    }
   
    
}
