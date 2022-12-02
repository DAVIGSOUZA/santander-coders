package Mod01_LogicaProgramacao.Aula05;

import java.util.HashSet;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {
        HashSet<Integer> conjunto = new HashSet<>();

        conjunto.add(4);
        conjunto.add(2);
        conjunto.add(3);
        //não permite elementos iguais
        conjunto.add(1);

        conjunto.forEach(a-> System.out.println(a));

        System.out.println(conjunto);

        for (Integer integer : conjunto) {
            System.out.println(integer);
        }

        final var teste = conjunto.add(5);

        System.out.println(teste);
        System.out.println(conjunto);

        Set<Integer> outroSet = Set.of(3,4,5,6);

        Set<Integer> maisUmSet = new HashSet<>();

        System.out.println(outroSet);

        boolean checkOutroSet = outroSet.contains(4);

        System.out.println(checkOutroSet);
    }
}
