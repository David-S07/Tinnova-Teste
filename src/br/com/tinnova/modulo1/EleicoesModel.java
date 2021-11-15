package br.com.tinnova.modulo1;

import java.util.Scanner;

public class EleicoesModel {

    EleicoesDTO eleicoesDTO = new EleicoesDTO();

    public void sistema() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o número total de eleitores ");
        eleicoesDTO.setEleitores(entrada.nextDouble());

        System.out.println("Digite a quantidade de votos validos");
        eleicoesDTO.setVotosValidos(entrada.nextDouble());

        System.out.println("Digite a quantidade de votos brancos");
        eleicoesDTO.setVotosBrancos(entrada.nextDouble());

        System.out.println("Digite qual o total de votos nulos ");
        eleicoesDTO.setVotosNulos(entrada.nextDouble());

        entrada.close();
    }

    public String calcPercValidos() {

        double calcTotalEleitores = eleicoesDTO.getVotosValidos() / eleicoesDTO.getEleitores() * 100;
        return "O percentual dos votos válidos em relação ao total de eleitores é " + calcTotalEleitores + "%";
    }

    public String calcPercBrancos() {

        double calcTotalEleitores = eleicoesDTO.getVotosBrancos() / eleicoesDTO.getEleitores() * 100;
        return "O percentual dos votos em branco em relação ao total de eleitores é " + calcTotalEleitores + "%";
    }

    public String calcPercNulos() {

        double calcTotalEleitores = eleicoesDTO.getVotosNulos() / eleicoesDTO.getEleitores() * 100;
        return "O percentual dos votos nulos em relação ao total de eleitores é " + calcTotalEleitores + "%";
    }
}
