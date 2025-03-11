package Exercicios.RepeticoesEnquanto;

import javax.swing.*;

public class EX47 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "EX47 - Faça um algoritmo que calcule e mostre na tela o resultado da " +
                "\nexpressão 500 + 450 + 400 + 350 + 300 + ... + 50 + 0.");

        JOptionPane.showMessageDialog(null, "1º Passo - Inicializar a variável que armazenará a soma.");
        int soma = 0;

        JOptionPane.showMessageDialog(null, "2º Passo - Criar o laço de repetição para somar os números de 500 até 0 com decremento de 50.");
        for (int i = 500; i >= 0; i -= 50) {
            soma += i;
        }

        JOptionPane.showMessageDialog(null, "3º Passo - Exibir o resultado da soma.");
        JOptionPane.showMessageDialog(null, "A soma dos números de 500 até 0 com decremento de 50 é: " + soma);
    }
}
