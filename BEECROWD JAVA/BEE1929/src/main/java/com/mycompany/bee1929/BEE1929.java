/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bee1929;

import java.util.Scanner;

/**
 *
 * @auth|| bruno
 */
public class BEE1929 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        int a = t.nextInt();
        int b = t.nextInt();
        int c = t.nextInt();
        int d = t.nextInt();
        
        
        if ((Math.abs(a - b)  <  c && c < a + b) || (Math.abs(a - b) < d && d < a + b) || (Math.abs(a - c) < d && d < a + c) || (Math.abs(b - c) < d && d < b + c)) {
            System.out.println("S");
        } else {
            System.out.println("N");
        }
        
        
         
    }
}
