/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bee2369;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class BEE2369 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        int n = t.nextInt();
        
        if (n <= 10) {
            System.out.println(7);
        } else if (n <= 30) {
            System.out.println(n - 3);
        } else if (n <= 100) {
            System.out.println(27 + (n - 30) * 2);  
        } else {
            System.out.println(167 + (n - 100) * 5);
        }
    }
}
