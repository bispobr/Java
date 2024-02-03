/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula07;

import java.util.Random;

/**
 *
 * @author n
 */
public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    //gettes e setters

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }
    
    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    //metodos
    public void status(){
        System.out.println("Desafiante: " + this.desafiante.getNome());
        System.out.println("Desafido:" + this.desafiado.getNome());
        System.out.println("Quantidade de Rounds: " + this.getRounds());
        System.out.println("Aprovada: " + this.getAprovada());
    }
    public void lutar(){
       if(this.getAprovada()){
           this.desafiado.apresentar();
           this.desafiante.apresentar();
           Random aleatorio = new Random();
           int vencedor = aleatorio.nextInt(3); //0 1 2
           switch(vencedor){
               case 0:
                   System.out.println("Luta!!!Empatou");
                   this.desafiado.empaterLuta();
                   this.desafiante.empaterLuta();
                   break;
               case 1:
                   System.out.println("Ganhador :" + this.desafiado.getNome());
                   this.desafiado.ganharLuta();
                   this.desafiante.perderluta();
                   break;
               case 2:
                   System.out.println("ganhador :" + this.desafiante.getNome());
                   this.desafiante.ganharLuta();
                   this.desafiado.perderluta();
                   break;
           }
       }else{
           System.out.println("A Luta não pode Acontecer!!!!");
       }
    }
    
    
    
    
    public void marcarLuta(Lutador l1,Lutador l2){
         if (l1.getCategoria().equals(l2.getCategoria()) &&  l1 != l2){
           this.setAprovada(true);
           this.setDesafiado(l1);
           this.setDesafiante(l2);
        } else{
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }

    
    
}
