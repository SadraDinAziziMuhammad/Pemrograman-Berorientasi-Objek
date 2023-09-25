package tugas_bab2;
import java.util.Scanner;

public class tugas_bab2 {
static void castingValue(int a, int b){
System.out.println("\nNilai int a = " + a); 
System.out.println("Nilai int b = " + b); 
System.out.println("Nilai float a = " + (float) a); 
System.out.println("Nilai float b = " + (float) b);
 
int bagiInt = a / b;
float bagiFloat = (float) a / b; 
System.out.println("Hasil bagi int = " + bagiInt); 
System.out.println("Hasil bagi float = " + bagiFloat + "\n");
}
public static void main(String [] args){

System.out.println("Nama\t: Sadra Din Azizi Muhammad"); 
System.out.println("NIM\t: 32602100135\n");

Scanner input = new Scanner(System.in);

System.out.print("Nilai a = "); int a = input.nextInt(); 
System.out.print("Nilai b = "); int b = input.nextInt();

castingValue(a, b);
}
}
