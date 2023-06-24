/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.soal_prak_403;
import java.util.Scanner;

public class Soal_Prak_403 {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("\t##Perihal Bilangan Amisabel##\n");
    System.out.print("Masukkan bilangan : ");
    int n=input.nextInt();
    if(n>5000){
    System.out.println("Input tidak valid ! ");
    }
    else{
    System.out.print(n+" = ");
    rumus(n);
    System.out.println(" ");
    }
}
   
private static int rumus(int n){
    for(int i=1; i<=n; ){
        if(i==1){
           System.out.print(i);
           i++;
        }
     else{
            if(i==n){
                break;
            }
           else if(n%i==0){
                System.out.print(" + "+i);
                i++;
            }
           else{
                i++;
           }
      }
}
return(n);
    } 
}