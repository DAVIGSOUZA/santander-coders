package Aulas.Aula04;

import java.util.Scanner;

public class Metodos {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Informe sua idade para saber se você pode votar.");
//
//        int age = sc.nextInt();
//
//        sc.close();
//
//        System.out.println(canVote(age));

        testCanVote();


    }

    static String canVote(int age){
        if (age < 16) return "Sem direito a votar";
        else if (age >= 18 && age <= 70) return "Voto obrigatório";
        else return "Voto facultativo";
    }

    static void testCanVote() {
        int[] cases = {19, 3, 15, 16, 17, 71, 18, 44, 33};
        String[] expected = {
                "Sem direito a votar",
                "Sem direito a votar",
                "Sem direito a votar",
                "Voto facultativo",
                "Voto facultativo",
                "Voto facultativo",
                "Voto obrigatório",
                "Voto obrigatório",
                "Voto obrigatório"
        };

        for (int i = 0; i < cases.length; i++) {
            System.out.printf(cases[i] + " should return " + expected[i] + ": ");
            if (canVote(cases[i]).equals(expected[i])) {
                System.out.println("PASSED");
            } else {
                System.out.println("FAIL");
            }
        }
    }
}
