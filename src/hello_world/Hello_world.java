package hello_world;

import java.util.Scanner; 
 
public class Hello_world {
public static void main(String[] args) {
     
System.out.println("Nama\t: Sadra Din Azizi Muhammad"); 
System.out.println("NIM\t: 32602100135\n");
Scanner input = new Scanner(System.in);
        
System.out.print("Nama\t: "); 
String nama = input.nextLine(); 
System.out.print("NIM\t: "); 
String nim = input.nextLine(); 
System.out.print("Alamat\t: "); 
String alamat = input.nextLine(); 
System.out.print("Telp\t: "); 
String telepon = input.nextLine(); 
System.out.print("Email\t: "); 
String email = input.nextLine();
    }
}