/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bee2721;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class BEE2721 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        String renas[] = {"Rudolph", "Dasher", "Dancer", "Prancer", "Vixen", "Comet", "Cupid", "Donner", "Blitzen"};
        int soma = 0;
        
        for (int i = 0; i < 9; i++) {
            soma += t.nextInt();
        }

        System.out.println(renas[soma % 9]);
    }
}
