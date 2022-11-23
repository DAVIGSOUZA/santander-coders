package Aulas.Aula05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(3);
        numeros.add(5);
        numeros.add(7);

        System.out.println(numeros.get(0));

        for (Integer numero : numeros) {
            System.out.println(numero);
        }

        for (int i = 0; i < numeros.size() ; i++) {
            System.out.println(numeros.get(i));
        }

        numeros.forEach(a-> System.out.println(a));

        numeros.forEach(System.out::println);

        List<Integer> outrosNumeros = Arrays.asList(1,2,3);
        System.out.println(outrosNumeros);

        List<Integer> maisNumeros = List.of(1,2,3);
        System.out.println(maisNumeros);

        List<Integer> numeros2 = new ArrayList<>(Arrays.asList(100,200,300));

        numeros2.add(500);

        System.out.println(numeros2);

        numeros2.remove(0);

        System.out.println(numeros2);

        System.out.println(numeros2.contains(200));

        numeros.clear();

        System.out.println(numeros);

        numeros2.removeIf(a-> a == 2);

        numeros2.removeAll(numeros);

        List qualquerLista = new ArrayList();

        qualquerLista.add(true);
        qualquerLista.add(2);

        System.out.println(qualquerLista);
    }
}
