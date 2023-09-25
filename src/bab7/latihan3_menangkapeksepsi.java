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
public class latihan3_menangkapeksepsi {
public static void cobaEksepsi(int pembilang, int penyebut)  {
try {
int hasil = pembilang / penyebut;
System.out.println("Hasil bagi: " + hasil);
int[] Arr = {1, 2, 3, 4, 5}; 

// array dengan 5 elemen
Arr[ 10] = 23; // mengakses indeks ke-10
} catch (ArithmeticException eksepsi1) {
System.out.println("Terdapat pembagian dengan 0");
} catch (ArrayIndexOutOfBoundsException eksepsi2) {
System.out.println("Indeks di luar rentang");
}      
}

public static void main(String[] args) {
System.out.println("Nama\t: Rizqi Agung Fauzi");
System.out.println("NIM\t: 32602100113\n");
 
cobaEksepsi(4, 0);
cobaEksepsi(12, 4);
}   
}
