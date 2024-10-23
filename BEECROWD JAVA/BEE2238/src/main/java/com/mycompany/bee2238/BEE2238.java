/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bee2238;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class BEE2238 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        int n = t.nextInt();

        int valores[] = new int[n];

        for (int i = 0; i < n; i++) {
            valores[i] = t.nextInt();
        }

        int soma = 0;
        for (int num : valores) {
            soma += num;
        }
        System.out.println(soma - n);

    }
}
