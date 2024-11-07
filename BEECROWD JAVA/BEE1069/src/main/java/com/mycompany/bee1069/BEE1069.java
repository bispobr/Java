/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1069;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;



public class BEE1069 {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        int N = Integer.parseInt(in.readLine());
        for(int i = 0; i < N; ++i){
            int resposta = 0;
            Stack<Character> pilha = new Stack<Character>();

            char[] expressao = in.readLine().toCharArray();
            for(int j = 0; j < expressao.length; ++j){
                if(expressao[j] == '<'){
                    pilha.push(expressao[j]);
                }else if(expressao[j] == '>' && pilha.size() > 0){
                    pilha.pop();
                    resposta += 1;
                }
            }

            System.out.println(resposta);
        }
    }
}
