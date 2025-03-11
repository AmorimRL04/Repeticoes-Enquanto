package Exercicios.RepeticoesEnquanto;

import javax.swing.*;
import java.util.Random;

public class EX55 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "EX55[Desafio] - Crie um jogo onde o computador vai sortear um número" +
                "\nentre 1 e 10 e o jogador vai tentar descobrir qual foi o valor sorteado." +
                "\nVamos melhorar o jogo que fizemos no exercício 32." +
                "\nA partir de agora, o computador vai sortear um número entre" +
                "\n1 e 10 e o jogador vai ter 4 tentativas para tentar acertar.");

        JOptionPane.showMessageDialog(null, "1º Passo - Inicializar as variáveis e sortear o número entre 1 e 10.");
        Random random = new Random();
        int numeroSorteado = random.nextInt(10) + 1;
        int tentativas = 0;
        boolean acertou = false;

        JOptionPane.showMessageDialog(null, "2º Passo - Criar um laço de repetição para permitir até 4 tentativas.");
        while (tentativas < 4 && !acertou) {

            JOptionPane.showMessageDialog(null, "2º Passo - Incrementar a contagem de tentativas.");
            tentativas++;

            JOptionPane.showMessageDialog(null, "2º Passo - Solicitar ao jogador um número entre 1 e 10.");
            String tentativaStr = JOptionPane.showInputDialog("Tentativa " + tentativas + " de 4: Tente acertar o número entre 1 e 10.");

            JOptionPane.showMessageDialog(null, "2º Passo - Converter o número digitado para o formato correto.");
            tentativaStr = tentativaStr.replace(',', '.');
            int tentativa = Integer.parseInt(tentativaStr);

            JOptionPane.showMessageDialog(null, "2º Passo - Comparar a tentativa do jogador com o número sorteado.");
            if (tentativa == numeroSorteado) {
                JOptionPane.showMessageDialog(null, "2º Passo - O jogador acertou! Alterar a variável 'acertou' para true.");
                acertou = true;
            } else if (tentativa < numeroSorteado) {
                JOptionPane.showMessageDialog(null, "2º Passo - O número digitado é menor que o sorteado. Informar ao jogador.");
                JOptionPane.showMessageDialog(null, "O número sorteado é maior que " + tentativa + ". Tente novamente!");
            } else {
                JOptionPane.showMessageDialog(null, "2º Passo - O número digitado é maior que o sorteado. Informar ao jogador.");
                JOptionPane.showMessageDialog(null, "O número sorteado é menor que " + tentativa + ". Tente novamente!");
            }
        }

        JOptionPane.showMessageDialog(null, "3º Passo - Exibir o resultado final.");
        if (acertou) {
            JOptionPane.showMessageDialog(null, "3º Passo - O jogador acertou o número sorteado.");
            JOptionPane.showMessageDialog(null, "Parabéns! Você acertou o número sorteado " + numeroSorteado + " em " + tentativas + " tentativas.");
        } else {
            JOptionPane.showMessageDialog(null, "3º Passo - O jogador não conseguiu acertar em 4 tentativas.");
            JOptionPane.showMessageDialog(null, "Você não acertou o número sorteado. O número era " + numeroSorteado + ".");
        }
    }
}
