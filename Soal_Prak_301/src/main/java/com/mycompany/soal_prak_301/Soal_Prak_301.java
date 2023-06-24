/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.soal_prak_301;
import java.util.Scanner;

public class Soal_Prak_301 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
       int pinjaman, lamaAngsuran, bunga;
       int n = 1,en;
      
        System.out.print("Masukan Jumlah uang Pinjaman : ");
        pinjaman = input.nextInt();
        System.out.print("Lama Angsuran : ");
        lamaAngsuran = input.nextInt();
        System.out.print("Jumlah Bunga pinjaman (%) : ");
        bunga = input.nextInt();
        System.out.println("-----------------------------------------");
        int angsuran = pinjaman/lamaAngsuran;
       
        for (int i = 1; i <= lamaAngsuran; i++){
            //iki bunga + pembayaran
            int pembayaran = angsuran + (pinjaman * bunga/100); 
            System.out.println("Angsuran perbulan : " + angsuran);
            System.out.println("Bunganya : " + (pembayaran - angsuran) );
            System.out.println("Jumlah yang harus di bayar pada angsuran ke " + (i) + " = " + pembayaran);
            pinjaman = pinjaman - angsuran;
            System.out.println("-----------------------------------------");
            do {
                System.out.print("Apakah anda ingin lanjut 1(ya) 0(tidak) " );
                en = input.nextInt();
                System.out.println("-----------------------------------------");
               
                System.out.println("Sisa Hutang : " + pinjaman);
                if (pinjaman == 0 ){
                    System.out.println("Lunas");
                    System.exit(0);
                }else if(en == 0){
                    System.out.println("Leren");
                    System.exit(0);
                }
                n++;
            } while (pinjaman == 0 );  
            
        }
    }
}
