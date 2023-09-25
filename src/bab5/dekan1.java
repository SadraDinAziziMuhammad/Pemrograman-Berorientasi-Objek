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
public class dekan1 extends dosen{

private String fakultas;
dekan1(String nama, String nik, String jurusan, String fakultas){
super(nama, nik, jurusan); 
this.fakultas = fakultas;
}

void viewDekan(){
System.out.println("Fakultas = " + this.fakultas);
}

}

