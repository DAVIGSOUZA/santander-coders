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

        if (choice == 1) System.out.printf("%s - R$ %s", productNames[0], productPrices[0]);
        if (choice == 2) System.out.printf("%s - R$ %s", productNames[1], productPrices[1]);
        if (choice == 3) System.out.printf("%s - R$ %s", productNames[2], productPrices[2]);
        if (choice == 4) System.out.printf("%s - R$ %s", productNames[3], productPrices[3]);
        if (choice == 5) System.out.printf("%s - R$ %s", productNames[4], productPrices[4]);
        if (choice == 6) System.out.printf("%s - R$ %s", productNames[5], productPrices[5]);
        if (choice > 6 || choice < 1) throw new IllegalStateException("Escolha inválida: " + choice);
    }

    static int getInputWithScanner() {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        sc.close();

        return input;
    }
}
