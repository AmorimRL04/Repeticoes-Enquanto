package Exercicios.RepeticoesEnquanto;

import javax.swing.*;
import java.util.Random;

public class EX50 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "EX50 - Desenvolva um programa que faça o sorteio de 20 números " +
                "\nentre 0 e 10 e mostre na tela:" +
                "\n• Quais foram os números sorteados" +
                "\n• Quantos números estão acima de 5" +
                "\n• Quantos números são divisíveis por 3.");

        JOptionPane.showMessageDialog(null, "1º Passo - Inicializar as variáveis para armazenar os números sorteados, " +
                "a quantidade de valores acima de 5 e a quantidade de valores divisíveis por 3.");
        Random random = new Random();
        String numerosSorteados = "";
        int acimaDe5 = 0;
        int divisiveisPor3 = 0;

        JOptionPane.showMessageDialog(null, "2º Passo - Realizar o sorteio e classificar os números gerados.");
        for (int i = 1; i <= 20; i++) {
            int numero = random.nextInt(11);
            numerosSorteados += numero + " ";

            if (numero > 5) {
                JOptionPane.showMessageDialog(null, "2º Passo - Verificar se o número é maior que 5 é incrementar a variável correspondente");
                acimaDe5++;
            }
            if (numero != 0 && numero % 3 == 0) {
                JOptionPane.showMessageDialog(null, "2º Passo - Verificar se o número é divisível por 3 é incrementar a variável correspondente");
                divisiveisPor3++;
            }
        }

        JOptionPane.showMessageDialog(null, "3º Passo - Exibir os resultados.");
        JOptionPane.showMessageDialog(null, "Números sorteados: " + numerosSorteados +
                "\nQuantidade de números acima de 5: " + acimaDe5 +
                "\nQuantidade de números divisíveis por 3: " + divisiveisPor3);
    }
}
