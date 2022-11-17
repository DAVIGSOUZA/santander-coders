package Exercicios.Aula03.Questao04;

/*
    Enunciado
        Faça o exercício anterior, utilizando if-else
 */

import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        String[] productNames = {"Coca-Cola", "Coca-Cola 0", "Pepsi", "Guaraná Antarctica", "Fanta Laranja", "Água"};
        float[] productPrices = {5, 4.5f, 4.4f, 3.5f, 4.23f, 2.5f};

        System.out.println("Informe o número do produto desejado.");

        for (int i = 0; i < productNames.length; i++) {
            System.out.printf("%s - %s - R$ %s \n", (i + 1), productNames[i], productPrices[i] );
        }

        int choice = getInputWithScanner();

        if (choice > 6 || choice < 1) {
            throw new IllegalStateException("Escolha inválida: " + choice);
        } else {
            System.out.printf("Você escolheu %s - R$ %s", productNames[choice - 1], productPrices[choice - 1]);
        }
    }

    static int getInputWithScanner() {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        sc.close();

        return input;
    }
}
