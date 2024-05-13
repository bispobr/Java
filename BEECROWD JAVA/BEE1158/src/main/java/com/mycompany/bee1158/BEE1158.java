/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1158;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author bispo
 */
public class BEE1158 {

    public static void main(String[] args)throws IOException {
         Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        while(n != 0){
            int x = input.nextInt();
            int y = input.nextInt();
            int ans = 0;
            while(y != 0){
                if (x % 2 != 0){
                    ans += x;
                    y -= 1;
                }
                x += 1;
            }
            System.out.println(ans);
            n -= 1;
        }
    }
}
