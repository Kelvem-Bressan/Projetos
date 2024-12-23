package lista6;

import java.util.Scanner;

public class palindrome {
        
    public static void ehPalindromo(String palavra) {
        boolean palindrome = true;
        String inverter = ""; 
        for (int i = palavra.length() - 1; i >= 0; i--) {
            inverter = inverter + palavra.charAt(i);
        }                
        if (palavra.equals(inverter)) 
            palindrome = true;
         else 
            palindrome = false;
        System.out.println(palindrome);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escreva uma palavra: ");
        String palavra = entrada.nextLine();
        ehPalindromo(palavra); 
    }
}
