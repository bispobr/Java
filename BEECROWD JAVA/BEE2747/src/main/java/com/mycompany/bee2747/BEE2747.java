/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee2747;


public class BEE2747 {
     public static void linha() {
        for (int i = 0; i < 39; ++i) {
            System.out.print('-');
        }
        System.out.print('\n');
    }
     
     public static void meio() {
        System.out.print('|');
        for (int i = 0; i < 37; ++i) {
            System.out.print(' ');
        }
        System.out.print("|\n");
    }

    public static void main(String[] args) {
        linha();
        for (int i = 0; i < 5; ++i) {
            meio();
        }
        linha();
    }
}
