/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1175;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class BEE1175 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int n[] = new int[10];
        int pos = 9;
        
        for (int c = 0;c<=9;c++){
            n[c] = t.nextInt();
        }
        
        for (int d = 0;d<=5;d++){
            int aux = n[pos];
            n[pos] = n[d];
            n[d] = aux;
            pos-=1;
            
        }
        
        for (int e = 0;e<=19;e++){
            System.out.println("N["+e+"] = "+ n[e]);
        }
        
    }
}