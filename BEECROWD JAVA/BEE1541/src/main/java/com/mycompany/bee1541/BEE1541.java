/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1541;

import java.util.Scanner;

/**
 *
 * @author bispo
 */
public class BEE1541 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
        while(true){
            
            int a = t.nextInt();
            
            if (a == 0) {
                break;
            }
            
            int b = t.nextInt();
            int c = t.nextInt();
            
             System.out.println(String.format("%.0f", Math.floor(Math.sqrt(a * b * 100.0 / c))));
        }
    }
}
