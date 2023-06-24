/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.soal_prak_101;
import java.util.Scanner;

public class Soal_Prak_101 {

    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        double jari2, luas,keliling,phi;
        
        System.out.println("Masukan Jari-Jari");
        jari2 = masukan.nextInt();
        phi = 3.14;
        System.out.print("phi : " + phi);
        System.out.println("");
        
        luas = phi * jari2 * jari2;
        keliling = phi * 2 * jari2;
        
        System.out.println("Hasil Luas" + luas);
        System.out.println("Hasil Keliling" + keliling);
    }
}
