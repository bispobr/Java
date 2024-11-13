/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee2339;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class BEE2339 {

    public static void main(String[] args) {
         Scanner t = new Scanner(System.in);

        int a = t.nextInt();
        int b = t.nextInt();
        int c = t.nextInt();
        
        System.out.println((a * c <= b)?"S":"N");

    }
}
