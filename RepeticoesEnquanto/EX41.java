package Exercicios.RepeticoesEnquanto;

import javax.swing.*;

public class EX41 {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "EX41 - Desenvolva um programa que mostre na tela a seguinte contagem: " +
                "\n" +
                "100 95 90 85 80 ... 0 Acabou!");

        JOptionPane.showMessageDialog(null, "1º Passo - Criar um contador como uma string vazia.");
        String contagem = "";

        JOptionPane.showMessageDialog(null, "2º Passo - Criar um laço de repetição para gerar a contagem de 100 a 0 com decremento de 5.");
        for (int i = 100; i >= 0; i -= 5) {
            contagem += i + " ";
        }

        JOptionPane.showMessageDialog(null, "3º Passo - Adicionar a mensagem 'Acabou!' ao final da contagem.");
        contagem += "Acabou!";

        JOptionPane.showMessageDialog(null, "4º Passo - Exibir o resultado final.");
        JOptionPane.showMessageDialog(null, contagem);
    }
}
