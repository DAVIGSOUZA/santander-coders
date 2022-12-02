package Mod01_Exercicios.Aula05.Questao01;

public enum MeasureUnit {
    KG("Quilo"),
    UNIT("Unidade");

    private String name;

    MeasureUnit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
