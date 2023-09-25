/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab7;

/**
 *
 * @author sadra
 */
public class latihan2_trydancatch {
public static void main(String[] args) {
System.out.println("Nama\t: Rizqi  Agung Fauzi");
System.out.println("NIM\t: 32602100113\n");
        
int pembilang = 7;
int penyebut = 0; 
try{
int hasil = pembilang / penyebut;
System.out.println("Hasil = " + hasil);
}catch(Exception e){
System.out.println("Kesalahan terdapat pembagian dengan nol");
} 
System.out.println("Statement setelah blok try catch");
    }   
}
