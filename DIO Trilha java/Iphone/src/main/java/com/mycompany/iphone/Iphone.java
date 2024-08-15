/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.iphone;

/**
 *
 * @author bispo
 */
public class Iphone implements NavegadorInternet,AparelhoTelefonico,ReprodutorMusical {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("exibindo pagina " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionano Nova Aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o Numeo " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo Ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("ouvindo Correio de Voz");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando Musica");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando Musica");
    }

    @Override
    public void selecionarMusicas(String Musica) {
        System.out.println("Selecionado Musica:" + Musica);
    }
}
