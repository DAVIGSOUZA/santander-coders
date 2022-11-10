package Aulas.Aula02;

public class Contants {
//        Boa prática, usar SNAKE_CASE para contantes.
//        ctrl + alt + c -> converte para SNAKE_CASE
//        Ex: outraVar -> OUTRA_VAR
    static final String OUTRA_VAR = "oi";
    static final int NUMERO_CONSTANTE = 2;
    static final String MY_VARIABLE = "variavel contante";

    public static void main(String[] args) {
        System.out.println(OUTRA_VAR + " " + NUMERO_CONSTANTE + " " + MY_VARIABLE);

//        ENUMS
        for (Enums value : Enums.values()) {
//        acessar Enum
            System.out.println(value);
//        acessar indice
            System.out.println(value.ordinal());
//        acessar valor do enum, depende de metodos getters
            System.out.println(value.getNumero());
            System.out.println(value.getValor());

            value.setNumero(999);
        }

        System.out.println(Enums.TESTE.getNumero());
    }
}
