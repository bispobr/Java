/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1075;

import java.util.Scanner;

/**
 *
 * @author bispo
 */
public class BEE1075 {

    public static void main(String[] args) {
        Scanner t = new Scanner (System.in);
        int valor = t.nextInt();
        for (int c = 1; c <10000;c++ ){
            if (c % valor == 2){
                System.out.println(c);
            }
        }
        
    }
}
