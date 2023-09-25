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
public class Notebook {
    private String merk = "ACER";

class SistemOperasi{
private String namaOs = "Windows 11";

void cetakData(){
System.out.println("merk Notebook\t: " + merk); 
System.out.println("Sistem operasi\t: " + this.namaOs);
}
}

void cetakData(){
SistemOperasi os = new SistemOperasi(); os.cetakData();
}

}
