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
public class pemanggil2 {
    public static void main(String[] args) {

System.out.println("Nama\t: Sadr Din Azizi Muhammad"); 
System.out.println("NIM\t: 32602100135\n");

Karyawan Aurel = new Karyawan(); 
Karyawan Dhennis = new Karyawan();
Aurel.ID = "K001";
Aurel.nama = "Marketing"; 
Aurel.divisi = "Aurel Dian"; 
Aurel.gaji = 2500000;

Dhennis.ID = "K002"; 
Dhennis.nama = "Keuangan";
Dhennis.divisi = "Muhamad Dhennis"; 
Dhennis.gaji = 2250000;

System.out.println("Data Karyawan Pertama :"); 
System.out.println("ID\t: " + Aurel.ID); 
System.out.println("Nama\t: " + Aurel.nama); 
System.out.println("Divisi\t: " + Aurel.divisi); 
System.out.println("Gaji\t: " + Aurel.gaji);

System.out.println("Data Karyawan Kedua :"); 
System.out.println("\nID\t: " + Dhennis.ID); 
System.out.println("Nama\t: " + Dhennis.nama); 
System.out.println("Divisi\t: " + Dhennis.divisi); 
System.out.println("Gaji\t: " + Dhennis.gaji);
}

}
