/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1379;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class BEE1379 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
        while(true){
            int a = t.nextInt();
            int b = t.nextInt();
            
            if (a== 0 & b == 0) {
                break;
            }
            
            System.out.println(2 * a - b);
        }
    }
}
