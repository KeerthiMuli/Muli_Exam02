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
public class OrganizationBrand extends PersonalBrand {

    public OrganizationBrand(String brandName, String brandAmbassadorFirstName,
    String brandAmbassadorLastName, int brandID, int quantity, double price) {
        super(brandName, brandAmbassadorFirstName, brandAmbassadorLastName,
                brandID, quantity, price);
   System.out.println("Inside OrganizationBrand Constructor");
    }
      @Override
    public String getFullName(){
        System.out.println("Inside OrganiztionBrand getFullName");
        return super.getBrandAmbassadorFirstName()+" "+super.
                getBrandAmbassadorLastName();
    }
    @Override
    public double revenue() {
        System.out.println("Inside OrganiztionBrand revenue");
        return super.revenue();
    }
    @Override
    public String toString(){
        System.out.println("Inside OrganiztionBrand tostring");
        return super.toString();
    }
    

    
}
