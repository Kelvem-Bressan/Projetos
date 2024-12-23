package lista6;

import java.util.Scanner;

import java.util.Scanner;

public class numeroPorExtenso {

    public static void numeroPorExtenso(int numero) {
        String[] dezenas = new String[9];
        dezenas[0] = "dez";
        dezenas[1] = "vinte e";
        dezenas[2] = "trinta e";
        dezenas[3] = "quarenta e";
        dezenas[4] = "cinquenta e";
        dezenas[5] = "sessenta e";
        dezenas[6] = "setenta e";
        dezenas[7] = "oitenta e";
        dezenas[8] = "noventa e";

        String[] unidade = new String[10];
        unidade[0] = "zero";
        unidade[1] = "um";
        unidade[2] = "dois";
        unidade[3] = "três";
        unidade[4] = "quatro";
        unidade[5] = "cinco";
        unidade[6] = "seis";
        unidade[7] = "sete";
        unidade[8] = "oito";
        unidade[9] = "nove";

        if (numero >= 0 && numero <= 9) {
            System.out.println(unidade[numero]);
        } else if (numero >= 10 && numero <= 19) {
            if (numero == 10) {
                System.out.println(dezenas[0]);
            } else if (numero == 11) {
                System.out.println("onze");
            } else if (numero == 12) {
                System.out.println("doze");
            } else if (numero == 13) {
                System.out.println("treze");
            } else if (numero == 14) {
                System.out.println("quatorze");
            } else if (numero == 15) {
                System.out.println("quinze");
            } else if (numero == 16) {
                System.out.println("dezesseis");
            } else if (numero == 17) {
                System.out.println("dezessete");
            } else if (numero == 18) {
                System.out.println("dezoito");
            } else if (numero == 19) {
                System.out.println("dezenove");
            }
        } else if (numero >= 20 && numero <= 99) {
            int dezena = numero / 10;
            int resto = numero % 10;
            if (resto == 0) {
                System.out.println(dezenas[dezena - 1]);
            } else {
                System.out.println(dezenas[dezena - 1] + " " + unidade[resto]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = entrada.nextInt();
        numeroPorExtenso(numero);
    }
}
