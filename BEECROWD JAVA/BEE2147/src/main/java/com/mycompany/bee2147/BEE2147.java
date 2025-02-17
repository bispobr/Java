/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee2147;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author bruno
 */
public class BEE2147 {

    public static void main(String[] args) throws IOException {
         InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        while (in.ready()) {
            int C = Integer.parseInt(in.readLine());
            for (int i = 0; i < C; ++i) {
                String galopeira = in.readLine();
                System.out.printf("%.2f\n", 0.08 + 0.01 * (galopeira.length() - 8));
            }
        }
    }
}
