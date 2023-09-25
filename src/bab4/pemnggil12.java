/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab4;

/**
 *
 * @author sadra
 */
public class pemnggil12 {
    public static void main(String [] args){ 
System.out.println("Nama\t: Rizqi Agung Fauzi"); 
System.out.println("NIM\t: 32602100113\n");

Mahasiswa Giza = new Mahasiswa();

Giza.nim = "32602100113";
Giza.nama = "Rizqi Agung Fauzi";

//Error karena hak aksesnya private
//udin.ipk = 3.80;

Giza.setIpk(3.66); 
System.out.println("Nama\t: " + Giza.nama); 
System.out.println("NIM\t: " + Giza.nim); 
System.out.println("IPK\t: " + Giza.getIpk());
}

}
