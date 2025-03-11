package Exercicios.RepeticoesEnquanto;

import javax.swing.*;

public class EX44 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "EX44 - Faça um algoritmo que leia o valor inicial da contagem, o " +
                "valor final e o incremento, mostrando em seguida todos os valores no intervalo:" +
                "\nEx: Digite o primeiro Valor: 3" +
                "\nDigite o último Valor: 10" +
                "\nDigite o incremento: 2" +
                "\nContagem: 3 5 7 9 Acabou!");

        JOptionPane.showMessageDialog(null, "1º Passo - Solicitar ao usuário o valor inicial, final e o incremento.");
        String primeiroValorStr = JOptionPane.showInputDialog("Digite o primeiro valor da contagem:");
        int primeiroValor = Integer.parseInt(primeiroValorStr);

        String ultimoValorStr = JOptionPane.showInputDialog("Digite o último valor da contagem:");
        int ultimoValor = Integer.parseInt(ultimoValorStr);

        String incrementoStr = JOptionPane.showInputDialog("Digite o incremento da contagem:");
        int incremento = Integer.parseInt(incrementoStr);

        JOptionPane.showMessageDialog(null, "2º Passo - Criar um contador conforme os valores fornecidos.");
        String contagem = "";

        JOptionPane.showMessageDialog(null, "3º Passo - Criar um laço de repetição para gerar a contagem de 1ºvalor digitado ao 2ºvalor digitado com incremento digitado.");
        for (int i = primeiroValor; i <= ultimoValor; i += incremento) {
            contagem += i + " ";
        }

        JOptionPane.showMessageDialog(null, "4º Passo - Exibir a contagem e e adicionar ao final a mensagem 'Acabou!'");
        contagem += "Acabou!";
        JOptionPane.showMessageDialog(null, contagem);
    }
}
