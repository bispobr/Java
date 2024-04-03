/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1300;

import java.util.Scanner;

/**
 *
 * @author bispo
 */
public class BEE1300 {

    public static void main(String[] args) {
        Scanner t = new Scanner (System.in);
        int cont =0;
        while(cont < 7){
            int a = t.nextInt();
        if(a % 6 ==0){
            System.out.println("Y");
        }else{
            System.out.println("N");
        }
        cont+=1;
        }
        
       
    }
}