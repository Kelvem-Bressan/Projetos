package Projeto_prog1;

import java.util.Scanner;

public class Estacionamento {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean[][] vagas = new boolean[10][5];
        System.out.println("Estacionamento shopping Ponto Bom! ");
        System.out.println(" ");

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                vagas[i][j] = false;
                System.out.print(vagas[i][j] ? " True\t " : " False\t ");
            }
            System.out.println(" ");
        }

        int vagasD = 0;
        int vagaspcd = 0;

        while (true) {

            vagasD = 0;
            vagaspcd = 0;

            for (int i = 0; i < vagas.length; i++) {
                for (int j = 0; j < vagas[i].length; j++) {
                    if (!vagas[i][j]) {
                        vagasD++;
                        if (i == 0) {
                            vagaspcd++;
                        }
                    }
                }
            }

            if (vagasD == 0) {
                System.out.println("Todas as vagas estão ocupadas. O sistema será encerrado.");
                break;
            }

            System.out.println(" ");
            System.out.println("1° - Encontrar uma vaga (" + vagasD + " vagas disponíveis!)");
            System.out.println("2° - Sair do estacionamento");
            System.out.println("3° - Sair do sistema");
            System.out.println(" ");
            System.out.print("O que você deseja? ");
            int resposta = entrada.nextInt();

            switch (resposta) {
                case 1:
                    System.out.println("Você possui pcd?");
                    System.out.println("1° - Sim");
                    System.out.println("2° - Não");
                    System.out.print("Escolha uma opção: ");
                    int respcd = entrada.nextInt();

                    if (respcd == 1) {
                        System.out.println("");
                        System.out.println("Vagas disponíveis para pcd: " + vagaspcd);
                        System.out.println("Você deseja estacionar? ");
                        System.out.println("1° - Sim");
                        System.out.println("2° - Não");
                        System.out.print("Escolha uma opção: ");
                        int estacionar = entrada.nextInt();

                        if (estacionar == 1) {
                            boolean estacionado = false;
                            for (int j = 0; j < 5; j++) {
                                if (!vagas[0][j]) {
                                    vagas[0][j] = true;
                                    System.out.println("Carro estacionado com sucesso! (" + (vagaspcd - 1) + " vagas para PCD disponíveis)");
                                    estacionado = true;
                                    break;
                                }
                            }
                            if (!estacionado) {
                                System.out.println("Nenhuma vaga PCD disponível!");
                            }
                        }
                    } else if (respcd == 2) {
                        System.out.println("");
                        System.out.println("Vagas comuns disponíveis (" + vagasD + " vagas)");
                        System.out.println("Você deseja estacionar? ");
                        System.out.println("1° - Sim");
                        System.out.println("2° - Não");
                        System.out.print("Escolha uma opção: ");
                        int estacionar2 = entrada.nextInt();

                        if (estacionar2 == 1) {
                            boolean vagadisp = false;
                            for (int i = 1; i < vagas.length; i++) {
                                for (int j = 0; j < 5; j++) {
                                    if (!vagas[i][j]) {
                                        vagas[i][j] = true;
                                        System.out.println("");
                                        System.out.println("Carro estacionado com sucesso! (" + (vagasD - 1) + " vagas disponíveis)");
                                        vagadisp = true;
                                        break;
                                    }
                                }
                                if (vagadisp) {
                                    break;
                                }
                            }
                            if (!vagadisp) {
                                System.out.println("Nenhuma vaga comum disponível, tente mais tarde!");
                            }
                        } else if (estacionar2 == 2) {
                            System.out.println("");
                            System.out.println("Ok! Espero ter ajudado!");
                        }
                    } else {
                        System.out.println("Opção inválida!");
                    }
                    break;

                case 2:
                    boolean vagaliv = false;
                    for (int i = 0; i < vagas.length; i++) {
                        for (int j = 0; j < 5; j++) {
                            if (vagas[i][j]) {
                                vagas[i][j] = false;
                                vagaliv = true;
                                System.out.println("Acesso liberado, volte sempre! (" + (vagasD) + " vagas disponíveis!)");
                                break;
                            }
                        }
                        if (vagaliv) {
                            break;
                        }
                    }
                    if (!vagaliv) {
                        System.out.println("Nenhum carro estacionado.");
                    }
                    break;

                case 3:
                    System.out.println("Encerrando o sistema...");
                    return; // Encerra o programa

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
            System.out.println("Estado atual das vagas:");
            for (boolean[] vaga : vagas) {
                for (int j = 0; j < vaga.length; j++) {
                    System.out.print(vaga[j] ? " True\t " : " False\t ");
                }
                System.out.println("");
            }
        }
    }
}
