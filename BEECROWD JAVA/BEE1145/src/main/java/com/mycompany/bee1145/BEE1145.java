/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1145;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author bispo
 */
public class BEE1145 {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
    
        String[] entrada = in.readLine().trim().split(" ");
        int X = Integer.parseInt(entrada[0]);
        int Y = Integer.parseInt(entrada[1]);

        for(int i = 1; i <= Y; i += X){
            System.out.print(i);
            for(int j = 1; j < X; ++j){
                if(i + j > Y){
                    break;
                }
                System.out.printf(" %d", i + j);
            }
            System.out.printf("\n");
        }
    }
}
