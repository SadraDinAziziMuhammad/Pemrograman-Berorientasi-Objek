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
public class Mahasiswa {
private String nim, nama; 
void setNim(String nim){
try{
this.nim = nim;
if(nim == null){
throw new NullPointerException();
}
}catch(NullPointerException e){
System.out.println("KESALAHAN: NIM tidak boleh null");
}
} 
String getNim(){
return this.nim;
} 
void setNama(String nama){
try{
this.nama = nama;
if(nama == null){
throw new NullPointerException();
}
}catch(NullPointerException e){
System.out.println("KESALAHAN: Nama Mahasiswa tidak boleh null");
}
}
String getNama(){
return this.nama;
}

}
