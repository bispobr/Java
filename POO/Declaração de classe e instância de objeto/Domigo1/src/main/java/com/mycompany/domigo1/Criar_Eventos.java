/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.domigo1;

/**
 *
 * @author n
 */
public class Criar_Eventos {
    private String DaraEventos;
    private String NomeEvento;
    private int JogoEvento;
    
    public Criar_Eventos (){
        this.JogoEvento = 1;
    }
   public String getDataEvento (){
       return this.DaraEventos;   
}
   public void setDataEventos (String m){
       this.DaraEventos = m;
   }
   
   public String getNomeEvento (){
       return this.NomeEvento;
   }
   
   public void setNomeEvento(String e){
       this.NomeEvento = e;
   }
   
   public int getJogoEvento (){
       return this.JogoEvento;
   }
   
   public void setJogoEvento (int c){
       this.JogoEvento = c;
   }
    
    public void CriarEvento(String d, String c, int n){
        this.setDataEventos(d);
        this.setNomeEvento(c);
        this.setJogoEvento(n);   
    }
    
    public void VerificarDaraEvenro(){
        if (this.getDataEvento() == null){
            System.out.println("Não existe eventos marcados!!!");
        } else {
            System.out.println("Evento marcado para a data" + this.getDataEvento());
        }
    }
    
    public  void status(){
        System.out.println("Data Evento :" + this.getDataEvento());
        System.out.println("Nome evento:" + this.getNomeEvento());
        System.out.println("Jogo Evento" + this.getJogoEvento());
    }
    
}
