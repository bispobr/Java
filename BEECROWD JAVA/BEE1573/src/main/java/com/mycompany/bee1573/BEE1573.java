/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1573;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class BEE1573 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
        while(true){
            int a = t.nextInt();
            int b = t.nextInt();
            int c = t.nextInt();
            
            if (a== 0 & b == 0 & c == 0) {
                break;
            }
            
            System.out.println((int) Math.pow(a * b * c, 1.0 / 3.0));
        }
    }
}
