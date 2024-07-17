/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bee1789;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author bispo
 */
public class BEE1789 {

    public static void main(String[] args) throws IOException {
       InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
    
        while(in.ready()){
            int N = Integer.parseInt(in.readLine());

            String[] entrada = in.readLine().trim().split(" ");
            int maior = Integer.parseInt(entrada[0]);
            for(int i = 1; i < N; ++i){
                int numero = Integer.parseInt(entrada[i]);

                if(numero > maior){
                    maior = numero;
                }
            }

            if(maior < 10){
                System.out.println(1);
            }else if(maior < 20){
                System.out.println(2);
            }else{
                System.out.println(3);
            }
        }

    }
}
