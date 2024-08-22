/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.empregado;

/**
 *
 * @author bispo
 */
public class Empregado {

    public static void main(String[] args) {

        Funcionario f1 = new Funcionario("lia", "clara", "000.000.000-00");
        f1.vencimento();
        System.out.println(f1.toString());

        Comissionado c1 = new Comissionado("leo", "Lira", "111.111.111-11", 55.25, 10.58);
        c1.vencimento();
        System.out.println(c1.toString());

        Horista h1 = new Horista("bia", "andrade", "999.999.999-99", 20, 25);
        h1.vencimento();
        System.out.println(h1.toString());

        Assalariado a1 = new Assalariado("bia", "lia", "999.999.999-99", 1234.0);
        a1.vencimento();
        System.out.println(a1.toString());

    }
}
