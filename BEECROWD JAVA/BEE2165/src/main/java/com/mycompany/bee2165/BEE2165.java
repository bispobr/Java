/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee2165;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class BEE2165 {

    public static void main(String[] args) {
       Scanner t = new Scanner(System.in);
    
       String nome = t.nextLine();
       System.out.println(nome.length() <= 140 ? "TWEET" : "MUTE");
    }
}
