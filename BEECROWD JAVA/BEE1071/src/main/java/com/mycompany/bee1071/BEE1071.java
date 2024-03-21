/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1071;

import java.util.Scanner;

/**
 *
 * @author bispo
 */
public class BEE1071 {

    public static void main(String[] args) {
        Scanner  t = new Scanner (System.in);
        int x = t.nextInt();
        int y = t.nextInt();
        int maior = 0;
        int menor = 0;
        int soma = 0;
        if(x > y){
            maior  = x;
            menor = y + 1;
        }else {
            maior  = y;
            menor = x + 1;
        }
        
        for (int c = menor; c < maior;c++){
            if (c % 2 != 0){
                soma = soma + c;
            }
        }
        
        System.out.println(soma);
            
        
    }
}
