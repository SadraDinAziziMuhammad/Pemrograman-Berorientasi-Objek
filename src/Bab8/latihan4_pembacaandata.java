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
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class latihan4_pembacaandata {
  public static void main(String[] args) throws IOException{
System.out.println("Nama\t: Sadra Din Azizi Muhammad");
System.out.println("NIM\t: 32602100135\n");
        
FileInputStream finput=null;
int data;
try{
finput = new FileInputStream("C:\\Users\\sadra\\OneDrive\\Documents\\NetBeansProjects\\Hello_world\\src\\Bab8\\input");
}	

catch(IOException e){}
try{
while((data = finput.read())!=-1){
System.out.print((char) data);
}
}catch(IOException e){}
try{
finput.close();
}catch(IOException e){}
    }
}
