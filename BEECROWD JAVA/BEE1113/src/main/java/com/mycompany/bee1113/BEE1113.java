/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1113;

import java.util.Scanner;

/**
 *
 * @author bispo
 */
public class BEE1113 {

    public static void main(String[] args) {
        Scanner t = new Scanner (System.in);
        while (true){
            int x = t.nextInt();
            int y = t.nextInt();
            if (x == y){
                break;
            }
            
            if (x > y){
                System.out.println("Decrescente");
            } else{
                System.out.println("Crescente");
            }
        }
    }
}
