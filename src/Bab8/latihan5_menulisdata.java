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
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class latihan5_menulisdata {
  public static void main(String[] args) throws IOException{
System.out.println("Nama\t: Sadra Din Azizi Muhammad");
System.out.println("NIM\t: 32602100135\n");
        
FileOutputStream foutput = null;
String data = "Hello Guys ! \n Semoga \nSukses selalu..";

try {
foutput = new
FileOutputStream("C:\\Users\\sadra\\OneDrive\\Documents\\NetBeansProjects\\Hello_world\\src\\Bab8\\output");
} catch (FileNotFoundException fnfe) {
System.out.println("File tidak dapat terbentuk.");
return; 
}
try {
for (int i = 0; i < data.length(); i++) {
foutput.write((int) data.charAt(i));
}
} catch (IOException ioe) {
System.out.println(ioe.getMessage());
return;
}
try {
foutput.close();
} catch (IOException ioe) {
}
}  
}
