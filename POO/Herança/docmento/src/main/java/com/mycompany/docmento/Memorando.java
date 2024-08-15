/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.docmento;

/**
 *
 * @author bispo
 */
public class Memorando extends Docmentos {
    private String Assunto;
    private String destinatario;
    private String Signatario;
    
    //construtor

    public Memorando(String Assunto, String destinatario, String Signatario, int numeroDePaginas, int numdocumento, int anodocumento, int dataDocumento) {
        super(numeroDePaginas, numdocumento, anodocumento, dataDocumento);
        this.Assunto = Assunto;
        this.destinatario = destinatario;
        this.Signatario = Signatario;
    }
    
    
    
    //getters e setters

    public String getAssunto() {
        return Assunto;
    }

    public void setAssunto(String Assunto) {
        this.Assunto = Assunto;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getSignatario() {
        return Signatario;
    }

    public void setSignatario(String Signatario) {
        this.Signatario = Signatario;
    }

    @Override
    public String toString() {
        return "Memorando{"+super.toString() + "Assunto=" + Assunto + ", destinatario=" + destinatario + ", Signatario=" + Signatario + '}';
    }

    
    
    
    
}
