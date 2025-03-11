package Exercicios.RepeticoesEnquanto;

import javax.swing.*;

public class EX39 {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "EX39 - Faça um algoritmo que mostre na tela a seguinte contagem:" +
                "\n" +
                "10 9 8 7 6 5 4 3 Acabou!");

        JOptionPane.showMessageDialog(null, "1º Passo - Criar um contador como uma string vazia.");
        String contagem = "";

        JOptionPane.showMessageDialog(null,"2º Passo - Usar um laço de repetição para gerar a contagem de 10 a 3:");
        for (int i = 10; i >= 3; i--) {
            contagem += i + " ";
        }


        JOptionPane.showMessageDialog(null, "3º Passo - Adicionar a mensagem \"Acabou!\" ao final da contagem.");
        contagem += "Acabou!";

        JOptionPane.showMessageDialog(null, "4º Passo - Exibir o resultado final:");
        JOptionPane.showMessageDialog(null, contagem);
    }
}
