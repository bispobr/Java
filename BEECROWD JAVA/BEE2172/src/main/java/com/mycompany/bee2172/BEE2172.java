/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bee2172;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class BEE2172 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        while (true) {
            int a = t.nextInt();
            int b = t.nextInt();

            if (a == 0 && b == 0) {
                break;
            }

            System.out.println(b * a);
        }
    }
}
