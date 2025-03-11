package Exercicios.RepeticoesEnquanto;

import javax.swing.*;

public class EX48 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "EX48 - Faça um programa que leia 7 números inteiros e no final " +
                "\nmostre o somatório entre eles.");

        JOptionPane.showMessageDialog(null, "1º Passo - Inicializar a variável que armazenará a soma e os números digitados.");
        int soma = 0;
        String numDig = "";

        JOptionPane.showMessageDialog(null, "2º Passo - Solicitar ao usuário digite 7 números inteiros e adicioná-los na variável soma.");
        for (int i = 1; i <= 7; i++) {
            String numeroStr = JOptionPane.showInputDialog("Digite o " + i + "º número:");
            int numero = Integer.parseInt(numeroStr);

            numDig += numero + " ";
            soma += numero;
        }

        JOptionPane.showMessageDialog(null, "3º Passo - Exibir os números digitados e o resultado da soma.");
        JOptionPane.showMessageDialog(null, "Os números digitados foram: " + numDig.trim());
        JOptionPane.showMessageDialog(null, "A soma dos 7 números é: " + soma);
    }
}
