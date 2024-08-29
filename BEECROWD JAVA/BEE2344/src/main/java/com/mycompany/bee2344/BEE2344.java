/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bee2344;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class BEE2344 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        int valor = t.nextInt();

        if (valor >= 86) {
            System.out.println("A");
        } else if (valor >= 61) {
            System.out.println("B");
        } else if (valor >= 36) {
            System.out.println("C");
        } else if (valor >= 1) {
            System.out.println("D");
        } else {
            System.out.println("E");
        }
    }
}
