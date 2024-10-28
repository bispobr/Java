/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee2694;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class BEE2694 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        int c = t.nextInt();
        
        for (int i = 0; i < c; i++) {
            String caracteres = t.next();
            
            int v1 = Integer.parseInt(caracteres.substring(2, 4));
            int v2 = Integer.parseInt(caracteres.substring(5, 8));
            int v3 = Integer.parseInt(caracteres.substring(11, 13));
            
            System.out.println(v1  + v2 + v3);
        }
    }
}
