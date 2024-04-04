/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1192;

import java.util.Scanner;

/**
 *
 * @author bispo
 */
public class BEE1192 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int num = 5;
        int n = t.nextInt();
         for (int c = 0;c<num;c++){
             String frase = t.nextLine();
             int d1 = frase.charAt(0) - '0';
             int d2 = frase.charAt(2) - '0';
             if (d1 == d2){
                 System.out.println(d1 * d2);
             } else if (Character.isUpperCase(frase.charAt(1))){
                 System.out.println(d2 - d1);
             } else{
                 System.out.println(d1 + d2);
             }
        }
        
        
        
    }
}
