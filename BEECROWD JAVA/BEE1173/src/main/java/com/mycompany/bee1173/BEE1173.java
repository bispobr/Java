/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1173;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class BEE1173 {

    public static void main(String[] args) {
        Scanner t = new Scanner (System.in);
        int n[] = new int [10];
        
        n[0] = t.nextInt();
        
        for (int c = 0; c <=8;c++){
            n[c+1] = n[c] * 2;
            
        }
        
        for (int d = 0; d<=9;d++){
            System.out.println("N["+d+"] = " +n[d]);
        }
        
    }
}
