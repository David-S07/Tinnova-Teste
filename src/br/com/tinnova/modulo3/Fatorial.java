package br.com.tinnova.modulo3;

import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o número que você deseja calcular o fatorial: ");
        int numeroFatorial = entrada.nextInt();
        int count = 1;
        int calc = numeroFatorial;

        if (calc == 0) {
            System.out.println("O resultado é igual a 1!");
        } else if (calc >= 0) {
            while (calc > 1) {
                count *= calc;
                calc--;
            }
            System.out.println("O fatorial de " + numeroFatorial + " é igual a: " + count);
        } else {
            System.out.println("número inválido !");
        }
        entrada.close();
    }
}

