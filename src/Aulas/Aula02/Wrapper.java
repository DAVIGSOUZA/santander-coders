package Aulas.Aula02;

import java.util.ArrayList;
import java.util.List;

public class Wrapper {
    public static void main(StringMethods[] args) {
        //TIPOS PRIMITIVOS
        int inteiro = 20000;
        byte bytee = 16;
        long longg = 6516165132365L;
        short shortt = 12832;
        double doublee = 23.651165165;
        float floatt = 2.651f;
        char charr = 'a';
        boolean booleann = true;

        //WRAPPERS
        Integer intW = inteiro;
        Byte byteW = bytee;
        Long longW = longg;
        Short shortW = shortt;
        Double doubleW = doublee;
        Float floatW = floatt;
        Character charW = charr;
        Boolean booleanW = booleann;

        Integer.valueOf('a');

        List<Integer> list = new ArrayList<>();

        list.add(4);

        System.out.println(list);
    }
}
