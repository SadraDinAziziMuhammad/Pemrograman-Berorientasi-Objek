package tugasbab3;

import java.util.Arrays; 
import java.util.Scanner;

public class tugasbab3 {
public static void main(String[] args) {

System.out.println("Nama\t: Sadra Din Azizi Muhammad"); 
System.out.println("NIM\t: 32602100135\n");

int [] arrayAngka = {2,4,6,8,0,1,3,5,7,9}; 
boolean nilai = false; 
printAngka(arrayAngka);

Scanner input = new Scanner(System.in); 
System.out.print("Masukan angka yang dicari indeksnya 0 - 8 = ");
int cari = input.nextInt();
for (int indeks = 0 ; 
indeks < arrayAngka.length ; indeks ++){
if(cari == arrayAngka[indeks]){ 
System.out.println("nilai " + cari + " ada di indeks " + indeks); 
nilai = true;
}
}
if (!nilai){
System.out.println("nilai " + cari + " tidak ada");
}

System.out.println("\ndata setelah diurutkan dari terkecil");
Arrays.sort(arrayAngka); printAngka(arrayAngka);

System.out.println("\ndata setelah diurutkan dari terbesar");
reverse(arrayAngka); printAngka(arrayAngka);
}
static void printAngka(int [] dataArray){ 
System.out.println("array = " + Arrays.toString(dataArray));
}
static void reverse(int []dataArray){
int[] arrayBuffer = Arrays.copyOf(dataArray,dataArray.length);
for (int i = 0 ; i < dataArray.length ; i ++){ 
dataArray[i] = arrayBuffer[(arrayBuffer.length - 1) - i];
}
}
}
