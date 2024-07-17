/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bee1534;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author bispo
 */
public class BEE1534 {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        while (in.ready()) {
            int n = Integer.parseInt(in.readLine());

            int m[][] = new int[n][n];

            for (int linha = 0; linha < n; linha++) {
                for (int coluna = 0; coluna < n; coluna++) {

                    
                    if (linha + coluna == n - 1) {
                        m[linha][coluna] = 2;
                    }else if (linha == coluna) {
                        m[linha][coluna] = 1;
                    }  else {
                        m[linha][coluna] = 3;
                    }
                }
            }

            for (int linha = 0; linha < n; linha++) {
                for (int coluna = 0; coluna < n; coluna++) {
                    System.out.print(m[linha][coluna]);
                }
                System.out.print("\n");
            }
        }

    }
}
