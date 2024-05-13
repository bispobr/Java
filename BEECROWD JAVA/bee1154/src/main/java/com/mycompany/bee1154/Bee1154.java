/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1154;

import java.util.Scanner;

/**
 *
 * @author bispo
 */
public class Bee1154 {

    public static void main(String[] args) {
        Scanner t =  new Scanner (System.in);
        int idade = 0;
        int soma = 0;
        int cont = 0;
        double media = 0;
        
        while (true){
            idade = t.nextInt();
            
            if (idade < 0){
                break;
            }
            
            
            soma +=idade;
            cont +=1;
        }
        
        
       System.out.printf("%.2f\n", (double) soma / cont);
    }
}
