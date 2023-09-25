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
public class SepedaMotor extends kendaraandart {

SepedaMotor(String nama, float kecepatan, float kapasitasTangki, float dayaAngkutBarang, float dayaAnkutManusia, int tahunKeluar, String warna){
 
super(nama, kecepatan, kapasitasTangki, dayaAngkutBarang, dayaAnkutManusia, tahunKeluar, warna);
}

void displaySpesifikasi() {	
this.totalDayaAngkut = this.dayaAngkutBarang + this.dayaAnkutManusia;
System.out.println("\n============================SEPE DA MOTOR============================");
System.out.println("\nSepeda Motor ini bermerk " + this.nama + ", saya beli tahun " + this.tahunKeluar + " berwarna " + this.warna);
System.out.println( "yang memiliki kecepatan maksimal " + this.kecepatan + " km/jam"); 
System.out.println("dengan maksimum tangki sebesar " + this.kapasitasTangki + " liter"); 
System.out.println("daya angkut barangnya sebesar " + this.dayaAngkutBarang + " kg dan daya angkut manusia maksimum " + this.dayaAnkutManusia + " kg"); 
System.out.println("sehingga	total	daya	angkut kendaraan keseluruhan " + this.totalDayaAngkut + " kg");
}
}