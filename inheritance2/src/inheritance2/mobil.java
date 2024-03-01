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
public class mobil {
    private String merk;
    private String warna;
    private String jenis;
    
public mobil (String merk, String warna, String jenis){
    this.merk = merk;
    this.warna = warna;
    this.jenis = jenis;
}
public void viewmobil() {
    System.out.println("Merk :"+merk);
    System.out.println("warna :"+warna);
    System.out.println("Jenis :"+jenis);
}   
}
