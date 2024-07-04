/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1181;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class BEE1181 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner t = new Scanner(System.in);
        
        double m[][] = new double [12][12];
        double soma = 0.0;
        
        
       int l = t.nextInt();
       char T = t.next().charAt(0);
     
       
       for (int linha = 0;linha <12;linha++){
           for (int coluna = 0;coluna <12;coluna++){
               m[linha][coluna] = t.nextDouble();
               if (linha == l){
                   soma += m[l][coluna];
               }
           }
       }
       
       if (T == 'S'){
           System.out.printf("%.1f\n", soma);
       } else{
           System.out.printf("%.1f\n", soma/12);
       }
        
        
        
    }
}
