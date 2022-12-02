package Mod01_Exercicios.Aula01.Questao01;

import java.time.Month;

public class ResultadoTrimestral {
    int[] months;

    long[] expences;

    public ResultadoTrimestral(int[] months, long[] expences ) {
        this.months = new int[]{months[0], months[1], months[2]};
        this.expences = new long[]{expences[0], expences[1], expences[2]};
    }

    long totalExpenses() {
        return expences[0] + expences[1] + expences[2];
    }

    void getReport() {
        System.out.println("RESULTADO TRIMESTRAL");
        System.out.printf("De %s até %s. \n", Month.of(months[0]), Month.of(months[2]));
        System.out.println("Gastos totais: R$ " + totalExpenses());
    }
}
