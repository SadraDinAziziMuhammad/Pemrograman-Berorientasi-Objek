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
public class Herbivora extends Hewan{
Herbivora(String nama){
super(nama, " PESUGIHAN");
}
Herbivora(String nama, String jenis){
super(nama, jenis);
}
@Override
void info() {
System.out.println("\nHewan ini adalah " + this.nama);
System.out.println("dia termasuk jenis hewan " + 
this.jenis);
}
}
