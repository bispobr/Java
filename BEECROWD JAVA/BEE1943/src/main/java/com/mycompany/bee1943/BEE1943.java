/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1943;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class BEE1943 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
        int posicao[] = {1, 3, 5, 10, 25, 50 , 100};
        
        int n = t.nextInt();
        
        for (int i = 0; i < 7; i++) {
            if (n <=posicao[i]) {
                System.out.println("Top " + posicao[i]);
                break;
            }
        }
    }
}
