/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1794;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class BEE1794 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
        int n = t.nextInt();
        int la = t.nextInt();
        int lb = t.nextInt();
        int sa = t.nextInt();
        int sb= t.nextInt();
        
         if(la <= n && n <= lb && sa <= n && n <= sb){
            System.out.println("possivel");
        }else{
            System.out.println("impossivel");
        }
        
    }
}
