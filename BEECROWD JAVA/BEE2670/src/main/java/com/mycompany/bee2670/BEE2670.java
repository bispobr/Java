/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee2670;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class BEE2670 {

    public static void main(String[] args) {
       Scanner t = new Scanner(System.in);
        
        int a = t.nextInt();
        int b = t.nextInt();
        int c = t.nextInt();
        
        System.out.println(Math.min(a * 4 + b*2, Math.min(a * 2 + c * 2, b * 2 + c * 4)));
         
    }
}
