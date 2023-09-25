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
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
static Scanner input = new Scanner(System.in);
static InputStreamReader inputUser = new InputStreamReader(System.in);
static BufferedReader br = new BufferedReader(inputUser);

static void cekFile(String file) {
System.out.print(        "\nIngin mengecek file? (ya/tidak) = ");
String cek = input.next();
if (cek.equals("ya")) {
File fileInput = new File(file + ".txt");
File fileInputUser = new File(file + ".dat");
if (fileInput.exists() || fileInputUser.exists()) {
System.out.println("File ditemukan");
} else {
System.out.println("File tidak ditemukan");
}
}
}

static void isiFile(BufferedWriter bufferedCharOutput) {
try {
System.out.print("\nIsi file? (ya/tidak) = ");
String isi = input.next();
if (isi.equals("ya")) {
System.out.print("Masukan isi file = ");
String name = br.readLine();
bufferedCharOutput.write(name);
bufferedCharOutput.flush();
}
} catch (Exception e) {
System.out.println("File gagal diisi");
}
}

static void tampilkanFileTxt(String namaFile) {
try {
System.out.print(            "\nTampilkan isi file? (ya/tidak) =");
String isi = input.next();
if (isi.equals("ya")) {
FileReader fileReader = new FileReader(namaFile + ".txt");
BufferedReader bufferedReader = new BufferedReader(fileReader);
System.out.println("isi file " + namaFile + ".txt = "  + bufferedReader.readLine());
}
} catch (Exception e) {
System.out.println("isi file gagal ditampilkan");
}
}

static void tampilkanFileDat(String namaFile) {
try {
System.out.print(            "\nTampilkan isi file? (ya/tidak) = ");
String isi = input.next();
if (isi.equals("ya")) {
FileReader fileReaderUser = new FileReader(namaFile+ ".dat");
BufferedReader bufferedReader = new BufferedReader(fileReaderUser);
System.out.println("isi file " + namaFile + ".dat = "
 + bufferedReader.readLine());
}
       
} catch (Exception e) {
System.out.println("isi file gagal ditampilkan");
}
}

public static void main(String[] args) throws
IOException {
System.out.println("Nama\t: Rizqi Agung Fauzi");
System.out.println("NIM\t: 3260210011322\n");

String nameFile;
try {
System.out.println("Buat file ");
System.out.println("1. .txt ");
System.out.println("2. .dat");
System.out.print("Pilih opsi = ");
int pilih = input.nextInt();
if (pilih == 1) {
System.out.print("Masukan nama file = ");
nameFile = input.next();
FileWriter charOutput = new FileWriter(nameFile + ".txt");
BufferedWriter bufferedCharOutput = new BufferedWriter(charOutput);
cekFile(nameFile);
isiFile(bufferedCharOutput);
tampilkanFileTxt(nameFile);
} else if (pilih == 2) {
System.out.print("Masukan nama file = ");
nameFile = input.next();
FileWriter charOutput = new FileWriter(nameFile+ ".dat");
           
BufferedWriter bufferedCharOutput = new BufferedWriter(charOutput);
cekFile(nameFile);
isiFile(bufferedCharOutput);
tampilkanFileDat(nameFile);
}
} catch (Exception e) {
System.out.println(e);
}
}  
}

