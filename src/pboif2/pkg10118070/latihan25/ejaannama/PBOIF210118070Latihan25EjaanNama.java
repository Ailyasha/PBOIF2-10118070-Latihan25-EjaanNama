/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10118070.latihan25.ejaannama;

import java.util.Scanner;

/**
 *
 * @author Ailyasha
 * Nama : Aufa Ilyasha
 * Nim : 10118070
 * Kelas : IF-2
 * Nama kelas : Pemrograman Berbasis OO
 */
public class PBOIF210118070Latihan25EjaanNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan nama depan anda untuk di eja");
        String nama = input.next();
        System.out.println("");
        System.out.println("Ejaan untuk\"" + nama +"\"adalah : ");
        for(int i = 1;i<=nama.length();i++){
            System.out.println("Huruf ke-" + i + ":" + nama.substring(i-1,i));
            
        }
        System.out.println("");
        System.out.println("(Developed by : Aufa Ilyasha)");
    }
    
}
