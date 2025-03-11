package Exercicios.RepeticoesEnquanto;

import javax.swing.*;

public class EX42 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "EX42 - Faça um algoritmo que pergunte ao usuário um número " +
                "\ninteiro e positivo qualquer e mostre uma contagem até esse valor:" +
                "\nEx: Digite um valor: 35" +
                "\nContagem: 1 2 3 4 5 6 7 ... 33 34 35 Acabou!");

        JOptionPane.showMessageDialog(null, "1º Passo - Solicitar ao usuário um número inteiro.");
        String numeroStr = JOptionPane.showInputDialog("Digite um número inteiro e positivo:");
        int numero = Integer.parseInt(numeroStr);

        JOptionPane.showMessageDialog(null, "2º Passo - Validar se o número é positivo.");
        while (numero <= 0) {
            JOptionPane.showMessageDialog(null, "Por favor, digite um número positivo.");
            numeroStr = JOptionPane.showInputDialog("Digite um número inteiro e positivo:");
            numero = Integer.parseInt(numeroStr);
        }

        JOptionPane.showMessageDialog(null, "3º Passo - Criar um contador como uma string vazia.");
        String contagem = "";

        JOptionPane.showMessageDialog(null, "4º Passo - Criar um laço de repetição para gerar a contagem até o número digitado");
        for (int i = 1; i <= numero; i++) {
            contagem += i + " ";
        }

        JOptionPane.showMessageDialog(null, "5º Passo - Exibir a contagem e adicionar no final a mensagem 'Acabou!'");
        contagem += "Acabou!";
        JOptionPane.showMessageDialog(null, contagem);
    }
}
