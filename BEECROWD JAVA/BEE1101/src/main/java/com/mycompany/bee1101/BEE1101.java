/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1101;

import java.util.Scanner;

/**
 *
 * @author bispo
 */
public class BEE1101 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        while (true) {
            int m = t.nextInt();
            int n = t.nextInt();
            if (m == 0 || n == 0){
                break;
            }
            
            if (m > n){
                int aux;
                aux = m;
                m=n;
                n=aux;
            }
            int soma = 0;
            for (int c = m; c <= n;c++){
                 System.out.printf("%d ", c);
                soma += c;
            }
           System.out.printf("Sum=%d\n", soma);
        }
    }
}
