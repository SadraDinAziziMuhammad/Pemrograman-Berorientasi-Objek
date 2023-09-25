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
public class tugas {
  public static void main(String[] args) {
        System.out.println("Nama\t:Rizqi Agung Fauzi");
        System.out.println("NIM\t: 32602100113\n");
        
Hewan hewan;
Karnivora macan = new Karnivora("Macan", "Karnivora");
Karnivora tirex = new Karnivora("Tirex");
Herbivora wedus = new Herbivora("Wedus", "Herbivora");
Herbivora babiNgepet = new Herbivora("Babi Ngepet");
Omnivora monyet = new Omnivora("Monyet", "Omnivora");
Omnivora naga = new Omnivora("Naga");

hewan = macan;
hewan.info();
hewan = tirex;
hewan.info();
hewan = wedus;
hewan.info();
hewan = babiNgepet;
hewan.info();
hewan = monyet;
hewan.info();
hewan = naga;
hewan.info();
    }
}
