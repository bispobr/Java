/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1015;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author bispo
 */
public class BEE1015 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner t = new Scanner (System.in);
        float x1 = t.nextFloat();
        float y1 = t.nextFloat();
        float x2 = t.nextFloat();
        float y2 = t.nextFloat();
        
        float distancia = (float) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println(String.format("%.4f", distancia));
        
        t.close();
    }
}
