package br.com.tinnova.modulo2;

import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual o tamanho do seu vetor ?");
        int vetorN = entrada.nextInt();
        int count = 0;
        int i = 0;
        double aux = 0;
        double[] vetor = new double[vetorN];

        while (count < vetor.length) {
            System.out.println("digite o valor do " + (count + 1) + "º vetor !");
            vetor[i] = entrada.nextDouble();
            count++;
            i++;
        }

        for (i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }
        for (i = 0; i < vetor.length; i++) {
            System.out.println(" " + vetor[i]);
        }
        entrada.close();
    }
}
