package Mod01_Exercicios.Aula02.Questao01;

/*
ENUNCIADO
    Faça um programa que receba uma frase com
    "Janeiro: 1543, Fevereiro: 1222, Março: 1234".
    Imprima sequencialmente em linhas separadas por cada mês e na última linha a frase:
    "Total: " e o valor da soma de todos os meses. Exemplo:

    Janeiro: 1543
    Fevereiro: 1222
    Março: 1234
    Total: 3999
 */

public class Questao01 {
    public static void main(String[] args) {
        String frase = "Janeiro: 1543, Fevereiro: 1222, Março: 1234";

        String[] mesValor = frase.split(", ");

        for (int i = 0; i < mesValor.length; i++) {
            System.out.println(mesValor[i]);
        }

        Integer[] valores = new Integer[3];

        Integer total = 0;

        for (int i = 0; i < mesValor.length; i++) {
            String[] parser = mesValor[i].split(": ");
            valores[i] = Integer.parseInt(parser[1]);
            total += valores[i];
        }

        System.out.println("Total: " + total);
    }
}
