/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bee1546;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class BEE1546 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        int n = t.nextInt();

        for (int i = 0; i < n; i++) {
            int k = t.nextInt();

            for (int j = 0; j < k; j++) {
                int op = t.nextInt();
                switch (op) {
                    case 1 -> System.out.println("Rolien");
                    case 2 -> System.out.println("Naej");
                    case 3 -> System.out.println("Elehcim");
                    case 4 -> System.out.println("Odranoel");
                }
            }

        }
    }
}
