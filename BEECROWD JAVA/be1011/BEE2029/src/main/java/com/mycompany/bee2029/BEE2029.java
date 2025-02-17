/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


package com.mycompany.bee2029;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author bruno
 */
public class BEE2029 {

    public static void main(String[] args) throws IOException {
       InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        double PI = 3.14;

        while (in.ready()) {
            double V = Double.parseDouble(in.readLine());
            double D = Double.parseDouble(in.readLine());

            D /= 2;

            double area = PI * D * D;
            double altura = V / area;

            System.out.printf("ALTURA = %.2f\n", altura);
            System.out.printf("AREA = %.2f\n", area);
        }
    }
}
