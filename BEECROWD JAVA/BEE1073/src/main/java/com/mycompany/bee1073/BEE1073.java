/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1073;

import java.util.Scanner;

/**
 *
 * @author bispo
 */
public class BEE1073 {

    public static void main(String[] args) {
        Scanner t = new Scanner (System.in);
        int n = t.nextInt();
        for (int c = 1; c<=n;c++){
            if (c % 2 ==0){
                System.out.println(c + "^2 = " + String.format("%.0f", Math.pow(c, 2)) );
            }
        }
        System.out.println("Hello World!");
    }
}
