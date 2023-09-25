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
public class pemanggil {
public static void main(String [] args){ 
System.out.println("Nama\t: Rizqi  Agung Fauzi"); 
System.out.println("NIM\t: 32602100113\n");

rektor rektor = new rektor("Andi", "885230202", "informatika", 2006) ;
dekan dekan = new dekan("Ahmad", "995230101", "T.Kimia", "TI");
kalab kalab = new kalab("Indah", "035230302", "informatika", "KSC");
rektor.view(); rektor.viewRektor();

dekan.view(); dekan.viewDekan();

kalab.view(); kalab.viewKalab();
}
}


