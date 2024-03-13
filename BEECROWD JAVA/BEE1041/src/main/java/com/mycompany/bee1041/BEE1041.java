/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1041;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author bispo
 */
public class BEE1041 {

    public static void main(String[] args) {
       Locale.setDefault(Locale.US);
       Scanner t = new Scanner (System.in);
       float x = t.nextFloat();
       float y = t.nextFloat();
       
       if (x > 0){
           if (y > 0){
               System.out.println("Q1");
           } else if (y < 0 ){
               System.out.println("Q4");
           } else {
               System.out.println("Eixo X");
           }
       } else if (x < 0){
           if(y > 0){
               System.out.println("Q2");
           } else if (y < 0 ){
               System.out.println("Q3");
           } else{
               System.out.println("Eixo X");
           }
       } else{
            if (y > 0){
                System.out.println("Eixo Y");
            } else if (y < 0){
                System.out.println("Eixo Y");
            } else{
                System.out.println("Origem");
            }
       
       
       }
       
        
    }
}
