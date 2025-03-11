package Exercicios.RepeticoesEnquanto;

import javax.swing.*;

public class EX46 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "EX46 - Faça um algoritmo que calcule e mostre na tela o resultado da " +
                "\nsoma entre 6 + 8 + 10 + 12 + 14 + ... + 98 + 100.");

        JOptionPane.showMessageDialog(null, "1º Passo - Inicializar a variável que armazenará a soma.");
        int soma = 0;

        JOptionPane.showMessageDialog(null, "2º Passo - Criar o laço de repetição para somar os números de 6 até 100 com incremento de 2.");
        for (int i = 6; i <= 100; i += 2) {
            soma += i;
        }

        JOptionPane.showMessageDialog(null, "3º Passo - Exibir o resultado da soma.");
        JOptionPane.showMessageDialog(null, "A soma dos números de 6 até 100 com incremento de 2 é: " + soma);
    }
}
