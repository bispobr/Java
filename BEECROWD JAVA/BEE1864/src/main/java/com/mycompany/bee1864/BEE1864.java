/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1864;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class BEE1864 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
        char frase [] [] = new char [1] [34];
        String citacao = "LIFE IS NOT A PROBLEM TO BE SOLVED";
        
        for (int i = 0; i < 34; i++) {
            frase [0] [i] = citacao.charAt(i);
        }
        
        
        int n = t.nextInt();
        
        for (int linha = 0; linha < 1; linha++) {
            for (int coluna = 0; coluna < n; coluna++) {
                System.out.print(frase [linha][coluna]);
            }
            System.out.printf("\n ");
        }
    }
}
