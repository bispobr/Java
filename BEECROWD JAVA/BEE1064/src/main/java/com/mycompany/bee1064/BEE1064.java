/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1064;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author bispo
 */
public class BEE1064 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner t = new Scanner (System.in);
        int cont = 0;
         int c; 
        float valor;
        float soma = 0 ;
        for ( c = 0; c <= 5;c++){
             valor = t.nextFloat();
            if (valor > 0){
                 cont = cont + 1;
                 soma = soma + valor;
            }
        }
        
        System.out.println( cont + " valores positivos");
        System.out.println(String.format("%.1f", soma / cont));
            
        
    }
}
