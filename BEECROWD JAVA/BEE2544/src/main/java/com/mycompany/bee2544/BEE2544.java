/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee2544;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BEE2544 {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        while (in.ready()) {
            int N = Integer.parseInt(in.readLine());
            System.out.println((int) (Math.log(N) / Math.log(2)));
        }
    }
}
