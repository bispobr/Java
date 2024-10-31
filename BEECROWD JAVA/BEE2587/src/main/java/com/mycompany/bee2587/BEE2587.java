/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bee2587;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class BEE2587 {

    public static List<Integer> encontrarOcorrencias(String texto, char caractere) {
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == caractere) {
                indices.add(i);
            }
        }
        return indices;
    }

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        int n = t.nextInt();

        for (int i = 0; i < n; i++) {

            String palavra1 = t.next();
            String palavra2 = t.next();
            String palavra3 = t.next();

            List<Integer> posicoes = encontrarOcorrencias(palavra3, '_');

            int p1 = posicoes.get(0);
            int p2 = posicoes.get(1);

            System.out.println((palavra1.charAt(p2) == palavra2.charAt(p1) || palavra1.charAt(p1) == palavra2.charAt(p2)) ? "Y" : " N");
        }
    }
}
