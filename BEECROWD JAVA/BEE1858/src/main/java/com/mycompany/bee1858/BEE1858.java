/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1858;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class BEE1858 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int menor = 25;
        int pos = 100;
        int n = t.nextInt();
        
        for (int i = 0; i < n; i++) {
            int valor = t.nextInt();
            
            if (valor < menor) {
                menor = valor;
                pos =  i;
            }
        }
        System.out.println(pos + 1);
    }
}
