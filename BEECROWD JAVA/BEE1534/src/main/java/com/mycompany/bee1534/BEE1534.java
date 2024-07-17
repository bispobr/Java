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
    
        while(in.ready()){
            int N = Integer.parseInt(in.readLine());

            for(int i = 0; i < N; ++i){
                for(int j = 0; j < N; ++j){
                    if(i == N - 1 - j){
                        System.out.print(2);
                    }else if(i == j){
                        System.out.print(1);
                    }else{
                        System.out.print(3);
                    }
                }
                System.out.print("\n");
            }
        }
    }
}
