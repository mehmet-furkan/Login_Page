/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javalesson1;

/**
 *
 * @author mehme
 */
public class JavaLesson1 {

    public static void main(String[] args) {
       
        int x = 10;
        int memo;
        memo = 10;
        System.out.println("Hello World!" + memo);
        memo = 13;
        System.out.println("Hello World!" + memo);    
        double pi = 3.14;
        
        String s = "benim ismim mehmet furkan";
        System.out.println("13.karakter: " + s.charAt(10));
        s = s.toUpperCase();
        int ilkBosluk = s.indexOf(" ");
        String ilkKelime = s.substring(0, ilkBosluk);
        int sonBosluk = s.lastIndexOf(" ");
        String sonKelime = s.substring(sonBosluk);
        System.out.println(" dizgi " + s + " pi :" + pi + "ilk bosluk :" + ilkBosluk);
        System.out.println("ilk kelime değişkeni" + ilkKelime);
        System.out.println("son kelime" + sonKelime);
    }
}
