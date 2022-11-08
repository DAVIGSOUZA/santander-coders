package Paradigmas;

public class Paradigmas {
    public static void main(String[] args) {
//        paradigma funcional
//        BinaryOperator<Integer> soma = (a, b) -> a + b;
//
//        int resultado = soma.apply(2,3);
//
//        System.out.println(resultado);


//        paradigma Orientado a objeto
        Calculadora myCalc = new Calculadora(2, 3);

        System.out.println(myCalc.soma());

    }
}