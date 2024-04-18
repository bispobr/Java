/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1097;

/**
 *
 * @author bispo
 */
public class BEE1097 {

    public static void main(String[] args) {
        int inicio = 7;
        for (int i = 1; i <10;i+=2){
            for (int j = inicio;j>inicio-3;j--){
                System.out.println("I="+i+" J="+j);
            }
            inicio+=2;
        }
    }
}
