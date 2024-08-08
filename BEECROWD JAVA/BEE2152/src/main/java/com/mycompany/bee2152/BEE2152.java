/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bee2152;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class BEE2152 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        int casos = t.nextInt();

        for (int i = 0; i < casos; i++) {
            int hora = t.nextInt();
            int minuto = t.nextInt();
            int porta = t.nextInt();

            System.out.printf("%02d:%02d - A porta %s!\n", hora, minuto, porta == 1 ? "abriu" : "fechou");
        }
    }
}
