/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.soal_prak_302;
import java.util.Scanner;

public class Soal_Prak_302 {

    public static void main(String[] args) {
    int lagi = 0;
    System.out.println();
        System.out.println ("PROGRAM KONVERSI BILANGAN BULAT KE ROMAWI");
        do{
            System.out.println ();
            System.out.print ("Masukkan Bilangan Bulat : ");
            int angka = new Scanner(System.in).nextInt();
            
            if (angka<1 || angka>5000){
                System.out.println ("maaf,, tahun harus dalam jangkauan 1...5000");
            }
            
            else{
                while (angka>=1000){
                    System.out.print ("M");
                    angka = angka - 1000;
                }
                if (angka>=500){
                    if(angka>=900){
                        System.out.print ("CM");
                        angka = angka - 900;
                    }
                    else{
                        System.out.print ("D");
                        angka = angka - 500;
                    }
                }
                while(angka>=100){
                    if (angka>=400){
                        System.out.print ("CD");
                        angka = angka - 400;
                    }
                    else{
                        System.out.print ("C");
                        angka = angka - 100;
                    }
                }
                if (angka>=50){
                    if (angka>=90){
                        System.out.print ("XC");
                        angka = angka - 90;
                    }
                    else{
                        System.out.print ("L");
                        angka = angka - 50;
                    }
                }
                while(angka>=10){
                    if (angka>=40){
                        System.out.print("XL");
                        angka = angka - 40;
                    }
                    else{
                        System.out.print ("X");
                        angka = angka - 10;
                    }
                }
                if (angka >=5){
                    if (angka == 9){
                        System.out.print ("IX");
                        angka = angka - 9;
                    }
                    else
                        System.out.print ("V");
                        angka = angka - 5;
                }
            }
            while(angka>=1){
                if (angka == 4){
                    System.out.print ("IV");
                    angka = angka - 4;
                }
                else
                    System.out.print ("I");
                    angka = angka - 1;
            }
            
            System.out.println ();
            System.out.print ("Mau coba lagi? (1 : Ya     0 : tidak) : ");
            lagi = new Scanner(System.in).nextInt();
        
    }
        while (lagi == 1);
    }
}
