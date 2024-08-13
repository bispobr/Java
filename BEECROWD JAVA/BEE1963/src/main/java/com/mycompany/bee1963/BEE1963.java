/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1963;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class BEE1963 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
        double a = t.nextDouble();
        double b = t.nextDouble();
        
        System.out.printf("%.2f%%\n", 100 * b / a - 100);
    }
}
