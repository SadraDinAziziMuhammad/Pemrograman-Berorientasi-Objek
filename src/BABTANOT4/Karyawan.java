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
public class Karyawan {

String ID, nama, divisi; double gaji;

Karyawan(String ID, String nama) { 
this.ID = ID;
this.nama = nama;
}

Karyawan(String ID, String nama, String divisi, double gaji) {
this.ID = ID; 
this.nama = nama; 
this.divisi = divisi;
this.gaji = gaji;
}

void cetakData() { 
System.out.println("Data Karyawan "); 
System.out.println("ID\t: " + ID); 
System.out.println("Nama\t: " + nama); 
System.out.println("Divisi\t: " + divisi); 
System.out.println("Gaji\t: " + gaji); 
System.out.println();
}

double hitungSumbanganZakat() { 
double zakat = gaji * 0.025; 
return zakat;
}
void isiData(String kode, String Nama, String Div, double Gaji) {
ID = kode; 
nama = Nama; 
divisi = Div; 
gaji = Gaji;
}
}
