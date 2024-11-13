/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bee3358;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class BEE3358 {

    public static boolean caractereVetor(String[] array, char character) {
        for (String str : array) {
            if (str.indexOf(character) != -1) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        int n = t.nextInt();

        for (int i = 0; i < n; i++) {

            String sobrenome = t.next();

            boolean dificil = false;

            int tam = sobrenome.length() - 2;

            String vogais[] = {"a", "e", "i", "o", "u", "A", "E", "I", "O", "U"};

            for (int j = 0; j < tam; j++) {

                if (!caractereVetor(vogais, sobrenome.charAt(j))) {
                    if (!caractereVetor(vogais, sobrenome.charAt(j + 1))) {
                        if (!caractereVetor(vogais, sobrenome.charAt(j + 2))) {
                            dificil = true;
                        }

                    }
                }

            }

            System.out.println((dificil) ? sobrenome + " nao eh facil" : sobrenome + " eh facil");

        }
    }
}
