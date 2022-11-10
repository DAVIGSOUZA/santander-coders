package Exercicios.Aula01.Questao02;

public class Questao02 {
    /*
    Enunciado
        Faça um programa que dado a idade em uma variável inteira, adicione as casas decimais: ".023".
        Após imprima a mensagem "O número da sorte é: " e imprima o número resultante.
        Para isso, utilize alguma forma de casting.
     */
    public static void main(String[] args) {
        int age = 36;
        double luckyNumber = age + (float)0.023;

//      Automatic casting
//      Widening casting is done automatically when passing a smaller size type to a larger size type:
//      source: https://www.w3schools.com/java/java_type_casting.asp
        double luckyNumber2 = age + 1.023f;

        System.out.println("O número da sorte é: " + luckyNumber);
        System.out.println("O número da sorte é: " + luckyNumber2);
    }
}
