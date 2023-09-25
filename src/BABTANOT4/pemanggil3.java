/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BABTANOT4;

/**
 *
 * @author sadra
 */
public class pemanggil3 {
public static void main(String[] args) {

System.out.println("Nama\t: Rizqi Agung Fauzi"); 
System.out.println("NIM\t: 32602100113\n");

Karyawan Karyawan001 = new Karyawan(); 
Karyawan Karyawan002 = Karyawan001;

Karyawan001.nama = "Mischella"; 
Karyawan001.divisi = "HRD";

System.out.println("Data Karyawan001 :"); 
System.out.println("Nama\t: " + Karyawan001.nama); 
System.out.println("Divisi\t: " + Karyawan001.divisi); 
System.out.println(" ");
System.out.println("Data Karyawan002 :"); 
System.out.println("Nama\t: " + Karyawan002.nama); 
System.out.println("Divisi\t: " + Karyawan002.divisi);
}  
}

