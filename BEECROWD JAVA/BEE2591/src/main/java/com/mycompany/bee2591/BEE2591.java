/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bee2591;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class BEE2591 {

    public static int contadorCaractere(String str, char character, int inicio, int fim) {

        int count = 0;

        for (int i = inicio; i < fim; i++) {
            if (str.charAt(i) == character) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        int n = t.nextInt();

        for (int i = 0; i < n; i++) {

            String entrada = t.next();
            int posicao = entrada.indexOf("k");

            int cont1 = contadorCaractere(entrada, 'a', 0, posicao);
            int cont2 = contadorCaractere(entrada, 'a', posicao, entrada.length());

            String resposta = "k";

            for (int j = 0; j < cont1 * cont2; j++) {
                resposta += "a";
            }
            
            System.out.println(resposta);

        }
    }
}
