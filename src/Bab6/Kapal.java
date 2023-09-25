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
public class Kapal extends Kendaraan{
private String nama, jenis;
 	
Kapal(String nama){
super("Kapal");
this.nama = nama;
jenis = "belum teridentifikasi";
}
 
Kapal(String nama, String jenis){
super("Kapal");
this.nama = nama;
this.jenis = jenis;
}
void informasi(){
System.out.println("Nama pesawat adalah\t: " + this.nama);
System.out.println("Jenis pesawat adalah\t: " + this.jenis);
System.out.println();
}
}
