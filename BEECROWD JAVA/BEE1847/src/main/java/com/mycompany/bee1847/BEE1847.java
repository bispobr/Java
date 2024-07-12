/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1847;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class BEE1847 {

    public static void main(String[] args) {
         Scanner t = new Scanner(System.in);
         int A = t.nextInt();
         int B = t.nextInt();
         int C = t.nextInt();
         
         if (B < A && C >= B) {
            System.out.println(":)");
        } else if (B > A && C <= B) {
            System.out.println(":(");
        } else if (B > A && C > B && C - B < B - A) {
            System.out.println(":(");
        } else if (B > A && C > B && C - B >= B - A) {
            System.out.println(":)");
        } else if (B < A && C < B && B - C < A - B) {
            System.out.println(":)");
        } else if (B < A && C < B && B - C >= A - B) {
            System.out.println(":(");
        } else if (A == B) {
            if (C > B) {
                System.out.println(":)");
            } else {
                System.out.println(":(");
            }
        }
                 
    }
}
