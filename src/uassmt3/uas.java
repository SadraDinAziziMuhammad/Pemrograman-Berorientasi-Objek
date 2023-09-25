/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uassmt3;

/**
 *
 * @author sadra
 */

import static java.lang.System.in;
import java.util.Scanner;

public class uas {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("================================");
        System.out.println("Nama\t = Nazla Abay Daud Istanto");
        System.out.println("NIM\t = 32602100103"); 
        System.out.println("================================");
        System.out.print("Masukan angka: ");
        
        int in = input.nextInt();
        System.out.println("Angka yang anda masukkan adalah " + in);

        int i=1;
        int j=1;
       
        if (in<=20) {
            //System.out.println("Bilangan anda adalah ganjil ");
            for( j=1;j>=1;j--) {
                System.out.print("1 2 3 4 5 6 7 8 9 10 ");
            }
        }else {
            //System.out.println("Bilangan anda adalah genap ");
            for( i=1;i<=1;i++) {
                System.out.print( "a b c d e f g h i j k l m n o p q r s t u v w x y z ");
            }
        }
}
