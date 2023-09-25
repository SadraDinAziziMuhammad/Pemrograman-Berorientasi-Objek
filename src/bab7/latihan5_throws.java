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
public class latihan5_throws {
public static void cobaEksepsi() throws 
IllegalAccessException {
throw new IllegalAccessException(
"KESALAHAN: illegal access");
}
 
public static void main(String[] args) {
System.out.println("Nama\t: Rizqi Agung FAuzi");
System.out.println("NIM\t: 32602100113\n");
 
try {
cobaEksepsi();
} catch (Exception e) {
System.out.println("Eksepsi ditangkap disini...");
System.out.println(e.getMessage());
}
System.out.println("Statemen setelah blok try catch");
}  
}
