/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.soal_prak_202;
import java.util.Scanner;

public class Soal_Prak_202 {

    public static void main(String[] args) {
         Scanner Masukan = new Scanner (System.in);
            System.out.print("Masukan Jumlah Jam Kerja/Minggu:");
            int Jam = Masukan.nextInt();
            int Gaji_1, Gaji_2, Gaji_3, Jam_Ot, Jam_Kurang,denda;
            
            Gaji_1 = (5000*Jam);
            Jam_Ot = Jam - 60;
            Gaji_2 = (7500*Jam_Ot) + (5000*60);
            Jam_Kurang = 50 - Jam;
            Gaji_3 = 5000 * Jam ;
            denda = Jam_Kurang*2500;
            
            if (Jam < 50){
                Gaji_3 = Gaji_3-denda;
                System.out.println("Gaji Anda Minggu Ini: Rp." +Gaji_3);
            } else if (Jam >= 60 ){
                
                System.out.println("Gaji Anda Minggu Ini: Rp." +Gaji_2);
            } else {
                
                System.out.println("Gaji Anda Minggu Ini: Rp." +Gaji_1);
            }
    }
}
