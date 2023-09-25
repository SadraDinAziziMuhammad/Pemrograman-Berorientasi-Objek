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
public class dosen1 {
    String nama, nik, jurusan;

dosen1(String nama, String nik, String jurusan){ 
this.nama = nama;
this.nik = nik; 
this.jurusan = jurusan;
}

void view(){
System.out.println("Nama\t= " + this.nama); 
System.out.println("NIK\t= " + this.nik); 
System.out.println("Jurusan\t= " + this.jurusan);
}

}
