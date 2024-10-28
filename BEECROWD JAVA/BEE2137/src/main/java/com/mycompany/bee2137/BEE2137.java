/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee2137;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;



public class BEE2137 {

    public static void main(String[] args) throws IOException {
       InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        while(in.ready()){
            int N = Integer.parseInt(in.readLine());

            String[] codigos = new String[N];
            for(int i = 0; i < N; ++i){
                codigos[i] = in.readLine().trim();
            }

            Arrays.sort(codigos);

            for(int i = 0; i < N; ++i){
                System.out.println(codigos[i]);
            }
        }
    }
}
