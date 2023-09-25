/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanbab4;

// class Karyawan 

public class Karyawan {

String ID, nama, divisi; 
double gaji;
}
// class pemanggil 

public class pemanggil {
public static void main(String[] args) {

System.out.println("Nama\t: Rifqy Ramdhani Hakim"); 
System.out.println("NIM\t: 32602100077\n");

Karyawan aurel = new Karyawan();

aurel.ID = "K001"; 
aurel.divisi = "Marketing"; 
aurel.nama = "Aurel Dian"; 
aurel.gaji = 2500000;

System.out.println("Data Karyawan :"); 
System.out.println("ID\t: "+aurel.ID); 
System.out.println("Nama\t: "+aurel.nama); 
System.out.println("Divisi\t: "+aurel.divisi); 
System.out.println("Gaji\t: "+aurel.gaji);
}   
}
