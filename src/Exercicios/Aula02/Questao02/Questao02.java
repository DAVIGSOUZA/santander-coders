package Exercicios.Aula02.Questao02;
/*
    ENUNCIADO

    Faça um programa que pegue o nome completo que o usuário digitar e imprima o nome
    com cada parte separada por espaço, um símbolo de exclamação no início.

    Exemplo:
    Nome: João Mario da Silva
    Resultado: !João !Maria !da !Silva
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Questao02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nome = reader.readLine();

        String[] listaNome = nome.split(" ");

        for (int i = 0; i < listaNome.length; i++) {
            listaNome[i] = " !" + listaNome[i];
            System.out.printf(listaNome[i]);
        }

    }
}
