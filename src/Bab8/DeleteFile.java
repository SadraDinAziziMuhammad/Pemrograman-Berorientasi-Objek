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
import java.io.*;
import java.util.Scanner;

public class DeleteFile {
  static Scanner input = new Scanner(System.in);

static void deleteTxt(String nameFile) {
File file = new File(nameFile + ".txt");
if (file.delete()) {
System.out.println("File berhasil dihapus");
} else {
System.out.println("File gagal dihapus");
}
}

static void deleteDat(String nameFile) {
File file = new File(nameFile + ".dat");
if (file.delete()) {
System.out.println("File berhasil dihapus");
} else {
System.out.println("File gagal dihapus");
}
}

public static void main(String[] args) {
System.out.println("Nama\t:Rizqi Agung Fauzi");
System.out.println("NIM\t: 32602100113\n");
System.out.print(        "Masukan nama file yang ingin dihapus = ");
String nameFile = input.next();
System.out.println("\n1. .txt ?");
System.out.println("2. .dat ?");
System.out.print("pilih satu opsi = ");
int opsi = input.nextInt();
if (opsi == 1) {
deleteTxt(nameFile);
} else if (opsi == 2) {
deleteDat(nameFile);
}
}  
}

