package Exercicios.Aula03.Questao02;
import java.util.Scanner;

/*
    ENUNCIADO

        Faça o exercício anterior com o operador ternário
 */


public class Questao02 {
    public static void main(String[] args) {
        System.out.println("Informe sua idade para saber se você pode votar.");

        int idade = getInputWithScanner();

        String requiredVote = "Voto obrigatório";
        String optionalVote = "Voto  facultativo";
        String notAllowed = "Sem direito a votar";

        String result = idade < 16 ? notAllowed : (idade >= 18 && idade <= 70 ? requiredVote : optionalVote);

        System.out.println(result);
    }

    static int getInputWithScanner() {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        sc.close();

        return input;
    }
}
