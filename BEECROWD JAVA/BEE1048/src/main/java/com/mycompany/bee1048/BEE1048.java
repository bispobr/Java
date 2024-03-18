/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1048;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author bispo
 */
public class BEE1048 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner t = new Scanner (System.in);
        float valor = t.nextFloat();
        
        if (valor > 0  && valor <= 400){
            int percentual = 15;
            float reajuste = (valor * percentual) / 100;
            float nsal = valor + reajuste;
            System.out.println("Novo salario: " + String.format("%.2f", nsal));
            System.out.println("Reajuste ganho: " + String.format("%.2f", reajuste));
            System.out.println("Em percentual: " + percentual + " %" );
        } else if (valor >= 400.01  && valor <= 800.00){
            int percentual = 12;
            float reajuste = (valor * percentual) / 100;
            float nsal = valor + reajuste;
            System.out.println("Novo salario: " + String.format("%.2f", nsal));
            System.out.println("Reajuste ganho: " + String.format("%.2f", reajuste));
            System.out.println("Em percentual: " + percentual + " %" );
            
        } else if (valor >= 800.01 && valor <= 1200.00){
            int percentual = 10;
            float reajuste = (valor * percentual) / 100;
            float nsal = valor + reajuste;
            System.out.println("Novo salario: " + String.format("%.2f", nsal));
            System.out.println("Reajuste ganho: " + String.format("%.2f", reajuste));
            System.out.println("Em percentual: " + percentual + " %" );
            
        } else if (valor >= 1200.01 && valor <= 2000.00){
            int percentual = 7;
            float reajuste = (valor * percentual) / 100;
            float nsal = valor + reajuste;
            System.out.println("Novo salario: " + String.format("%.2f", nsal));
            System.out.println("Reajuste ganho: " + String.format("%.2f", reajuste));
            System.out.println("Em percentual: " + percentual + " %" );
            
        } else if (valor > 2000.00){
            int percentual = 4;
            float reajuste = (valor * percentual) / 100;
            float nsal = valor + reajuste;
            System.out.println("Novo salario: " + String.format("%.2f", nsal));
            System.out.println("Reajuste ganho: " + String.format("%.2f", reajuste));
            System.out.println("Em percentual: " + percentual + " %" );
        }
        
    }
}
