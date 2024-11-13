/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee2554;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BEE2554 {

    public static void main(String[] args) throws IOException {
         InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        while (in.ready()) {
            String[] entrada = in.readLine().trim().split(" ");
            int N = Integer.parseInt(entrada[0]);
            int D = Integer.parseInt(entrada[1]);

            String melhorData = null;
            for (int i = 0; i < D; ++i) {
                entrada = in.readLine().trim().split(" ");

                int pessoas = 0;
                for (int j = 1; j <= N; ++j) {
                    pessoas += Integer.parseInt(entrada[j]);
                }

                if (pessoas == N && melhorData == null) {
                    melhorData = entrada[0];
                }
            }

            if (melhorData == null) {
                System.out.println("Pizza antes de FdI");
            } else {
                System.out.println(melhorData);
            }
        }
    }
}
