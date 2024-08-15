/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.empregados;

/**
 *
 * @author bispo
 */
public class Empregados {

    public static void main(String[] args) {
        Assalariado a = new  Assalariado(2500.00,"a1","1moder","000.000.000.00");
        Comissionado c = new Comissionado (500,12.25,"c1","c1sobrebome","111.111.111.11");
        
        a.vencimento();
        c.vencimento();
    }
}
