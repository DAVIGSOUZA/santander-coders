package Mod01_LogicaProgramacao.Aula04;

import java.util.Arrays;

public class Exemplo {
    public static void main(String[] args) {
        int[] numbers = {1 ,32, 23, 51, 98, 11, 45, 987, 125, 657};

        Arrays.sort(numbers);

        for (int number : numbers) {
            System.out.println(number);
        }

        Arrays.toString(numbers);

        System.out.println(Arrays.binarySearch(numbers, 45));
    }
}
