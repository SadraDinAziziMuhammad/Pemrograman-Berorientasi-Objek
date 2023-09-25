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
public class rektor1 extends dosen{ 
private int tahun_mulai, jabatan_ke;

rektor1(String nama, String nik, String jurusan, int tahun_mulai, int jabatan_ke){
super(nama, nik, jurusan);

this.tahun_mulai = tahun_mulai; 
this.jabatan_ke = jabatan_ke;
}

void viewrektor1(){
System.out.println("Tahun mulai jabatan = " +this.tahun_mulai);
System.out.println("Jabatan Rektor ke =	" + this.jabatan_ke);
}
}
