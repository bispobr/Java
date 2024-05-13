/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1156;

/**
 *
 * @author bispo
 */
public class BEE1156 {

    public static void main(String[] args) {
        double S = 0.0;
        
         for (int i = 0; i < 20; ++i) {
            S += (double) (2 * i + 1) / (1 << i);
        }

        System.out.printf("%.2f\n", S);
    }
}
