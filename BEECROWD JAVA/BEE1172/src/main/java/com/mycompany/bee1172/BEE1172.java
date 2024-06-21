/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1172;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class BEE1172 {

    public static void main(String[] args) {
        Scanner t = new Scanner (System.in);
        int x[] = new int [10];
        
        for (int c = 0; c <=9;c++){
            int valor = t.nextInt();
            
            if (valor <=0){
                x[c] = 1;
            } else {
                x[c] = valor;
            } 
        }
        
        for (int e = 0; e <=9;e++){
            System.out.println("X["+e+"] = "+x[e] );
        }
    }
}
