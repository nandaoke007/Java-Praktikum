/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.soal_prak_102;
import java.util.Scanner;
import java.text.DecimalFormat;


public class Soal_Prak_102 {

    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        double Rp, $, Euro, hasil;
        
        System.out.print("masukan nilai Rupiah :");
        Rp = masukan.nextInt();
        
        $ = Rp / 14900;
        Euro = Rp / 16300;
        
        System.out.println("Nilai Rupiah :" + Rp);
        System.out.println("Nilai Dollar :" + df.format($));
        System.out.println("Nilai Euro :" + df.format(Euro));
    }
}
