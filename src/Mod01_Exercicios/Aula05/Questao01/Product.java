package Mod01_Exercicios.Aula05.Questao01;

public class Product {
    String name;
    double price;

    MeasureUnit measureUnit;

    public Product (String name, MeasureUnit measureUnit,double price) {
        this.name = name;
        this.price = price;
        this.measureUnit = measureUnit;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public MeasureUnit getMeasureUnit() {
        return measureUnit;
    }
}
