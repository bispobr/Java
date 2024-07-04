/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1174;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class BEE1174 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner t = new Scanner(System.in);
        float a[] = new float [10];
        
        for (int c = 0;c<10;c++){
            a[c] = t.nextFloat();
            
            if (a[c] <= 10){
                System.out.println("A["+c+"] = "+ a[c]);
            }
            
        }
    }
}
