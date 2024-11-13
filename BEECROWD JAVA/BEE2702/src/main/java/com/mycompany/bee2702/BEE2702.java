/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee2702;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class BEE2702 {

    public static void main(String[] args) {
        Scanner t = new Scanner (System.in);
        int r[] = new int [3];
        int p[] = new int [3];
        
        int res = 0;
        
        for (int i = 0; i < 3; i++) {
            r[i] = t.nextInt();
        }
        
        for (int i = 0; i < 3; i++) {
            p[i] = t.nextInt();
        }
        
        for (int i = 0; i < 3; i++) {
            if (p[i] > r[i]) {
               res += p[i] - r[i]; 
            }
        }
        
        System.out.println(res);
        
    }
}
