/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1184;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class BEE1184 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner t =  new Scanner(System.in);
        double m [] [] = new double [4] [4];
        double soma=0;
        int cont = 0;
        
        char o = t.next().charAt(0);
        
        for (int linha = 0;linha <4;linha++){
            for (int coluna = 0;coluna <4;coluna++){
                m[linha][coluna] = t.nextDouble();
                
                if (linha > coluna){
                    soma += m[linha][coluna];
                    cont +=1;
                }
            }
        }
        
        if (o == 'S'){
            System.out.printf("%.1f\n",soma);
        } else{
            System.out.printf("%.1f\n",soma/cont);
        }
        System.out.printf("%.1f\n",soma/cont);
    }
}
