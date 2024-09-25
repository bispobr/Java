/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bee2635;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class BEE2635 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        int n = t.nextInt();
        String palavras[] = new String[n];

        for (int i = 0; i < n; i++) {
            palavras[i] = t.next();
        }

        int q = t.nextInt();

        for (int i = 0; i < q; i++) {
            String busca = t.next();
            int cont = 0;
            int maior = 0;
            for (int j = 0; j < n; j++) {

                if (palavras[j].startsWith(busca)) {
                    cont += 1;
                    if (palavras[j].length() > maior) {
                        maior = palavras[j].length();
                    }
                }
            }
            if (cont > 0) {
                System.out.printf("%d %d\n", cont, maior);
            } else{
                System.out.println(-1);
            }
            
        }
    }
}
