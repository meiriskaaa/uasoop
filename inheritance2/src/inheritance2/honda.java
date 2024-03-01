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
public class honda extends mobil {
    private String bahanbakar;
    
public honda (String merk, String warna, String jenis, String bahanbakar){
    super (merk, warna, jenis);
    this.bahanbakar = bahanbakar;
}

public void viewhonda(){
    System.out.println("Bahan Bakar: "+bahanbakar);
    System.out.println("************************");
}   
    
}
