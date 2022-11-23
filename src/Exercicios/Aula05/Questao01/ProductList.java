package Exercicios.Aula05.Questao01;

public class ProductList {
    Product[] products;

    public ProductList(Product[] products) {
        this.products = products;
    }

    public Product[] getProducts() {
        return products;
    }

    public Product getProductByIndex(int index) {
        return products[index];
    }
}
