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
public abstract class Kendaraan {

float kecepatan, kapasitasTangki, dayaAngkutBarang, dayaAnkutManusia, totalDayaAngkut;
int tahunKeluar; String nama, warna;

Kendaraan(String nama, float kecepatan, float kapasitasTangki, float dayaAngkutBarang, float dayaAnkutManusia, int tahunKeluar, String warna){

this.nama = nama; 
this.kecepatan = kecepatan;
this.kapasitasTangki = kapasitasTangki; 
this.dayaAngkutBarang = dayaAngkutBarang; 
this.dayaAnkutManusia = dayaAnkutManusia; 
this.tahunKeluar = tahunKeluar; 
this.warna = warna;

}
abstract void displaySpesifikasi();
}
