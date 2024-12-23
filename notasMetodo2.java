package exercicios;

import java.util.Scanner;

public class notasMetodo2 {
        
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        int notaA = entrada.nextInt();
        System.out.println("Digite a segunda nota: ");
        int notaB = entrada.nextInt();
        calculaMedia(notaA, notaB);
    }
    
    public static void calculaMedia(int A, int B) {
        int calculo = (A + B) / 2;
        aprovado(calculo);
        reprovado(calculo);
    }
    
    public static void aprovado(int C) {
        if (C >= 7) {
            System.out.println("Aprovado!");
        } else {
            exame(C);
        }
    }
    
    public static void exame(int E) {
        if (E >= 2 && E <= 6) {
            System.out.println("Você está em exame");
            provaR(E);
        } else {
            reprovado(E);
        }
    }
    
    public static void reprovado(int R) {
        if (R < 2) {
            System.out.println("Reprovado!");
        }
    }
    
    public static int provaR(int PR) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("1- questão:");
        System.out.println("Qual continente o Brasil está?");
        System.out.println("1 - América Central");
        System.out.println("2 - América do Sul");
        System.out.println("3 - América do Norte");
        int resposta = entrada.nextInt();
        System.out.println("2- questão:");
        System.out.println("Qual é a cor predominante na bandeira do Brasil?");
        System.out.println("1 - Azul");
        System.out.println("2 - Verde");
        System.out.println("3 - Amarelo");
        int resposta2 = entrada.nextInt();
        prova(resposta, resposta2);
        return PR;
    }
    
    public static void prova(int R1, int R2) {
        int certo = 0;
        int errado = 0;
        if (R1 == 2) {
            certo++;
        } else {
            errado++;
        }
        if (R2 == 2) {
            certo++;
        } else {
            errado++;
        }
        conferir(certo, errado);
    }
    
    public static void conferir(int certo, int errado) {
        if (certo == 2) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }
    }
}
