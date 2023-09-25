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
public class rektor extends dosen{ 
private int tahub_mulai, jabatan_ke;

rektor(String nama, String nik, String jurusan, int tahun_mulai){
super(nama, nik, jurusan);

this.tahub_mulai = tahun_mulai; 
this.jabatan_ke = jabatan_ke;
}

void viewRektor(){
System.out.println("Tahun mulai jabatan = " + this.tahub_mulai);
System.out.println("Jabatan Rektor ke =	" + this.jabatan_ke);
}
}
