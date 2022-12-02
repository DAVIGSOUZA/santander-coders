package Mod01_Exercicios.Aula02.Complementar;
/*
ENUNCIADO
    Faça um programa, que solicite ao usuário que informe o mês e o sistema deve imprimir o valor gasto do mês.
    ->Considerações:
        Utilizar enum
        Criar um valor para cada mês
 */
public enum MonthExpenses {
    JANEIRO("janeiro", 1000),
    FEVEREIRO("fevereiro",1000),
    ABRIL("abril",1000),
    MARÇO("março",1000),
    MAIO("maio",1000),
    JUNHO("junho",1000),
    JULHO("julho",1000),
    AGOSTO("agosto",1000),
    SETEMBRO("setembro",1000),
    NOVEMBRO("novembro",1000),
    DEZEMBRO("dezembro",1000);

    private String mes;
    private Integer gasto;

    MonthExpenses (String mes, Integer gasto) {
        this.mes = mes;
        this.gasto = gasto;
    }

    public Integer getGasto() {
        return gasto;
    }

    public String getMes() {
        return mes;
    }
}
