/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.soal_prak_401;
import java.util.Scanner;

public class Soal_Prak_401 {

    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
         
        
        int numbers, checker=0;
        
 
        
        System.out.println("Program Check Bilangan Prima");
        System.out.print("Enter Number: ");
        numbers = input.nextInt();
        
 
        System.out.println("-----------------------------");
 
        for (int i=2; i<=numbers; i++)
        {
            if (numbers%i==0)
            {
                checker++;
            }
        }
        if (checker==1)
        {
            System.out.print(numbers + " adalah bilangan prima");
        } else {
            System.out.println( numbers + " bukan nilangan prima");
        }
    
        System.out.println("Bilangan Prima 1 hingga 100 adalah : ");
        int tampil = 100;
        for(int i=2; i<tampil; i++) {
            boolean isPrima = true;
            
            for (int j = 2; j < i; j++) {
                if(i%j==0){
                    isPrima = false;
                    break;
                    
                }
            }
            if(isPrima==true){
                System.out.print(i+",");
            }
        }
    }
}
