/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bee2375;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class BEE2375 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        int n = t.nextInt();

        int b = t.nextInt();
        int c = t.nextInt();
        int d = t.nextInt();

        System.out.println((n <= b && n <= c & n <= d) ? "S" : "N");
    }
}
