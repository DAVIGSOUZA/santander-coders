package Exercicios.Aula04.Questao01;

import java.util.ArrayList;
import java.util.List;

public class Questao01 {
    public static void main(String[] args) {
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

        testCanVote(cases, expected);
    }

    static String canVote(int age){
        if (age < 16) return "Sem direito a votar";
        else if (age >= 18 && age <= 70) return "Voto obrigatório";
        else return "Voto facultativo";
    }

    static boolean testCanVote(int testCase, String expectedOutput) {
        System.out.printf(testCase + " should return " + expectedOutput + ": ");
        if (canVote(testCase).equals(expectedOutput)) {
            System.out.println("PASSED");
            return true;
        } else {
            System.out.println("FAIL");
            return false;
        }
    }

    static void testCanVote(int[] cases, String[] outputs) {
        boolean[] testResults = new boolean[cases.length];

        for (int i = 0; i < cases.length; i++) {
            System.out.printf("TEST CASE %s - ", i + 1);
            testResults[i] = testCanVote(cases[i],outputs[i]);
        }

        testReport(testResults);
    }

    static void testReport(boolean[] testResults) {
        int totalSuccess = 0;
        List<Integer> failedTestCases = new ArrayList<>();

        for (int i = 0; i < testResults.length; i++) {
            if (testResults[i]) totalSuccess++;
            else failedTestCases.add(i + 1);
        }

        System.out.printf("%s of %s tests succeeded. \n", totalSuccess, testResults.length);
        System.out.printf("%.2f%% SUCCESS. \n", (double) totalSuccess / testResults.length * 100);
        System.out.printf("FAILED TEST CASE(s): %s. \n", failedTestCases);
    }
}
