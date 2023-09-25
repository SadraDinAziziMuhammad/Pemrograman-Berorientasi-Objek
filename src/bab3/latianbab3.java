package latianbab3;
import java.util.Arrays;
public class latianbab3 {
public static void main(String [] args){
System.out.println("Nama\t: Rizqi Agung Fauzi"); 
System.out.println("NIM\t: 32602100113\n");
String A = "Lab. KSC";
char[] karakter0 = A.toCharArray(); 
char[] karakter1 = new char[7]; 
A.getChars(2, 6, karakter1, 1); 
System.out.println("kalimat Asli : "+A); 
System.out.println("Per karakter : "); 
for (int i=0; i<A.length(); i++){
System.out.println("Karakter ke-"+(i+1)+": "+karakter0[i]);
}
System.out.println("Karakter ke-2 sampai ke-6 : "); 
for (int i=1; i<karakter1.length; i++){ 
System.out.println("Karakter ke-"+i+": "+karakter1[i]);
}}}
