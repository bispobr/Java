/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.docmento;

/**
 *
 * @author bispo
 */
public class Docmentos {
    protected int numeroDePaginas;
    protected int numdocumento;
    protected int anodocumento;
    protected int dataDocumento;
    protected int qtddocumentosCriado;
    
    //construtor

    public Docmentos(int numeroDePaginas, int numdocumento, int anodocumento, int dataDocumento) {
        this.numeroDePaginas = numeroDePaginas;
        this.numdocumento = numdocumento;
        this.anodocumento = anodocumento;
        this.dataDocumento = dataDocumento;
        this.qtddocumentosCriado = qtddocumentosCriado + 1;
    }
    
    
    
    // Getters e seters

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public int getNumdocumento() {
        return numdocumento;
    }

    public void setNumdocumento(int numdocumento) {
        this.numdocumento = numdocumento;
    }

    public int getAnodocumento() {
        return anodocumento;
    }

    public void setAnodocumento(int anodocumento) {
        this.anodocumento = anodocumento;
    }

    public int getDataDocumento() {
        return dataDocumento;
    }

    public void setDataDocumento(int dataDocumento) {
        this.dataDocumento = dataDocumento;
    }

    // meetodo
    
    public void enviar( PessoaFisica p){
        System.out.println("Enviando para a Pessoa" + p);
    }

    @Override
    public String toString() {
        return "Docmentos{" + "numeroDePaginas=" + numeroDePaginas + ", numdocumento=" + numdocumento + ", anodocumento=" + anodocumento + ", dataDocumento=" + dataDocumento + ", qtddocumentosCriado=" + qtddocumentosCriado + '}';
    }
    
    
}
