package exercicios;

import java.util.Scanner;

public class notasMetodo {
    
    public static double media(int[] notas) {
        int soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        return soma / (double) notas.length;
    }
    
    public static boolean aprovado(int nota) {
        return nota >= 7;
    }
    
    public static boolean exame(int nota) {
        return nota >= 2 && nota < 7;
    }
    
    public static boolean reprovado(int nota) {
        return nota < 2;
    }
   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de alunos:");
        int quantidadeAlunos = entrada.nextInt();

        int[] notas = new int[quantidadeAlunos];
        int aprovados = 0;
        int exames = 0;
        int reprovados = 0;

        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.print("Digite a nota do final do " + (i + 1) + "° aluno:");
            notas[i] = entrada.nextInt();
        }

        double mediaNotas = media(notas);
        System.out.println("A média das notas é: " + mediaNotas);

        for (int i = 0; i < quantidadeAlunos; i++) {
            int nota = notas[i];
            if (aprovado(nota)) {
                aprovados++;
            } else if (exame(nota)) {
                exames++;
            } else if (reprovado(nota)) {
                reprovados++;
            }
        }

        System.out.println("Quantidade de alunos aprovados: " + aprovados);
        System.out.println("Quantidade de alunos em exame: " + exames);
        System.out.println("Quantidade de alunos reprovados: " + reprovados);
        
        entrada.close();
    }
}
