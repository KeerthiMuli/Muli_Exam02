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
public class Brand {
     private String brandName;
    private String brandAmbassadorFirstName;
     private String brandAmbassadorLastName;
    private int brandID;

    public Brand(String brandName, String brandAmbassadorFirstName, 
        String brandAmbassadorLastName, int brandID) {
        this.brandName = brandName;
        this.brandAmbassadorFirstName = brandAmbassadorFirstName;
        this.brandAmbassadorLastName = brandAmbassadorLastName;
        this.brandID = brandID;
         System.out.println("Inside Brand Constructor");
    }
     public int getBrandID() {
        System.out.println("Inside Brand getBrandID");
        return brandID;
    }
    public String getBrandName() {
       System.out.println("Inside Brand getBrandName");
        return brandName;
    }
    public String getBrandAmbassadorFirstName() {
        System.out.println("Inside Brand getBrandAmbassadorFirstName");
        return brandAmbassadorFirstName;
    }

    public String getBrandAmbassadorLastName() {
        System.out.println("Inside Brand getBrandAmbassadorLastName");
        return brandAmbassadorLastName;
    }
    public String getFullName(){
        System.out.println("Inside Brand getFullName");
        return brandAmbassadorFirstName+" "+brandAmbassadorLastName;
    }

  
    @Override
    public String toString() {
         System.out.println("This is Brand toString");
        return "BrandId: "+brandID+" ,"+"BrandName: "+brandName+" ,"+
                "BrandAmbassadorFullName: "+getFullName();
    }
  
    
}
