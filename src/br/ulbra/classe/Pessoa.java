/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.classe;

import javax.swing.JOptionPane;

/**
 *
 * @author Leon
 */
public class Pessoa {
    private String nome;
    private int anoNasc;
    
    public Pessoa(){
        //construtor
    }
    public void mostrarIdade(){
        System.out.println("A idade de "+nome
        +" é "+(2022-anoNasc)+" anos");
    }
    public void setNome(String nome){
        if(nome.length()>=10){
        this.nome = nome.toUpperCase();
        }else{
            this.nome = "NOME ILEGAL!";
        }
    }
    public void setAnoNasc(int anoNasc){
       if(anoNasc >= 1980 && anoNasc<=2022){
        this.anoNasc = anoNasc;
       }else{
           JOptionPane.showMessageDialog(null,
                   "Apenas os nascidos em 1980 até 2022");
           this.anoNasc = 2022;
       }
    }
}
