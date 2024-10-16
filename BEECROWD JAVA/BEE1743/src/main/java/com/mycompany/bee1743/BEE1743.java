/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bee1743;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class BEE1743 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int tomada1[] = new int[5];
        int tomada2[] = new int[5];
        boolean possivel = true;

        for (int i = 0; i < 5; i++) {
            tomada1[i] = t.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            tomada2[i] = t.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            if (tomada1[i] == tomada2[i]) {
                possivel = false;
                break;
            }
        }
        
        System.out.println(possivel ? "Y" : "N");
    }
}
