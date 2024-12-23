package lista6;

import java.util.Scanner;

public class numPrimo {

    public static int ehPrimo(int num) {
        boolean primo = true;
        int numeroD = 0;
        for (int i = 1; i <= num; i++) {
            if(num % i == 0)
                numeroD++;     
        }
            if (numeroD == 2)
                   primo = true;
            else
                   primo = false; 
            
        System.out.println(primo);     
        return num;        
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = entrada.nextInt();  
        ehPrimo(numero);  
        
    }
}
