/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee2582;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class BEE2582 {

    public static void main(String[] args) {
          Scanner t = new Scanner(System.in);
          
          String musicas[] = {"PROXYCITY", "P.Y.N.G.", "DNSUEY!", "SERVERS", "HOST!", "CRIPTONIZE",
                "OFFLINE DAY", "SALT", "ANSWER!", "RAR?", "WIFI ANTENNAS"};

        int valor = t.nextInt();

        for (int i = 0; i < valor; i++) {
           int valor1 = t.nextInt();
           int valor2 = t.nextInt();
            System.out.println(musicas[valor1 + valor2]);
        }
    }
}
