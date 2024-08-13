/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee2176;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class BEE2176 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
        int pares = 0;
        String valor = t.next();
        for (int i = 0; i < valor.length(); ++i) {
            pares += valor.charAt(i) == '1' ? 1 : 0;
        }

        System.out.printf("%s%d\n", valor, pares % 2);
    }
}
