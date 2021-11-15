package br.com.tinnova.modulo1;

import java.util.Scanner;

public class Eleicoes {


    public static void main(String[] args) {
        EleicoesModel eleicoesModel = new EleicoesModel();

        eleicoesModel.sistema();
        System.out.println(eleicoesModel.calcPercValidos());
        System.out.println(eleicoesModel.calcPercBrancos());
        System.out.println(eleicoesModel.calcPercNulos());
    }
}
