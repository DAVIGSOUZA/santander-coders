package Mod01_Exercicios.Aula05.Questao01;

public class Questao01 {
    public static void main(String[] args) {
        ProductList productsAvailable = new ProductList(new Product[]{
                new Product("batata", MeasureUnit.KG, 1.35),
                new Product("Ruffles 50g", MeasureUnit.UNIT, 13.5)
        });

        System.out.println(productsAvailable.getProductByIndex(0).getName());

        Cart myCart = new Cart();

        myCart.addItem(productsAvailable.getProductByIndex(0));

//        myCart.getItems()
    }
}
