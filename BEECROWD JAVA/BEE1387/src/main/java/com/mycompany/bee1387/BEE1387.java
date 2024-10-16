/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1387;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class BEE1387 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
        while(true){
            int l = t.nextInt();
            int r = t.nextInt();
            
            if (l== 0 & r == 0) {
                break;
            }
            
            System.out.println(l + r);
        }
    }
}
