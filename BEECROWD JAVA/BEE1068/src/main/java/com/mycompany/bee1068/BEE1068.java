/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bee1068;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

// corigir

public class BEE1068 {

    public static void main(String[] args) throws IOException {

        Scanner t = new Scanner(System.in);
        while (t.hasNextLine()) {
            String expressao = t.next();

            int i;
            Deque<String> pilha = new ArrayDeque<>();

            for (i = 0; i < expressao.length(); ++i) {
                if (expressao.charAt(i) == '(') {
                    pilha.push("(");
                } else if (expressao.charAt(i) == ')') {
                    if (pilha.isEmpty()) {
                        break;
                    }
                    pilha.pop();
                }
            }

            if (i == expressao.length() && pilha.isEmpty()) {
                System.out.println("correct");
            } else {
                System.out.println("incorrect");
            }

        }
        t.close();
    }
}
