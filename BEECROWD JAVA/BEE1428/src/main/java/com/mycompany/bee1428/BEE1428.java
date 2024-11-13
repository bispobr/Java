/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bee1428;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class BEE1428 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        int n = t.nextInt();

        for (int i = 0; i < n; i++) {
            int a = t.nextInt();
            int b = t.nextInt();
            int res = (a / 3) * (b / 3);
            System.out.println(res);
        }

    }
}
