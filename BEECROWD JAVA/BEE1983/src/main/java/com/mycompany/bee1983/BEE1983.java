/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bee1983;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class BEE1983 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int aluno = 0;
        int maior = 0;

        int alunos = t.nextInt();

        for (int i = 0; i < alunos; i++) {
            int matricula = t.nextInt();
            int nota = t.nextInt();

            if (i == 0) {
                maior = nota;
                aluno = matricula;
            } else if (nota > maior) {
                maior = nota;
                aluno = matricula;
            }

        }
        if (maior < 8.0) {
            System.out.println("Minimum note not reached");
        } else {
            System.out.println(aluno);
        }
    }
}
