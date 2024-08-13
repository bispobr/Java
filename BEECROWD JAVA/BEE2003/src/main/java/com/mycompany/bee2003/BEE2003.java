/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee2003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Math;

/**
 *
 * @author bruno
 */
public class BEE2003 {

    public static void main(String[] args) throws IOException {
        
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        while (in.ready()) {
            String[] entrada = in.readLine().trim().split(":");
            int hora = Integer.parseInt(entrada[0]);
            int minuto = Integer.parseInt(entrada[1]);

            int total = hora * 60 + minuto;

            System.out.printf("Atraso maximo: %d\n", Math.max(0, total + 60 - 8 * 60));
        }
    }
}
