/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1132;

import java.util.Scanner;

/**
 *
 * @author bispo
 */
public class BEE1132 {

    public static void main(String[] args) {
        Scanner t = new Scanner (System.in);
        int soma = 0;
        int x = t.nextInt();
        int y = t.nextInt();
        
        if (x > y){
            int aux = x;
            x = y;
            y = aux;
        }
        
        for (int c = x;c<=y;c++){
            if (c % 13 != 0){
                soma+=c;
            }
        }
        
        System.out.println(soma);
    }
}
