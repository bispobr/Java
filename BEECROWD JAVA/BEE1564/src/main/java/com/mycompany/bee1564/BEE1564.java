/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1564;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author bruno
 */
public class BEE1564 {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        while(in.ready()){
            int n = Integer.parseInt(in.readLine());
             System.out.println((n > 0)?"vai ter duas!":"vai ter copa!");
        }
        
        
        
        
       
    }
}
