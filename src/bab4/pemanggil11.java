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
public class pemanggil11 {
    public static void main(String[] args) {
System.out.println("Nama\t: Rizqi Agung Fauzi"); 
System.out.println("NIM\t: 32602100113\n");

Karyawan karyawan001 = new Karyawan("k006", "Zaky");
Karyawan karyawan002 = new Karyawan("k007", "Deva", "Keuangan", 2250000);
karyawan001.cetakData(); 
karyawan002.cetakData();
}

}
