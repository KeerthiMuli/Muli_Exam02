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
public class MenWear extends Apparel {
    private String designerFirstName;
    private String designerLastName;   

    public MenWear(String designerFirstName, String designerLastName, 
            double price, String materail, String size) {
        super(price, materail, size);
        this.designerFirstName = designerFirstName;
        this.designerLastName = designerLastName;
        System.out.println("Inside MenWear Constructor");
    }


    public String getDesignerFirstName() {
         System.out.println("Inside Menwear getDesignerFirstName ");
        return designerFirstName;
    }

    public String getDesignerLastName() {
        System.out.println("Inside Menwear getDesignerLastName ");
        return designerLastName;
    }
    public String getFullName(){
        return getDesignerFirstName()+" "+getDesignerLastName();
    }
    @Override
     public String toString() {
        System.out.println("Inside MenWear toString");
        return super.toString()+" ,"+"DesignerFullName: "+getFullName();
    }
    
}
