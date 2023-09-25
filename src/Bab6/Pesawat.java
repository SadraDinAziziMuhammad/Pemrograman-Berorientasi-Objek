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
public class Pesawat  extends Kendaraan{
private String nama, jenis;
 
Pesawat(String nama){
super("Pesawat");
this.nama = nama;
jenis = "belum teridentifikasi";
}
 
Pesawat(String nama, String jenis){
super("Pesawat");
this.nama = nama;
this.jenis = jenis;
}
 
void informasi(){
System.out.println("Nama pesawat adalah\t: " + this.nama);
System.out.println("Jenis pesawat adalah\t: " + this.jenis);
System.out.println();
}
}
