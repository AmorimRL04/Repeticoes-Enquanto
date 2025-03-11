package Exercicios.RepeticoesEnquanto;

import javax.swing.*;

public class EX53 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "EX53 - Leia a idade e o sexo de 5 pessoas, mostrando no final:\n" +
                "• Quantos homens foram cadastrados\n" +
                "• Quantas mulheres foram cadastradas\n" +
                "• A média de idade do grupo\n" +
                "• A média de idade dos homens\n" +
                "• Quantas mulheres têm mais de 20 anos.");

        JOptionPane.showMessageDialog(null, "1º Passo - Inicializar as variáveis necessárias.");
        int totalIdades = 0;
        int totalHomens = 0;
        int totalMulheres = 0;
        int totalIdadeHomens = 0;
        int contMulheresMaior20 = 0;
        int totalPessoas = 0;

        JOptionPane.showMessageDialog(null, "2º Passo - Criar um laço de repetição para ler a idade e o sexo de 5 pessoas.");
        for (int i = 1; i <= 5; i++) {

            JOptionPane.showMessageDialog(null, "2º Passo - Solicitar e validar a idade da pessoa " + i + ".");
            String idadeStr = JOptionPane.showInputDialog("Digite a idade da " + i + "ª pessoa:");
            idadeStr = idadeStr.replace(',', '.');
            int idade = Integer.parseInt(idadeStr);

            JOptionPane.showMessageDialog(null, "2º Passo - Solicitar e validar o sexo da pessoa " + i + ".");
            String sexo;
            while (true) {
                sexo = JOptionPane.showInputDialog("Digite o sexo da " + i + "ª pessoa (M para Masculino, F para Feminino):").toUpperCase();
                if (sexo.equals("M") || sexo.equals("F")) {
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Sexo inválido! Por favor, digite 'M' para Masculino ou 'F' para Feminino.");
                }
            }

            JOptionPane.showMessageDialog(null, "2º Passo - Atualizar a soma das idades e o total de pessoas cadastradas.");
            totalIdades += idade;
            totalPessoas++;

            JOptionPane.showMessageDialog(null, "2º Passo - Verificar se a pessoa cadastrada é do sexo masculino.");
            if (sexo.equals("M")) {
                JOptionPane.showMessageDialog(null, "2º Passo - Incrementar o total de homens cadastrados.");
                totalHomens++;

                JOptionPane.showMessageDialog(null, "2º Passo - Somar a idade do homem cadastrado para calcular a média depois.");
                totalIdadeHomens += idade;
            } else {
                JOptionPane.showMessageDialog(null, "2º Passo - Incrementar o total de mulheres cadastradas.");
                totalMulheres++;

                JOptionPane.showMessageDialog(null, "2º Passo - Verificar se a mulher cadastrada tem mais de 20 anos.");
                if (idade > 20) {
                    JOptionPane.showMessageDialog(null, "2º Passo - Incrementar a contagem de mulheres com mais de 20 anos.");
                    contMulheresMaior20++;
                }
            }
        }

        JOptionPane.showMessageDialog(null, "3º Passo - Calcular a média de idade do grupo.");
        double mediaIdade = totalIdades / (double) totalPessoas;

        JOptionPane.showMessageDialog(null, "4º Passo - Calcular a média de idade dos homens cadastrados.");
        double mediaIdadeHomens = totalHomens > 0 ? totalIdadeHomens / (double) totalHomens : 0;

        JOptionPane.showMessageDialog(null, "5º Passo - Exibir os resultados finais.");
        JOptionPane.showMessageDialog(null, "Total de homens cadastrados: " + totalHomens +
                "\nTotal de mulheres cadastradas: " + totalMulheres +
                "\nMédia de idade do grupo: " + String.format("%.2f", mediaIdade) + " anos" +
                "\nMédia de idade dos homens: " + String.format("%.2f", mediaIdadeHomens) + " anos" +
                "\nMulheres com mais de 20 anos: " + contMulheresMaior20);
    }
}
