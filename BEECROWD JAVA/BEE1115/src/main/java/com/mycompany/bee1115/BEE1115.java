/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1115;

import java.util.Scanner;

/**
 *
 * @author bispo
 */
public class BEE1115 {

    public static void main(String[] args) {
        Scanner t = new Scanner (System.in);
        
        while (true){
            int x = t.nextInt();
            int y = t.nextInt();
            
            if (x == 0 || y == 0){
                break;
            }
            
            if (x > 0){
                if (y > 0){
                    System.out.println("primeiro");
                } else if (y < 0){
                    System.out.println("quarto");
                }
            } else if (x < 0){
                if (y > 0){
                    System.out.println("segundo");
                } else if (y < 0){
                    System.out.println("terceiro");
                }
            }
        }
    }
}
