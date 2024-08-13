/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.iphone;

/**
 *
 * @author bispo
 */
public interface AparelhoTelefonico {
    
    public String ligar (String numero);
    public void atender ();
    public void encerrarLigacao();
    public void iniciarCorreioVoz();
    public boolean favoritar (String numero) ;
}
