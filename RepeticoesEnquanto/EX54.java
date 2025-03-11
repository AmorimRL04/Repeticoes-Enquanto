package Exercicios.RepeticoesEnquanto;

import javax.swing.*;

public class EX54 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "EX54 - Leia o peso e a altura de 7 pessoas, mostrando no final:" +
                "\n• Qual foi a média de altura do grupo" +
                "\n• Quantas pessoas pesam mais de 90Kg" +
                "\n• Quantas pessoas que pesam menos de 50Kg têm menos de 1.60m" +
                "\n• Quantas pessoas que medem mais de 1.90m pesam mais de 100Kg.");

        JOptionPane.showMessageDialog(null, "1º Passo - Inicializar as variáveis necessárias.");
        double totalAltura = 0;
        int contMais90kg = 0;
        int contMenos50kgMenos160m = 0;
        int contMais190mMais100kg = 0;
        int contadorPessoas = 0;

        JOptionPane.showMessageDialog(null, "2º Passo - Criar um laço de repetição para processar os dados de 7 pessoas.");
        for (int i = 1; i <= 7; i++) {

            JOptionPane.showMessageDialog(null, "2º Passo - Solicitar o peso e a altura da pessoa " + i + ".");
            String pesoStr = JOptionPane.showInputDialog("Digite o peso da " + i + "ª pessoa (em kg):");
            String alturaStr = JOptionPane.showInputDialog("Digite a altura da " + i + "ª pessoa (em metros):");

            JOptionPane.showMessageDialog(null, "2º Passo - Converter números digitados no formato brasileiro para o formato americano.");
            pesoStr = pesoStr.replace(',', '.');
            alturaStr = alturaStr.replace(',', '.');

            JOptionPane.showMessageDialog(null, "2º Passo - Converter os valores de peso e altura para tipo numérico.");
            double peso = Double.parseDouble(pesoStr);
            double altura = Double.parseDouble(alturaStr);

            JOptionPane.showMessageDialog(null, "2º Passo - Acumular a altura total do grupo.");
            totalAltura += altura;
            contadorPessoas++;

            JOptionPane.showMessageDialog(null, "2º Passo - Verificar se a pessoa pesa mais de 90 kg.");
            if (peso > 90) {
                JOptionPane.showMessageDialog(null, "2º Passo - Incrementar a contagem de pessoas com mais de 90 kg.");
                contMais90kg++;
            }

            JOptionPane.showMessageDialog(null, "2º Passo - Verificar se a pessoa pesa menos de 50 kg e tem menos de 1.60m de altura.");
            if (peso < 50 && altura < 1.60) {
                JOptionPane.showMessageDialog(null, "2º Passo - Incrementar a contagem de pessoas com menos de 50 kg e altura abaixo de 1.60m.");
                contMenos50kgMenos160m++;
            }

            JOptionPane.showMessageDialog(null, "2º Passo - Verificar se a pessoa mede mais de 1.90m e pesa mais de 100kg.");
            if (altura > 1.90 && peso > 100) {
                JOptionPane.showMessageDialog(null, "2º Passo - Incrementar a contagem de pessoas com mais de 1.90m e peso acima de 100kg.");
                contMais190mMais100kg++;
            }
        }

        JOptionPane.showMessageDialog(null, "3º Passo - Calcular a média de altura do grupo.");
        double mediaAltura = totalAltura / contadorPessoas;

        JOptionPane.showMessageDialog(null, "4º Passo - Exibir os resultados finais.");
        JOptionPane.showMessageDialog(null, "Média de altura do grupo: " + String.format("%.2f", mediaAltura) + " metros" +
                "\nPessoas que pesam mais de 90kg: " + contMais90kg +
                "\nPessoas com menos de 50kg e altura abaixo de 1.60m: " + contMenos50kgMenos160m +
                "\nPessoas que medem mais de 1.90m e pesam mais de 100kg: " + contMais190mMais100kg);
    }
}
