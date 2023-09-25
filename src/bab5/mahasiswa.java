/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab5;

/**
 *
 * @author sadra
 */
public class mahasiswa {

void infoMahasiswa(int laki, int perempuan, String kelas){
int jumlah = laki + perempuan; 
System.out.println(kelas + ", jumlah mahasiswa = " + jumlah);
}

void infoMahasiswa(int mhsLama, int mhsBaru, int mhsCuti, int angkatan){
int jumlah = mhsLama + mhsBaru + mhsCuti;

System.out.println("Sampai tahun " + angkatan + " jumlah mahasiswa = " + jumlah);
}
}