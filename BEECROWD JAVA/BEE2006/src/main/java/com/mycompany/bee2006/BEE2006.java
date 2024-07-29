/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee2006;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class BEE2006 {

    public static void main(String[] args) {
         Scanner t = new Scanner(System.in);

        int cha = t.nextInt();
        int cont = 0;

        for (int i = 0; i < 5; i++) {
            int a = t.nextInt();
            
            if (a == cha) {
                cont+=1;
            }
        }
        
        System.out.println(cont);
    }
}
