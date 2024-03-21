/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1070;

import java.util.Scanner;

/**
 *
 * @author bispo
 */
public class BEE1070 {

    public static void main(String[] args) {
        Scanner t =  new Scanner (System.in);
        int x = t.nextInt();
        
        for (int c = x; c<=x + 11;c++){
            if (c % 2 !=0){
                System.out.println(c);
            }
            
        }
    }
}
