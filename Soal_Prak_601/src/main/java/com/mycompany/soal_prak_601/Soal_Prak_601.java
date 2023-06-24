/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.soal_prak_601;
import java.io.*;
        

public class Soal_Prak_601 {
    public static void main(String[] args){
        FileInputStream input = null;
        int data;
        
        try{
            input = new FileInputStream("d:/mhs.txt");
            
        }catch(FileNotFoundException fnfe){
            System.out.println("file tidak ada");
            return;
        }
        try{
            while ((data=input.read())!=-1){
            System.out.print((char)data);
            }
        }catch (IOException ioe){
            System.out.println(ioe.getMessage());
            return;
        }
        try{
            input.close();
        }catch (IOException ioe){}
    }
}
