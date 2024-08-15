/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bee2163;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class BEE2163 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        boolean sair = true;

        while (sair) {

            int casos = t.nextInt();
           

            for (int i = 0; i < casos; i++) {

                int mesas = t.nextInt();

                if (mesas == 0) {
                    sair = false;
                    break;
                }

                if (mesas % 2 == 0) {
                    System.out.println((mesas * 2) - 2);
                } else {
                    System.out.println((mesas * 2) - 1);
                }
            }

        }
    }
}
