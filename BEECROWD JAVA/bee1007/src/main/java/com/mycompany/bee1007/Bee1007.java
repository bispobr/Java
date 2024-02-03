/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1007;

import java.util.Scanner;

/**
 *
 * @author n
 */
public class Bee1007 {

    public static void main(String[] args) {
        Scanner t = new Scanner (System.in);
        int a = t.nextInt();
        int b = t.nextInt();
        int c = t.nextInt();
        int d = t.nextInt();
        int dif = ((a*b)-(c*d));
        System.out.println("DIFERENCA = " + dif);
    }
}
