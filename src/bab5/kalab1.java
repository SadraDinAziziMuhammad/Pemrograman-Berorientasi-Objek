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
public class kalab1 extends dosen{ 
private String laboratorium;

kalab1(String nama, String nik, String jurusan, String laboratorium){
super(nama, nik, jurusan); 
this.laboratorium = laboratorium;
}

void viewKalab(){
System.out.println("Laboratorium = " +this.laboratorium);
}
}
