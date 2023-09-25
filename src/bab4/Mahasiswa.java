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

public class Mahasiswa {
    private static String nama, nim;
Mahasiswa(String nama, String nim){
this.nama = nama;
this.nim = nim;
}
class MataKuliah{
void mk(int jumlahMk){
String mataKuliah[] = new String[jumlahMk];
int sks[] = new int[jumlahMk];
float tugas[] = new float[jumlahMk];
float uts[] = new float[jumlahMk];
float uas[] = new float[jumlahMk];
float nilai [] = new float[jumlahMk];
int angka[] = new int[jumlahMk];
char huruf[] = new char[jumlahMk];
float total = 0;
float total2[] = new float[jumlahMk];
int totalSks = 0;
Scanner input = new Scanner(System.in);
for (int i = 0 ; i < jumlahMk ; i++){
System.out.print("\nMata Kuliah ke - " + (i+1) + "\t= ");
mataKuliah[i] = input.next();
System.out.print("SKS\t\t\t= ");
sks[i] = input.nextInt();
System.out.print("Nilai tugas\t\t= ");
tugas[i] = input.nextFloat();
System.out.print("Nilai UTS\t\t= ");
uts[i] = input.nextFloat();
System.out.print("Nilai UAS\t\t= ");
uas[i] = input.nextFloat();
nilai[i]= (tugas[i] + uts[i] + uas[i]) / 3;
if (nilai[i] < 40){
angka[i] = 0;
huruf[i] = 'E';
}else if(nilai[i] >= 40 && nilai[i] <= 54){
angka[i] = 1;
huruf[i] = 'D';
}
else if(nilai[i] >= 55 && nilai[i] <= 69){
angka[i] = 2;
huruf[i] = 'C';
}else if(nilai[i] >= 70 && nilai[i] <= 84){
angka[i] = 3;
huruf[i] = 'B';
}else if (nilai[i] >= 85 && nilai[i] <= 100){
angka[i] = 4;
huruf[i] = 'A';
}
total2[i] =sks[i] * angka[i];
total +=total2[i];
totalSks += sks[i];
}
float ipk = total / totalSks;
System.out.println();
System.out.println(Mahasiswa.nama);
System.out.println(Mahasiswa.nim);
System.out.println("================================");
System.out.println("MatKuliah || SKS || Tugas || UTS || UAS || Nilai Akhir || Huruf || Angka || Total");
System.out.println("================================");
for (int i = 0 ; i < jumlahMk ; i++){
System.out.println(mataKuliah[i] + " || " + sks[i] + " || " + tugas[i] + " || " + uts[i] + " || " + uas[i] + " || " + nilai[i] + " || " + huruf[i] + " || " + angka[i] + " || " + total2[i]);
}
System.out.println("\nIPK = " + ipk);
}}}
