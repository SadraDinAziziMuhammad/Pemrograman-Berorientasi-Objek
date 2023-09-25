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
public abstract class Hewan {
String nama, jenis;
    
Hewan(String nama, String jenis){
this.nama = nama;
this.jenis = jenis;
}
abstract void info();

}
