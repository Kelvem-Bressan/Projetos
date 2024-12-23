package exercicios;

import java.util.Scanner;

public class expoente {
    public static int potencia(int base, int expoente){
        if(expoente == 0)
            return 1;
      else
            return base * potencia (base, expoente - 1); 
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite a base: ");
        int base = entrada.nextInt();
        System.out.println("Digite o expoente: ");
        int expo = entrada.nextInt();
        System.out.println("Potenciação: " + potencia(base,expo));
    }
}
