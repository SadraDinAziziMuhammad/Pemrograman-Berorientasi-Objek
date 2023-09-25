/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab6;

/**
 *
 * @author sadra
 */
public class Latihan {
public static void main(String[] args) {
System.out.println("Nama\t: Rizqi Agung Fauzi");
System.out.println("NIM\t: 32602100135\n");
        
Kendaraan P;
Pesawat psw =new Pesawat ("Boeing","Pesawat Komersial");
Mobil mbl1 = new Mobil("Toyota Kijang", "Jeep"); 
Mobil mbl2 = new Mobil("Suzuki Baleno", "Sedan"); 
Mobil mbl3 = new Mobil("VW Combi");
Kapal kpl = new Kapal ("Queen Mary 2","Kapal Pesiar");
 
P = psw;
P.informasi();
P = mbl1;
P.informasi();
P = mbl2;
P.informasi();
P = mbl3;
P.informasi();
P = kpl;
P.informasi();

    }
}
