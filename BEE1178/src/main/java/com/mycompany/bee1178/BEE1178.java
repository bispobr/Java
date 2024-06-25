/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1178;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class BEE1178 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner t = new Scanner(System.in);
        double n[] = new double [100];
        
        n[0] = t.nextDouble();
        
        for (int c = 0;c <99;c++){
            n[c+1] = n[c] / 2; 
            //System.out.println("N["+c+"] = "+ n[c]);
            System.out.printf("N[%d] = %.4f\n", c, n[c]);
           
        }
       System.out.printf("N[%d] = %.4f\n", 99, n[99]);
        
    }
}
