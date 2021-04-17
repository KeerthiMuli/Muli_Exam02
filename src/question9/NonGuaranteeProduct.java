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
public class NonGuaranteeProduct extends GuaranteeProduct {

    public NonGuaranteeProduct(int prodId, String prodName, String prodBrandName, 
            int price, int numberOfProductsPurchased) {
        super(prodId, prodName, prodBrandName, price, numberOfProductsPurchased);
        System.out.println("This is NonGuaranteeProduct Constructor ");
    }

    @Override
    public String toString() {
        System.out.println("This is  NonGuaranteeProduct toString");
        return super.getProductDetails()+", Total Non Guarantee Products Price: "+
                super.getProductPrice()+ ", Maximum Durability of the product: "
                +MAX_DURABILITY;
    }
       
    
}
