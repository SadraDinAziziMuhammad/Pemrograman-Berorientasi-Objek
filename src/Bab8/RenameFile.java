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
import java.io.File;
import java.util.Scanner;

public class RenameFile {
static Scanner input = new Scanner(System.in);

static void renameFileTxt(String namaFile) {
try {            
System.out.print("\ningin mengganti nama file? (ya / tidak) = ");
String isi = input.next();
if (isi.equals("ya")) {
File file = new File(namaFile + ".txt");
System.out.print("Nama Baru file : ");
String name = input.next();
File fileNew = new File(name + ".txt");
if (file.renameTo(fileNew)) {
System.out.println("Nama file berhasil diubah");                
} else {
System.out.println("Nama file gagal diubah");
}
}
} catch (Exception e) {
System.out.println("nama file gagal diubah");
}
}

static void renameFileDat(String namaFile) {
try {
System.out.print("\ningin mengganti nama file? (ya / tidak) = ");
String isi = input.next();
if (isi.equals("ya")) {
File file = new File(namaFile + ".dat");
System.out.print("Nama Baru file : ");
String name = input.next();
File fileNew = new File(name + ".dat");
if (file.renameTo(fileNew)) {
System.out.println("Nama file berhasil diubah");
} else {
System.out.println("Nama file gagal diubah");
}
}
} catch (Exception e) {
System.out.println("nama file gagal diubah");
}
}

public static void main(String[] args) {
System.out.println("Nama\t: Rizqi Agung Fauzi");
System.out.println("NIM\t: 32602100113\n");
     
System.out.print(        "Masukan nama file yang ingin diganti = ");
String nameFile = input.next();
System.out.println("\n1. .txt ?");
System.out.println("2. .dat ?");
System.out.print("pilih satu opsi = ");
int opsi = input.nextInt();
if (opsi == 1) {
renameFileTxt(nameFile);
} else if (opsi == 2) {
renameFileDat(nameFile);
}
}   
}
