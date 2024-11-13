/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee2551;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BEE2551 {

    public static void main(String[] args) throws IOException {
         InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        while (in.ready()) {
            int N = Integer.parseInt(in.readLine());

            double Vmax = 0;
            for (int i = 1; i <= N; ++i) {
                String[] entrada = in.readLine().trim().split(" ");
                int T = Integer.parseInt(entrada[0]);
                int D = Integer.parseInt(entrada[1]);

                double V = (double) D / T;
                if (V > Vmax) {
                    Vmax = V;
                    System.out.println(i);
                }
            }
        }
    }
}
