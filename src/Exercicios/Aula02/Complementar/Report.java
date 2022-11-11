package Exercicios.Aula02.Complementar;

public class Report {
    public static void main(String[] args) {
        for (MonthExpenses value : MonthExpenses.values()) {
            System.out.println(value.getMes());
            System.out.println(value.getGasto());
        }
    }
}
