/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee2547;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author bruno
 */
public class BEE2547 {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        while (in.ready()) {
            String[] entrada = in.readLine().trim().split(" ");
            int N = Integer.parseInt(entrada[0]);
            int Amin = Integer.parseInt(entrada[1]);
            int Amax = Integer.parseInt(entrada[2]);

            int visitantes = 0;
            for (int i = 0; i < N; ++i) {
                int A = Integer.parseInt(in.readLine());

                if (A >= Amin && A <= Amax) {
                    visitantes += 1;
                }
            }

            System.out.println(visitantes);
        };
    }
}
