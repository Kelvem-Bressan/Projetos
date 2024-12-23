package exercicios;

import java.util.Scanner;

public class VerificaCartao {

    public static String armazDigVetor(String cartao) {
        int[] digCartao = new int[cartao.length()];
        for (int i = 0; i < cartao.length(); i++) {
            digCartao[i] = Integer.parseInt(String.valueOf(cartao.charAt(i)));
        }
        multDigCartao(digCartao);
        return cartao;
    }

    public static void multDigCartao(int[] digCartao) {
        for (int i = digCartao.length - 2; i >= 0; i -= 2) { 
            digCartao[i] = digCartao[i] * 2;
            if (digCartao[i] >= 10) {
                digCartao[i] = digCartao[i] - 9;
            }
        }
        somaDigcartao(digCartao);
    }

    public static void somaDigcartao(int[] digCartao) {
        int soma = 0;
        for (int i = 0; i < digCartao.length; i++) {
            soma += digCartao[i];
        }
        verifCartao(soma);
    }

    public static void verifCartao(int soma) {
        System.out.println("Soma: " + soma);
        int resto = soma % 10;
        if (resto == 0) {
            System.out.println("Cartão de crédito Válido");
        } else {
            System.out.println("Cartão de crédito Inválido");
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Número do cartão de crédito: ");
        String cartao = entrada.next();
        armazDigVetor(cartao);
    }
}
