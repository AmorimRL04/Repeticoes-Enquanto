package Exercicios.RepeticoesEnquanto;

import javax.swing.*;

public class EX52 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "EX52 - Leia a idade de 10 pessoas, mostrando no final:\n" +
                "• Qual é a média de idade do grupo\n" +
                "• Quantas pessoas têm mais de 18 anos\n" +
                "• Quantas pessoas têm menos de 5 anos\n" +
                "• Qual foi a maior idade lida.");

        JOptionPane.showMessageDialog(null, "1º Passo - Inicializar as variáveis necessárias.");
        int totalIdades = 0;
        int maiorIdade = Integer.MIN_VALUE;
        int contMaisDe18 = 0;
        int contMenosDe5 = 0;
        int contadorPessoas = 0;

        JOptionPane.showMessageDialog(null, "2º Passo - Solicitar as idades das 10 pessoas.");
        JOptionPane.showMessageDialog(null, "3º Passo - Converter o número digitado para o formato americano, caso seja digitado no formato brasileiro.");
        for (int i = 1; i <= 10; i++) {
            String idadeStr = JOptionPane.showInputDialog("Digite a idade da " + i + "ª pessoa:");
            idadeStr = idadeStr.replace(',', '.');
            int idade = Integer.parseInt(idadeStr);
            totalIdades += idade;
            contadorPessoas++;

            if (idade > 18) {
                JOptionPane.showMessageDialog(null, "2º Passo - Verificar se é maior de 18 anos e incrementar a variável correspondente.");
                contMaisDe18++;
            }

            if (idade < 5) {
                JOptionPane.showMessageDialog(null, "2º Passo - Verificar se é menor de 5 anos e incrementar a variável correspondente.");
                contMenosDe5++;
            }

            if (idade > maiorIdade) {
                JOptionPane.showMessageDialog(null, "2º Passo - Verificar se é maior de idadde e incrementar a variável correspondente.");
                maiorIdade = idade;
            }
        }

        JOptionPane.showMessageDialog(null, "4º Passo - Calcular a média de idade.");
        double mediaIdade = totalIdades / (double)contadorPessoas;

        JOptionPane.showMessageDialog(null, "5º Passo - Exibir os resultados.");
        JOptionPane.showMessageDialog(null, "Média de idade: " + String.format("%.2f", mediaIdade) + " anos" +
                "\nPessoas com mais de 18 anos: " + contMaisDe18 +
                "\nPessoas com menos de 5 anos: " + contMenosDe5 +
                "\nMaior idade: " + maiorIdade);
    }
}
