/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab8;

/**
 *
 * @author sadra
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class latihan1_datakarakter {
public static void main(String[] args) throws IOException{
System.out.println("Nama\t: Sadra Din Azizi Muhammad");
System.out.println("NIM\t: 32602100135\n");
        
System.out.print("Masukkan sebuah karakter: ");
char KarakterInput;
InputStreamReader isr = new 
InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);
KarakterInput = (char) br.read();
System.out.println("Karakter yang dimasukan adalah \'" + KarakterInput + "\'");
}
}
