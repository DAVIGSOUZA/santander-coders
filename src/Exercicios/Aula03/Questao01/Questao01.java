package Exercicios.Aula03.Questao01;
import java.util.Scanner;

/*
    ENUNCIADO

        Escreva um programa para verificar se uma pessoa pode votar ou não, de acordo com sua idade.
        O programa deve escrever na tela as seguintes informacões:

        "Voto obrigatório"  - para eleitoras e eleitores, com idades entre 18 e 70 anos.

        "Voto  facultativo" - para maiores ou iguais a 16 anos e menores de 18 anos;
         assim como maiores de 70 anos.

        "Sem direito a votar" - para o restante.

        Fonte: https://www.tre-sc.jus.br/eleicoes/tire-suas-duvidas/voto-obrigatoriedade

        * Exemplo
        Entrada - 16
        Saida - Voto Facultativo
 */

public class Questao01 {
    public static void main(String[] args) {
        System.out.println("Informe sua idade para saber se você pode votar.");

        int idade = getInputWithScanner();

        String requiredVote = "Voto obrigatório";
        String optionalVote = "Voto  facultativo";
        String notAllowed = "Sem direito a votar";

        if (idade < 16 ) {
            System.out.println(notAllowed);
        } else if (idade >= 18 && idade <= 70) {
            System.out.println(requiredVote);
        } else {
            System.out.println(optionalVote);
        }

    }

    static int getInputWithScanner() {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        sc.close();

        return input;
    }
}
