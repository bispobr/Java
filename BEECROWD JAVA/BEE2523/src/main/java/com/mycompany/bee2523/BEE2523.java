/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bee2523;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author bruno
 */
public class BEE2523 {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        while (in.ready()) {
            String lampadas = in.readLine();
            int N = Integer.parseInt(in.readLine());
            String[] letras = in.readLine().trim().split(" ");
            for (int i = 0; i < N; ++i) {
                System.out.print(lampadas.charAt(Integer.parseInt(letras[i]) - 1));
            }
            System.out.println("");
        }
    }
}
