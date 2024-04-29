/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.docmento;

/**
 *
 * @author bispo
 */
public class Docmento {

    public static void main(String[] args) {
        Memorando m = new Memorando("RH","pp","p1",10,10,2010,2011);
        PessoaFisica p = new PessoaFisica("000.000.000.00","figura");
        m.enviar(p);
        System.out.println(m.toString());
    }
}
