/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee2057;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class BEE2057 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
        int a = t.nextInt();
        int b = t.nextInt();
        int c = t.nextInt();
        
        int h = 0;
        
        
        if (a == 0) {
            h = 24 + b + c;
        } else {
            h = a + b + c;
        }
        
        if (h == 24) {
            System.out.println(0);
        }else if (h > 24) {
            System.out.println(h - 24);
        } else{
            System.out.println(h);
        }
        
        
    }
}
