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
public class pemanngil4 {
public static void main(String[] args) {

System.out.println("Nama\t: Rizqi Agung Fauzi"); 
System.out.println("NIM\t: 32602100113\n");
 
Karyawan karyawan001 = new Karyawan(); 
Karyawan karyawan002 = karyawan001;

karyawan001.nama = "Mischella"; 
karyawan001.divisi = "HRD";

System.out.println("Data Karyawan001"); 
System.out.println("Nama\t: " + karyawan001.nama); 
System.out.println("Divisi\t: " + karyawan001.divisi); 
System.out.println(" ");
System.out.println("Data Karyawan002"); 
System.out.println("Nama\t: " + karyawan002.nama); 
System.out.println("Divisi\t: " + karyawan002.divisi);

karyawan002 = new Karyawan(); 
karyawan002.nama="Yahya Al-Mahandis"; 
karyawan002.divisi="Produksi";

System.out.println(" "); 
System.out.println("Setelah Perubahan Referensi"); 
System.out.println(" ");
System.out.println("Data Karyawan001"); 
System.out.println("Nama\t: " + karyawan001.nama); 
System.out.println("Divisi\t: " + karyawan001.divisi); 
System.out.println(" ");
System.out.println("Data Karyawan002"); 
System.out.println("Nama\t: " + karyawan002.nama);
System.out.println("Divisi\t: " + karyawan002.divisi);
}
}
