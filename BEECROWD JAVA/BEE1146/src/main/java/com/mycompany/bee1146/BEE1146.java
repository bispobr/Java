/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1146;

import java.util.Scanner;

/**
 *
 * @author bispo
 */
public class BEE1146 {

    public static void main(String[] args) {
        Scanner t = new Scanner (System.in);
        
        int x = -1;
        
        while (x != 0){
             x = t.nextInt();
             for (int c = 1;c <= x;c++){
                  System.out.printf("%d ", c);
             }
        }
    }
}
