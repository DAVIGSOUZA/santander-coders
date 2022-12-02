package Mod01_LogicaProgramacao.Aula05;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<String, Integer> nomeIdade = new HashMap<>();

        nomeIdade.put("fulano", 11);
        nomeIdade.put("ciclano", 22);

        // sobrepoe o valor
        nomeIdade.put("ciclano", 25);

        // não sobrepoe, só adiciona se não existir no map
        nomeIdade.putIfAbsent("ciclano", 55);

        System.out.println(nomeIdade);

        nomeIdade.entrySet().forEach(entry-> {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        });

        for (Map.Entry<String, Integer> entry : nomeIdade.entrySet()) {
            System.out.println(entry);
        }
    }
}
