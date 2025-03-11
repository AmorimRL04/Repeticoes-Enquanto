package Exercicios.RepeticoesEnquanto;

import javax.swing.*;

public class EX38 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "EX38 - Escreva um programa que mostre na tela a seguinte contagem:" +
                "\n" +
                "6 7 8 9 10 11 Acabou!");

        JOptionPane.showMessageDialog(null, "1º Passo - Criar e ordenar os números de 6 a 11:");
        String contagem = "";
        for (int i = 6; i <= 11; i++) {
            contagem += i + " ";
        }

        JOptionPane.showMessageDialog(null, "3º Passo - Exibir a contagem e a mensagem 'Acabou!'");
        contagem += "Acabou!";  // Adiciona "Acabou!" no final
        JOptionPane.showMessageDialog(null, contagem);
    }
}



