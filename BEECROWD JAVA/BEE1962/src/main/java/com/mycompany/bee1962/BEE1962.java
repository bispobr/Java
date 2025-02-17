/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1962;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author bruno
 */
public class BEE1962 {

    public static void main(String[] args) throws IOException {
       InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        int N = Integer.parseInt(in.readLine().trim());
        for (int i = 0; i < N; ++i) {
            int T = Integer.parseInt(in.readLine().trim());

            T = 2015 - T;

            if (T <= 0) {
                System.out.printf("%d A.C.\n", 1 - T);
            } else {
                System.out.printf("%d D.C.\n", T);
            }
        }
    }
}
