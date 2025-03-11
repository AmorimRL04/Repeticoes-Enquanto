package Exercicios.RepeticoesEnquanto;

import javax.swing.*;

public class EX45 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "EX45 - Faça um algoritmo que leia o valor inicial da contagem, o " +
                "valor final e o incremento, mostrando em seguida todos os valores no intervalo:" +
                "\nEx: Digite o primeiro Valor: 3" +
                "\nDigite o último Valor: 10" +
                "\nDigite o incremento: 2" +
                "\nContagem: 3 5 7 9 Acabou!" +
                "\n" +
                "\nO programa acima vai ter um problema quando digitarmos o " +
                "\nprimeiro valor maior que o último. Resolva esse problema com um " +
                "\ncódigo que funcione em qualquer situação.");

        JOptionPane.showMessageDialog(null, "1º Passo - Solicitar ao usuário o valor inicial, final e o incremento.");
        String primeiroValorStr = JOptionPane.showInputDialog("Digite o primeiro valor da contagem:");
        int primeiroValor = Integer.parseInt(primeiroValorStr);

        String ultimoValorStr = JOptionPane.showInputDialog("Digite o último valor da contagem:");
        int ultimoValor = Integer.parseInt(ultimoValorStr);

        String incrementoStr = JOptionPane.showInputDialog("Digite o incremento da contagem:");
        int incremento = Integer.parseInt(incrementoStr);

        JOptionPane.showMessageDialog(null, "2º Passo - Verificar a direção da contagem.");
        if (primeiroValor < ultimoValor && incremento < 0) {
            JOptionPane.showMessageDialog(null, "2º Passo - Verifica se o valor inicial é menor que o valor final e se o incremento é negativo.");
            incremento = -incremento;
        } else if (primeiroValor > ultimoValor && incremento > 0) {
            JOptionPane.showMessageDialog(null, "2º Passo - Verifica se o valor inicial é maior que o final, mas o incremento é positivo, e inverse o operador do incremento.");
            incremento = -incremento;
        }

        JOptionPane.showMessageDialog(null, "3º Passo - Criar a contador vazio");
        String contagem = "";

        JOptionPane.showMessageDialog(null, "3º Passo - Criar um  laço de repetição que gera a contagem conforme os valores fornecidos.");
        for (int i = primeiroValor; (primeiroValor < ultimoValor) ? (i <= ultimoValor) : (i >= ultimoValor); i += incremento) {
            contagem += i + " ";
        }

        JOptionPane.showMessageDialog(null, "4º Passo - Exibir a contagem e a mensagem 'Acabou!'");
        contagem += "Acabou!";
        JOptionPane.showMessageDialog(null, contagem);
    }
}
