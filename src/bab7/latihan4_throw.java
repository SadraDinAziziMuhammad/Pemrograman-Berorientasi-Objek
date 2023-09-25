/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab7;

/**
 *
 * @author sadra
 */
public class latihan4_throw {
public static void main(String[] args) {
System.out.println("Nama\t: Rizqi Agung Fauzi");
System.out.println("NIM\t: 32602100113\n");
        
Mahasiswa mahasiswa = new Mahasiswa();
mahasiswa.setNim(null);
mahasiswa.setNama("Nadilla");
 
System.out.println("NIM\t: " + mahasiswa.getNim());
System.out.println("Nama\t: " + mahasiswa.getNama());

    }  
}
