/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1050;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author bispo
 */
public class BEE1050 {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        
        int DDD = Integer.parseInt(in.readLine());
        
        switch(DDD){
            case 61:    System.out.printf("Brasilia\n");
                        break;
            case 71:    System.out.printf("Salvador\n");
                        break;
            case 11:    System.out.printf("Sao Paulo\n");
                        break;
            case 21:    System.out.printf("Rio de Janeiro\n");
                        break;
            case 32:    System.out.printf("Juiz de Fora\n");
                        break;
            case 19:    System.out.printf("Campinas\n");
                        break;
            case 27:    System.out.printf("Vitoria\n");
                        break;
            case 31:    System.out.printf("Belo Horizonte\n");
                        break;
            default:    System.out.printf("DDD nao cadastrado\n");
                        break;
        }
        
       
    }
}
