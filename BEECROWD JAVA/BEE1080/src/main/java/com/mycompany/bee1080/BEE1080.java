/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1080;

import java.util.Scanner;

/**
 *
 * @author bispo
 */
public class BEE1080 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int maior = 0;
        int pos = 0;
        for (int c = 0;c<5;c++){
            int valor = t.nextInt();
            if (valor > maior){
                maior = valor;
                pos = c + 1;
            }
        }
        System.out.println(maior);
        System.out.println(pos);
    }
}
