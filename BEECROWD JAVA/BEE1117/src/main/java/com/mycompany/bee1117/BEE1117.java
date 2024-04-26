/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1117;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author bispo
 */
public class BEE1117 {

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
            
        }
        System.out.println(String.format("media = %.2f", soma/2));
    }
}
