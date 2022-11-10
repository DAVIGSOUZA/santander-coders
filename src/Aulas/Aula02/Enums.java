package Aulas.Aula02;

public enum Enums {
//    exemplo de enum
    TESTE ("teste", 1),
    QUALQUER ("qualquer", 2),
    PALAVRA ("palavra", 3);

    private String valor;
    private Integer numero;

//    construtor
    Enums(String valor, Integer numero) {
        this.valor = valor;
        this.numero = numero;
    }

//    getters
    public String getValor() {
        return this.valor;
    }

    public Integer getNumero() {
        return this.numero;
    }

//    setter
    public void setNumero(Integer numero) {
        this.numero = numero;
    }
}
