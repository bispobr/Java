/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bee1793;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class BEE2187 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        var teste = 1;
                
        while (true) {
            int n = t.nextInt();

            if (n ==  0) {
                break;
            }
            System.out.println("Teste "+ teste);
            teste+=1;

            int   i =  n / 50;
            double resto = n % 50;
            int j = (int) (resto / 10);
            resto = resto % 10;
            int k = (int) (resto / 5);
            resto = resto % 5;
            int l = (int) (resto / 1);

            System.out.println(i + " " + j + " " + k + " "+ l);
            System.out.println();
        }
    }
}
