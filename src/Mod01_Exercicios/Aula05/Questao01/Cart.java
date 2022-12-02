package Mod01_Exercicios.Aula05.Questao01;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    Map<Product, Integer> items = new HashMap<>();

    public void addItem(Product item) {
        if(items.containsKey(item)){
            items.computeIfPresent(item, (k, v) -> v + 1);
        } else {
            items.putIfAbsent(item, 1);
        }
    }

    public Map<Product, Integer> getItems() {
        return items;
    }
}
