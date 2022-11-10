package Exercicios.Aula01.Questao01;

import java.time.Month;

public class Questao01 {
    /*
    Enunciado
        A empresa "XPTO S.A", precisa fazer o fechamento do balanço do primeiro trimestre.
        Os dados passados pela empresa são:

        Janeiro: R$ 10000
        Fevereiro: R$ 17000
        Marco: R$ 23000.

        Faça um programa que calcule e imprima o gasto total do trimestre.
     */

    public static void main(String[] args) {
        int[] period = new int[]{1, 2, 3, 4};
        long[] expenses = new long[]{10000, 17000, 23000, 10000};

        ResultadoTrimestral fromJanToMar = new ResultadoTrimestral(period, expenses);

        fromJanToMar.getReport();
    }
}
