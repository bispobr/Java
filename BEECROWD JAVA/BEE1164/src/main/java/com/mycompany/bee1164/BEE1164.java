/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1164;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class BEE1164 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int casos = t.nextInt();
        for (int c = 0;c <casos;c++){
            int valor = t.nextInt();
            int soma = 0;
            for (int d = 1;d < valor;d++){
                if (valor % d == 0){
                    soma+=d;
                }
            } 
            System.out.println((soma == valor)? valor + " eh perfeito" : valor + " nao eh perfeito");
        }
    }
}
