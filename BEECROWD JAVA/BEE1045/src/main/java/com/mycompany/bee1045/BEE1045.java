/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1045;

import static java.util.Arrays.sort;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author bispo
 */
public class BEE1045 {

    public static void main(String[] args) {
       Locale.setDefault(Locale.US);
       Scanner t = new Scanner (System.in);
       float a1 = t.nextFloat();
       float b2 = t.nextFloat();
       float c3 = t.nextFloat();
      
       float vetor[] = {a1,b2,c3};
       sort(vetor);
       
       float a = vetor[2];
       float b = vetor[1];
       float c = vetor[0];
       
     
       if (a >= b + c){
            System.out.println("NAO FORMA TRIANGULO");
       }else if(Math.pow(a, 2) == (Math.pow(b, 2)) + (Math.pow(c, 2))){
           System.out.println("TRIANGULO RETANGULO");
       } else if (Math.pow(a, 2) >  (Math.pow(b, 2)) + (Math.pow(c, 2))  ){
           System.out.println("TRIANGULO OBTUSANGULO");
       } else if (Math.pow(a, 2) < (Math.pow(b, 2)) + (Math.pow(c, 2))){
           System.out.println("TRIANGULO ACUTANGULO");
       }
       
       if(a==b & b==c){
           System.out.println("TRIANGULO EQUILATERO");
       } else if(a==b || b==c){
           System.out.println("TRIANGULO ISOSCELES");
       }
    }
}
