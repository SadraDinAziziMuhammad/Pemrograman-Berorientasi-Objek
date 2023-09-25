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
public class pemanggil2 {

public static void main(String[] args) {

System.out.println("Nama\t: Rizqi Agung Fauzi"); 
System.out.println("NIM\t: 32602100113\n"); 
SepedaMotor SepedaMotor = new SepedaMotor("Vario CBS", 120, 10, 50, 150, 2015, "merah");
PerahuLayar PerahuLayar = new PerahuLayar("ELVIS", 80, 30, 100, 300, 2012, "putih");

SepedaMotor.displaySpesifikasi(); 
PerahuLayar.displaySpesifikasi();
}
}
