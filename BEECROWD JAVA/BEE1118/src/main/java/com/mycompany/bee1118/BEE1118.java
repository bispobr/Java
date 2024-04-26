/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1118;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author bispo
 */
public class BEE1118 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner t = new Scanner(System.in);
        float soma = 0;
        int cont = 0 ;
        while (cont <2){
            
            float nota = t.nextFloat();
            
            if (nota > 0 && nota <= 10){
                soma+=nota;
                cont+=1;
            } else{
               System.out.println("nota invalida"); 
            }
            
            if (cont == 2 ){
                System.out.println(String.format("media = %.2f", soma/2));
                cont = 0;
                soma = 0;
                System.out.println("novo calculo (1-sim 2-nao)");
                int x = t.nextInt();
                
                if (x == 1){
                    continue;
                } else if (x == 2){
                    break;
                }
                
                while(x !=2 ){
                    System.out.println("novo calculo (1-sim 2-nao)");
                     x = t.nextInt();
                     if (x == 1){
                         break;
                     }
                }
                
                if (x==1){
                    continue;
                } else if (x == 2){
                    break;
                }
            }
        }
        
    }
}
