/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1187;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class BEE1187 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner t = new Scanner(System.in);
        double m[][] = new double [12][12];
        double soma = 0;
        int cont = 0;
        
        char o = t.next().charAt(0);
        
        for (int linha = 0;linha <12;linha++){
            for (int coluna = 0;coluna <12;coluna++){
                m[linha][coluna] = t.nextDouble();
                if ((coluna + linha < 12-1) & (coluna > linha)){
                    soma += m[linha][coluna];
                    cont += 1;
                            
                }
            }
        }
        
        if (o== 'S'){
            System.out.printf("%.1f\n",soma);
        } else{
            System.out.printf("%.1f\n",soma/cont);
        }
        
    }
}
