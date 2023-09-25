/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab4;

/**
 *
 * @author sadra
 */
import java.util.Scanner;
public class tugas {
public static void main(String[] args) { Scanner input = new Scanner(System.in);
System.out.println("Nama\t: Rizqi  Agung Fauzi"); 
System.out.println("NIM\t: 32602100113\n"); 
System.out.println("================================");
System.out.println("                SIM AKADEMIK "); 
System.out.println("==============================\n");
System.out.print("Nama\t= ");
String nama = input.nextLine();
System.out.print("NIM\t= ");
String nim = input.nextLine();
System.out.print("\nMasukan Jumlah Mata Kuliah yang diambil\t= ");
int jumlahMk = input.nextInt();

Mahasiswa mahasiswa = new Mahasiswa(nama, nim);
Mahasiswa.MataKuliah mataKuliah = mahasiswa.new 
MataKuliah();
mataKuliah.mk(jumlahMk);
}}

