package exercicios;

import java.util.Scanner;

public class RecursividadeFiborci {
    public static int fiborci(int n){
       int x;
       if (n == 1)
           return 1;
       if (n == 2)
           return 1;
       x = fiborci(n - 1) + fiborci(n - 2); 
       return x;
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite um número que deseja: ");
        int num = entrada.nextInt();
        for (int i = 1; i < num; i++) {
            System.out.println(fiborci(i) + " "); 
        }
    }
}
