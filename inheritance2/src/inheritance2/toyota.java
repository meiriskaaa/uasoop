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
public class toyota extends mobil {
    private String kategori;
    
public toyota (String merk, String warna, String jenis, String kategori){
    super (merk, warna, jenis);
    this.kategori = kategori;
}

public void viewtoyota(){
    System.out.println("Kategori: "+kategori);
}   
    
}
