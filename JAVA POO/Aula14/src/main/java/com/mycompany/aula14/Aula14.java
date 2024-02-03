/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula14;

/**
 *
 * @author n
 */
public class Aula14 {

    public static void main(String[] args) {
        Video v[] = new Video [4];
        v[0] = new Video("aula 1");
        v[1] = new Video("aula 2");
        v[2] = new Video("aula 3");
        
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        
        Gafanhoto g[] = new Gafanhoto [2];
        g[0] = new Gafanhoto("breno",55,"masculino","br"); 
        g[1] = new Gafanhoto("bruna",22,"Femenini","bruna"); 
        
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());
        
       Visualizacao vis = new Visualizacao (g[0],v[0]);
        System.out.println(vis.toString());
    
        
    }
}
