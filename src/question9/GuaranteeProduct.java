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
public class GuaranteeProduct implements Product{
    private int prodId;
    private String prodName;
    private String prodBrandName;
    private int price;
    private int numberOfProductsPurchased;

    public GuaranteeProduct(int prodId, String prodName, String prodBrandName, 
            int price, int numberOfProductsPurchased) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.prodBrandName = prodBrandName;
        this.price = price;
        this.numberOfProductsPurchased = numberOfProductsPurchased;
        System.out.println("This is GuaranteeProduct Constructor ");
    }

   
    
    @Override
    public String getProductDetails() {
        System.out.println("This is  GuaranteeProduct getProductDetails ");
         return "Product Id: "+prodId+",Product Name: "+prodName+
                ",Product Brand Name: "+prodBrandName;
        
    }

    @Override
    public double getProductPrice() {
        System.out.println("This is  GuaranteeProduct getProductPrice ");
        return numberOfProductsPurchased *price;
    }

    @Override
    public String toString() {
        System.out.println("This is  GuaranteeProduct toString");
        return getProductDetails()+ ", Total Guarantee Products Price: "+
                getProductPrice()+
                 ", Maximum Guarantee Of a Product in Years:"
                + MAXIMUM_GURANTEE_YEARS;
    }
      
}
