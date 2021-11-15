package br.com.tinnova.modulo4;

import java.util.Scanner;

public class SomaDosMultiplos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número para saber quais são os multiplos de 5 ou 3 e receber o resultado da soma" +
                " desses múltiplos: ");
        int valor = entrada.nextInt();
        int somaMultiplos = 0;
        
        for (int i = 0; i < valor; i++) {
            if (i % 5 == 0 || i % 3 == 0) {
                somaMultiplos += i;
            }
        }
        System.out.println("O resultado da soma dos multiplos abaixo do valor " + valor + " é: " + somaMultiplos);
        entrada.close();
    }
}
