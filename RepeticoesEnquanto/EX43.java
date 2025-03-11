package Exercicios.RepeticoesEnquanto;

import javax.swing.*;

public class EX43 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "EX43 - Faça um algoritmo que mostre uma contagem regressiva de " +
                "30 até 1, marcando os números que forem divisíveis por 4, exatamente como mostrado abaixo:\n" +
                "30 29 [28] 27 26 25 [24] 23 22 21 [20] 19 18 17 [16]...");

        JOptionPane.showMessageDialog(null, "1º Passo - Criar a contagem regressiva de 30 até 1.");
        String contagem = "";

        JOptionPane.showMessageDialog(null, "2º Passo - Criar um laço e verificar se os números são divisíveis por 4 ou não.");
        for (int i = 30; i >= 1; i--) {
            if (i % 4 == 0) {
                JOptionPane.showMessageDialog(null, "2º Passo -Se o número for divisível por 4, ele é colocado entre colchetes.");
                contagem += "[" + i + "] ";
            } else {
                JOptionPane.showMessageDialog(null, "2º Passo - Caso contrário, o número é apenas adicionado à contagem.");
                contagem += i + " ";
            }
        }


        JOptionPane.showMessageDialog(null, "3º Passo - Exibir a contagem com os números destacados.");
        JOptionPane.showMessageDialog(null, contagem);
    }
}
