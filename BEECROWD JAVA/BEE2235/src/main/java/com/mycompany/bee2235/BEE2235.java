/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee2235;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class BEE2235 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        int A = t.nextInt();
        int B = t.nextInt();
        int C = t.nextInt();
        
        if (A == B || A == C || B == C || A + B == C || A + C == B || B + C == A) {
            System.out.println("S");
        } else {
            System.out.println("N");
        }
    }
}
