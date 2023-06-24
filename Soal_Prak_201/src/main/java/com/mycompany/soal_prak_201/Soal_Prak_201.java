/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.soal_prak_201;
import java.util.Scanner;


public class Soal_Prak_201 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Berat Badan(kg)\t:");
        float b = sc.nextFloat();
        System.out.print("Tinggi Badan (m)\t:");
        float t = sc.nextFloat();
        float imt = b / t /t;
        
        if (imt <18.5) {
            System.out.printf("IMT\t= %.2f%s%n ", imt, "\t\tTermasuk normal");
        } else if (imt > 18.5 && imt <= 25) {
            System.out.printf("IMT\t= %.2f%s%n ", imt, "\t\tTermasuk normal");
        } else if (imt > 25 && imt <= 30) {
            System.out.printf("IMT\t= %.2f%s%n ", imt, "\t\tTermasuk gemuk");
        } else {
            System.out.printf("IMT\t= %.2f%s%n ", imt, "\t\tTermasuk kegemukan");
        }
    }
}
