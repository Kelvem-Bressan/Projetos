package exercicios;

import java.util.Scanner;

public class Fatorial {
    public static int calculaFatorial(int numero) {
        if(numero == 0){
        return 1;
        }else{
            return numero * calculaFatorial(numero - 1);
        }
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite um número: ");
        int num = entrada.nextInt();
        int fat = calculaFatorial(num);
        System.out.println("Fatorial de "+num+": " + fat);
    }
}

