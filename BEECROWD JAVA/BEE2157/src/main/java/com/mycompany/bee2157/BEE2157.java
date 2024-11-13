/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bee2157;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class BEE2157 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        int C = t.nextInt();
        for (int k = 0; k < C; ++k) {
             int inicio = t.nextInt();
              int fim = t.nextInt();

            String resposta = "";
            for (int i = inicio; i <= fim; ++i) {
                resposta += Integer.toString(i);
            }

            int tamanho = resposta.length();
            for (int  i = tamanho - 1; i > -1; --i) {
                resposta += resposta.charAt(i);
            }
            System.out.println(resposta);
        }
    }
}
