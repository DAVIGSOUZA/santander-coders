package Exercicios.Aula03.Questao03;
import java.util.Scanner;

/*.
    ENUNCIADO

        Escreva um programa que simule uma máquina de venda de bebidas. O usuário poderá escolher dentre 6 opções de bebidas abaixo:

        1 - Coca-Cola - R$ 5
        2 - Coca-Cola 0 - R$ 4.50
        3 - Pepsi - R$ 4,40
        4 - Guaraná Antarctica - R$ 3,50
        5 - Fanta Laranja - R$ 4,23
        Água - R$ 2,50
        O programa devera imprimir na tela o nome e preço do refrigerante selecionado, utilize switch.
 */


public class Questao03 {
    public static void main(String[] args) {
        String[] productNames = {"Coca-Cola", "Coca-Cola 0", "Pepsi", "Guaraná Antarctica", "Fanta Laranja", "Água"};
        float[] productPrices = {5, 4.5f, 4.4f, 3.5f, 4.23f, 2.5f};

        System.out.println("Informe o número do produto desejado.");

        for (int i = 0; i < productNames.length; i++) {
            System.out.printf("%s - %s - R$ %s \n", (i + 1), productNames[i], productPrices[i] );
        }

        int choice = getInputWithScanner();

        switch (choice) {
            case 1 -> System.out.printf("%s - R$ %s", productNames[0], productPrices[0]);
            case 2 -> System.out.printf("%s - R$ %s", productNames[1], productPrices[1]);
            case 3 -> System.out.printf("%s - R$ %s", productNames[2], productPrices[2]);
            case 4 -> System.out.printf("%s - R$ %s", productNames[3], productPrices[3]);
            case 5 -> System.out.printf("%s - R$ %s", productNames[4], productPrices[4]);
            case 6 -> System.out.printf("%s - R$ %s", productNames[5], productPrices[5]);
            default -> throw new IllegalStateException("Escolha inválida: " + choice);
        }

    }

    static int getInputWithScanner() {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        sc.close();

        return input;
    }
}
