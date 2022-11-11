package Exercicios.Aula02.Complementar;

import java.util.Scanner;

public class Report {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        System.out.println(MonthExpenses.valueOf(input.toUpperCase()).getMes());
        System.out.println(MonthExpenses.valueOf(input.toUpperCase()).getGasto());
    }
}
