/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1958;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class BEE1958 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        
       Scanner t = new Scanner(System.in);

        double v = t.nextDouble();
        System.out.printf("%+.4E\n", v);
    }
}
