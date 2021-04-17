/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question5;

/**
 *
 * @author Keerthi Muli
 */
public class PersonDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer For Question 5: Keerthi Muli");
        Person per = new Person("Keerthi Muli", "Hyderabad", 
                "9542091742", 
                "keerthi.11rdy@gmail.com");
        System.out.println("\n"+per);
        
        Student stu = new Student(3.8, "Aparna Muli", 
                "Bangalore", "9014956300", 
                "aparnamuli@gmail.com");
        System.out.println("\n"+stu);
        Employee emp = new Employee("Capgemini", 45000, 
                "12/21/2016", 
                "Srujala Muli", 
                "Chennai", "9652366956", "srujalamuli@gmail.com");
        System.out.println("\n"+emp);
        
        Staff sta = new Staff("Teaching Assistant", 
                "Edurekha Training Center", 
                50000, "03/15/2018",
                "Gayathri Muli", "Mumbai", "9000721788", 
                "gayathrimuli@gmail.com");
        System.out.println("\n"+sta);
        
        
        Faculty fac = new Faculty("10:00AM - 7:30 PM", 5, 
                "Udemy Training Center", 55000, "01/11/2017", 
                "Vijaya Muli", "Pune", "8985182549", "vijayamuli@gmail.com");
        System.out.println("\n"+fac);
    }
    
}
