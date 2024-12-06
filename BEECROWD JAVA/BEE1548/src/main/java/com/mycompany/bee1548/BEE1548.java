/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1548;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class BEE1548 {

    public static void main(String[] args) throws IOException {
         InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        int N = Integer.parseInt(in.readLine());
        for(int k = 0; k < N; ++k){
            int M = Integer.parseInt(in.readLine());

            String[] alunos = in.readLine().trim().split(" ");
            Integer[] notas = new Integer[M];
            for(int i = 0; i < M; ++i){
                notas[i] = Integer.parseInt(alunos[i]);
            }

            Arrays.sort(notas, Collections.reverseOrder());

            int resposta = 0;
            for(int i = 0; i < M; ++i){
                if(Integer.parseInt(alunos[i]) == notas[i]){
                    resposta += 1;
                }
            }
            System.out.println(resposta);
        }
    }
}
