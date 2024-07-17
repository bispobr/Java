/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1589;

import java.util.Scanner;

/**
 *
 * @author bispo
 */
public class BEE1589 {

    public static void main(String[] args) {
         Scanner t = new Scanner(System.in);
         
         int n = t.nextInt();
         
         for (int i = 0; i < n; i++) {
            int r1 = t.nextInt();
            int r2 = t.nextInt();
            
             System.out.println(r1+r2);
        }
    }
}
