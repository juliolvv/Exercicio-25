package com.mycompany.exercicio25;
import javax.swing.JOptionPane;

public class Exercicio25 {
    public static void main(String[] args) {
        int qtde = 3;
        int vetor[] = new int[qtde]; 
        for (int i = 0; i <qtde; i++) {
            vetor[i] =  Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número:"));
        }
         int soma = 0;
         for (int i=0; i<qtde;i++) {
            soma = soma + vetor[i];
        }
         double media = soma/qtde;
        System.out.println("A soma:" + soma);
        System.out.println("A soma:" + media);
        
        }
    }