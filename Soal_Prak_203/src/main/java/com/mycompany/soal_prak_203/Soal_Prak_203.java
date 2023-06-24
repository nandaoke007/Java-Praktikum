/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.soal_prak_203;
import java.util.Scanner;

public class Soal_Prak_203 {

    public static void main(String[] args) {
         Scanner masukan = new Scanner(System.in);
        int x, y;
        System.out.println("=============================================");
        System.out.println(" Program to Determine of the Quadrant Number");
        System.out.println("=============================================");
        System.out.printf("\t\tInput x : ");
        x = masukan.nextInt();

        System.out.printf("\t\tInput y : ");
        y = masukan.nextInt();

        System.out.println("---------------------------------------------");
        if(x > 0 && y > 0){
            System.out.printf("\t\tQuadrant I");
        }
        else if(x < 0 && y > 0){
            System.out.printf("\t\tQuadrant II");
        }
        else if(x < 0 && y < 0){             System.out.printf("\t\tQuadrant III");         
        }         
        else if(x > 0 && y < 0){
            System.out.printf("\t\tQuadrant IV");
        }
        else {
            System.out.printf("\tPlease Input x and y Other");
        }
        System.out.println("");
        System.out.println("=============================================");
        System.out.println("");
    }
}
