/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1180;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class BEE1180 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
        int n = t.nextInt();
        
        int x[] = new int [n];
        int pos = 99999;
        int menorValor = 99999;
        
        for (int c = 0; c <n;c++){
            int valor = t.nextInt();
            x[c] = valor;
            if (x[c] < menorValor ){
                menorValor = x[c];
                pos = c;
            }
        }
        
        System.out.println("Menor valor: "+menorValor);
        System.out.println("Posicao: "+pos);
    }
}
