package Exercicios.Aula04.Questao01;

/*
    ENUNCIADO
        Faça um programa para testar o exercicio do "Voto”, feito em casa.
        O programa deve utilizar um array( pode ser bidimensional), onde devem estar armazenados
        a entrada e o resultado do método, também conhecido como array de teste.
        O programa deve percorrer o array de teste, enviando a entrada para o método e comparar
        o resultado do método com o valor armazenado no array.

        Caso o resultado do array seja igual ao método. Exibir a seguinte mensagem:
            Teste (numero do teste) - Sucesso.

        Caso o resultado do array seja diferente do método Exibir a seguinte mensagem:
            Teste (numero do teste) - Falhou.

        A execução da aplição deve ficar parecida com a forma abaixo.

        Por exemplo:
            Teste1 - Sucesso
            Teste2 - Falha
            Teste3 - Sucesso

        Os testes devem conter:
            3 casos “Não pode votar”
            3 casos “Voto obrigatório”
            3 casos “Voto opcional”

        Observação:
            Utilizar casos extremos que atinjam o começo e o fim de uma condição.

        Por exemplo:
            18 e 70 nos casos de "Voto obrigatório”
            16 e 17 nos casos de "Voto opcional”

        Extra:
            Gravar o resultado de cada teste dentro de um array, para informar o resultado geral dos testes.

            Caso todos os testes passem com sucesso:
                Exibir a seguinte mensagem: "Testes executados com sucesso".

            Caso algum dos testes falhe:
                Exibir a mensagem com os testes que falharam:
                Os seguintes testes falharam: Teste 1 - Resultado : "Obrigatorio" - Correto: "Não pode votar"
 */


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

        System.out.println("----------------------------");

        TestCaseCanVote testCase = new TestCaseCanVote(16, "Voto facultativo");

        testCanVote(testCase.getTestCase(), testCase.getExpectedOutput());

        System.out.println("----------------------------");

        TestCaseCanVote[] testCases = {
                new TestCaseCanVote(19, "Sem direito a votar"),
                new TestCaseCanVote(3, "Sem direito a votar"),
                new TestCaseCanVote(16, "Voto facultativo"),
                new TestCaseCanVote(18, "Voto obrigatório"),
        };

        testCanVote(testCases);

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
            System.out.printf("FAIL - returned %s \n", canVote(testCase));
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

    static void testCanVote(TestCaseCanVote[] cases) {
        boolean[] testResults = new boolean[cases.length];

        for (int i = 0; i < cases.length; i++) {
            System.out.printf("TEST CASE %s - ", i + 1);
            testResults[i] = testCanVote(cases[i].getTestCase(),cases[i].getExpectedOutput());
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
