/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aluno;

/**
 *
 * @author bruno
 */
public class Aluno  {

    public static void main(String[] args) {
        Discente d1 = new Discente("bia",2546,6.5,8.5,8);
      
        System.out.printf("%.2f\n",d1.media());
        
        System.out.printf("%.2f",d1.provafinal());
        
        
    }

    
}
