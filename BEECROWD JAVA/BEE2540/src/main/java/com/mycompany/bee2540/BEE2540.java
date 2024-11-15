/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee2540;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BEE2540 {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        while (in.ready()) {
            int N = Integer.parseInt(in.readLine());
            String[] votos = in.readLine().trim().split(" ");

            int soma = 0;
            for (int i = 0; i < N; ++i) {
                soma += Integer.parseInt(votos[i]);
            }

            System.out.println(soma >= 2.0 * N / 3.0 ? "impeachment" : "acusacao arquivada");
        }
    }
}
