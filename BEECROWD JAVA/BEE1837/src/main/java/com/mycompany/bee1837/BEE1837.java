/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1837;

import java.util.Scanner;

/**
 *
 * @author bispo
 */
public class BEE1837 {

    public static void main(String[] args) {
       Scanner t = new Scanner(System.in);
       
       int q;
       
       int a = t.nextInt();
       int b = t.nextInt();
       
        if (a >0) {
            if (b >0) {
                q = a / b;
            } else{
                q = (int) Math.ceil((double) a / b);
            }
        } else if (b > 0) {
            q = (int) Math.floor((double) a / b);
        } else{
            q = (int) Math.ceil((double) a / b);
        }
        
         System.out.println(String.format("%d %d", q, a - (b * q)));
    }
}
