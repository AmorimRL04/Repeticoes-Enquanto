package Exercicios.RepeticoesEnquanto;

import javax.swing.*;

public class EX49 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "EX49 - Crie um programa que leia 6 números inteiros e no final mostre " +
                "\nquantos deles são pares e quantos são ímpares.");

        JOptionPane.showMessageDialog(null, "1º Passo - Inicializar as variáveis para contagem de pares e ímpares.");
        int pares = 0, impares = 0;
        String numPares = "", numImpares = "";

        JOptionPane.showMessageDialog(null, "2º Passo - Solicitar ao usuário digite 6 números inteiros e classificá-los.");
        for (int i = 1; i <= 6; i++) {
            String numeroStr = JOptionPane.showInputDialog("Digite o " + i + "º número:");
            int numero = Integer.parseInt(numeroStr);
            if (numero % 2 == 0) {
                JOptionPane.showMessageDialog(null, "2º Passo - Verificar se o número é PAR e adicioná-lo na variável correspondente");
                pares++;
                numPares += numero + " ";
            } else {
                JOptionPane.showMessageDialog(null, "2º Passo - Verificar se o número é IMPAR e adicioná-lo na variável correspondente");
                impares++;
                numImpares += numero + " ";
            }
        }

        JOptionPane.showMessageDialog(null, "3º Passo - Exibir os números digitados e a contagem de pares e ímpares.");
        JOptionPane.showMessageDialog(null, "Números pares: " + numPares + "\nTotal de pares: " + pares);
        JOptionPane.showMessageDialog(null, "Números ímpares: " + numImpares + "\nTotal de ímpares: " + impares);
    }
}
