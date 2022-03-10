/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.classe;

/**
 *
 * @author Leon
 */
public class Principal {
    public static void main(String[] args) {
       Pessoa objeto = new Pessoa();
       objeto.setNome("Xiru Xiruzão ");
       objeto.setAnoNasc(1980);
       objeto.mostrarIdade();
    }
}
