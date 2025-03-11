package Exercicios.RepeticoesEnquanto;

import javax.swing.*;

public class EX40 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "EX40 - Crie um aplicativo que mostre na tela a seguinte contagem:" +
                "\n" +
                "0 3 6 9 12 15 18 Acabou!");

        JOptionPane.showMessageDialog(null, "1º Passo - Criar um contador como uma string vazia.");
        String contagem = "";

        JOptionPane.showMessageDialog(null, "2º Passo - Usar um laço de repetição para gerar a contagem de 0 a 18 com incremento de 3.");
        for (int i = 0; i <= 18; i += 3) {
            contagem += i + " ";
        }

        JOptionPane.showMessageDialog(null, "3º Passo - Adicionar a mensagem 'Acabou!' ao final da contagem.");
        contagem += "Acabou!";

        JOptionPane.showMessageDialog(null, "4º Passo - Exibir o resultado final.");
        JOptionPane.showMessageDialog(null, contagem);
    }
}
