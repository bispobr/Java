/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1133;

import java.util.Scanner;

/**
 *
 * @author bispo
 */
public class BEE1133 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int x = t.nextInt();
        int y = t.nextInt();
        
        if (x > y){
            int aux = x;
            x = y;
            y = aux;
        }
        
        for (int c = x+1; c < y;c++){
            if ((c % 5 == 2) || (c % 5 == 3)){
                System.out.println(c);
            }
        }
    }
}
