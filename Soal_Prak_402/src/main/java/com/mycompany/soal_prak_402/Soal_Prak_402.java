/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.soal_prak_402;
import java.util.Scanner;

public class Soal_Prak_402 {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        
    double jml=0;
    System.out.println("\t##Perihal Deret Fibonacci##\n");
    System.out.print("Masukkan sebuah bilangan : ");
    int n=input.nextInt();

    System.out.print("Deret Fibonaci: ");
    for (int x=1; x<=n; x++) {
       System.out.print(fibonacci(x));
       if (x==n) {
           System.out.print(" ");
       }
       else {
           System.out.print(" + ");
       }
       jml+=fibonacci(x); //total penjumlahan semua deret        fibonacci
    }
    System.out.print("\nJumlah: "+jml +"\n");
    double ratarata=jml/n; //rata-rata deret fibonacci
    System.out.printf("Rata-rata: %.2f\n\n", ratarata);
    }
    private static int fibonacci (int n){
        if(n==1){
         return 0;
        }
        else if(n==2){
            return 1;
        }
        else{
            return fibonacci(n-2)+fibonacci(n-1);
        }   
    }
}
