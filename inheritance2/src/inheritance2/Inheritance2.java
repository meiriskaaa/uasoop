/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance2;

/**
 *
 * @author User
 */
public class Inheritance2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    honda honda = new honda ("HRV","Sage Green","Mewah","solar");
    toyota toyota = new toyota ("AVANZA","Silver","Ekonomis","sport");

honda.viewmobil();
honda.viewhonda();

toyota.viewmobil();
toyota.viewtoyota();
    }
    
}
