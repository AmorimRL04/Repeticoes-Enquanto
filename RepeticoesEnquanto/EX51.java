package Exercicios.RepeticoesEnquanto;

import javax.swing.*;
import java.text.NumberFormat;
import java.util.Locale;

public class EX51 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "EX51 - Faça um aplicativo que leia o preço de 8 produtos. No final, " +
                "\nmostre na tela qual foi o maior e qual foi o menor preço digitados.");

        JOptionPane.showMessageDialog(null, "1º Passo - Inicializar as variáveis para armazenar os preços, " +
                "o maior e o menor valor.");
        double maiorPreco = Double.MIN_VALUE;
        double menorPreco = Double.MAX_VALUE;
        String precosDigitados = "";

        JOptionPane.showMessageDialog(null, "2ºPasso - Escolher o formato da moeda que será exibida ao usuário.");
        Locale Brasil = new Locale("pt", "BR");

        JOptionPane.showMessageDialog(null, "3º Passo - Solicitar ao usuário os preços dos 8 produtos.");
        JOptionPane.showMessageDialog(null, "4º Passo - Converter o número digitado para o formato americano, caso seja digitado no formato brasileiro.");
        for (int i = 1; i <= 8; i++) {
            String precoStr = JOptionPane.showInputDialog("Digite o preço do " + i + "º produto:");
            precoStr = precoStr.replace(",", ".");
            double preco = Double.parseDouble(precoStr);
            precosDigitados += NumberFormat.getCurrencyInstance(Brasil).format(preco) + "\n";

            if (preco > maiorPreco) {
                JOptionPane.showMessageDialog(null, "2º Passo - Verificar se é o maior preço.");
                maiorPreco = preco;
            }
            if (preco < menorPreco) {
                JOptionPane.showMessageDialog(null, "2º Passo - Verificar se é o menor preço.");
                menorPreco = preco;
            }
        }

        JOptionPane.showMessageDialog(null, "5º Passo - Exibir os resultados.");
        JOptionPane.showMessageDialog(null, "Preços digitados:\n" + precosDigitados +
                "\nMaior preço: " + NumberFormat.getCurrencyInstance(Brasil).format(maiorPreco) +
                "\nMenor preço: " + NumberFormat.getCurrencyInstance(Brasil).format(menorPreco));
    }
}
