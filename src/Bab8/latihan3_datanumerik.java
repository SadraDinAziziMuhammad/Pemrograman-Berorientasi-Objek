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

public class latihan3_datanumerik {
public static void main(String[] args) throws IOException{
System.out.println("Nama\t: Sadra Din Azizi Muhammad");
System.out.println("NIM\t: 32602100135\n");
        
System.out.print("Masukkan sebuah bilangan bulat : ");
String temp;
int bilanganInput = 0;
InputStreamReader isr = new 
InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);

temp = br.readLine();
try{
bilanganInput = Integer.parseInt(temp);
}catch (NumberFormatException nfe) {
System.out.println("Nilai yang dimasukkan" + "bukan bilangan bulat");
System.exit(1);
}
System.out.println("Bilangan yang anda masukkan adalah " + bilanganInput);
}
}

