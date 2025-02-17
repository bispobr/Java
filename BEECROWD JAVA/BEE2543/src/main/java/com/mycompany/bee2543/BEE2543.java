/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee2543;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author bruno
 */
public class BEE2543 {

    public static void main(String[] args) throws IOException {
      InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        while (in.ready()) {
            String[] entrada = in.readLine().trim().split(" ");
            int N = Integer.parseInt(entrada[0]);
            String I = entrada[1];

            int gameplays = 0;
            for (int i = 0; i < N; ++i) {
                entrada = in.readLine().trim().split(" ");

                if (entrada[0].equals(I) && entrada[1].equals("0")) {
                    ++gameplays;
                }
            }
            System.out.println(gameplays);
        }    
    }
}
