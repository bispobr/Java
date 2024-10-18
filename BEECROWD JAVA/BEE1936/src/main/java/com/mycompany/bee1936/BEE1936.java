/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1936;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class BEE1936 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
        int fatorial[] = {40320, 5040, 720, 120, 24, 6, 2, 1};
        
        int n = t.nextInt();
        
        int resultado=0;
        
        for (int i = 0; i < 8; i++) {
            resultado += Math.floor(n / fatorial[i]);
            n %= fatorial[i];
        }
        
        System.out.println(resultado);
    }
}
