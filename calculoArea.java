package lista6;

import java.util.Scanner;

public class calculoArea {
    
    public static double areaCirculo(double raio){
       double pi = 3.14;
       double area = 2;
       double calculoC = area * pi * raio;       
       System.out.println("a área do circulo é: " + calculoC);
       return calculoC;
    }
    
    public static double areaRetangulo(double larguraR, double alturaR){
        double calculoR = larguraR * alturaR;
        System.out.println("a área do retângulo é: " + calculoR);
        return calculoR;        
    } 
    public static double areaTriangulo(double baseT, double alturaT){
        double calculoT = (baseT * alturaT) / 2;
        System.out.println("a área do triângulo é: "+ calculoT);
        return calculoT;
    } 

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        System.out.println("escolha uma opção que deseja calcular:");
        System.out.println("1- Area do circulo");
        System.out.println("2 - Area do retângulo");
        System.out.println("3 - Area do triângulo");
        System.out.println("4 - todas as medidas");
        System.out.print("Digite sua opção: ");
        int opcao = entrada.nextInt();
       if ((opcao != 1) && (opcao != 2) && (opcao != 3) && (opcao != 4))
            System.out.println("Opção inválida tente novamente!!");
       else
           switch (opcao){
               case 1:
                   System.out.print("Digite a primeira medida: ");
                   double raio = entrada.nextDouble();
                   areaCirculo(raio);                    
                   break;
               case 2:
                   System.out.print("Digite a altura do retângulo: ");
                   double larguraR = entrada.nextDouble();
                   System.out.print("Digite a largura do retângulo: ");
                   double  alturaR = entrada.nextDouble();
                   areaRetangulo(larguraR, alturaR);                   
                   break;
               case 3:
                   System.out.print("Digite a base do trângulo: ");
                   double baseT = entrada.nextDouble();
                   System.out.print("Digite a largura do triângulo: ");
                   double alturaT = entrada.nextDouble();
                   areaTriangulo(baseT, alturaT);                 
                   break;
           }
        System.out.println("");
       if (opcao == 4){
           System.out.print("Digite a primeira medida do circulo: ");
           double raio = entrada.nextDouble();
           System.out.print("Digite a altura do retângulo: ");
           double larguraR = entrada.nextDouble();
           System.out.print("Digite a largura do retângulo: ");
           double  alturaR = entrada.nextDouble();
            System.out.print("Digite a base do trângulo: ");
            double baseT = entrada.nextDouble();
            System.out.print("Digite a largura do triângulo: ");
            double alturaT = entrada.nextDouble();
            areaCirculo(raio);
            areaRetangulo(larguraR, alturaR);
            areaTriangulo(baseT, alturaT);
       }
    }    
}
