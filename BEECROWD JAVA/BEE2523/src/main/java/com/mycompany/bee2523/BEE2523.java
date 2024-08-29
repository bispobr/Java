/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bee2523;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class BEE2523 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        String Frase = t.nextLine();
        
        int valor = t.nextInt();

        for (int i = 0; i < valor; i++) {
            int letra = t.nextInt();
            System.out.print(Frase.charAt(letra - 1));
        }
    }
}
