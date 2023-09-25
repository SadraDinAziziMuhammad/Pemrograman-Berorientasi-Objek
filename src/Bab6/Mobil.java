/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab6;

/**
 *
 * @author sadra
 */
public class Mobil extends Kendaraan{
private String nama, jenis;  
Mobil(String nama){
super("Mobil");
this.nama = nama;
jenis = "belum teridentifikasi";
}
 
Mobil(String nama, String jenis){
super("Mobil");
this.nama = nama;
this.jenis = jenis;
}
 
void informasi(){
System.out.println("Nama pesawat adalah\t: " + this.nama);
System.out.println("Jenis pesawat adalah\t: " + this.jenis);
System.out.println();
}
}
