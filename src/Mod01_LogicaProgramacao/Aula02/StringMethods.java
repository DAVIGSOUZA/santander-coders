package Mod01_LogicaProgramacao.Aula02;

public class StringMethods {
    public static void main(String[] args) {
        String teste = new String("teste");
        String outroTeste = "outro teste";

        int numero = 5;
//      Soma feita da esquerda para direita, quando somamos string com numeros o resultado é uma concatenação
        System.out.println("Soma = " + 3 + 5);

//      Aqui os numeros são somados primeiro, e depois quando somado a string é concatenado.
        System.out.println(3 + 5 + " é a soma");

        int outroNumero = 3 + 5;
        String maisUmteste = "teste ";

        maisUmteste += outroNumero;

        System.out.println(maisUmteste);

        String concatenado = "Soma = ".concat(outroNumero+"");

        System.out.println(concatenado);

        System.out.println(concatenado.length());

        System.out.println(concatenado.charAt(0));

        System.out.println(concatenado.indexOf("a"));

        System.out.println(concatenado.contains("oma"));
        System.out.println(concatenado.contains("u"));

        String oba = "oba oba";

        System.out.println(oba.indexOf("b"));
        System.out.println(oba.indexOf("o", 2));

        System.out.println(oba.substring(4));
        System.out.println(oba.substring(2,5));

        String email = "teste@domain.com";
        String[] emailsSplited = email.split("@");

        System.out.println(emailsSplited[0]);
        System.out.println(emailsSplited[1]);

        String joined = String.join("@", emailsSplited[0], emailsSplited[1]);

        System.out.println(joined);

        String capitalized = joined.toUpperCase();

        System.out.println(capitalized);
        System.out.println(capitalized.toLowerCase());

        String espacos = "    a   a  b  b  cc  ";

        System.out.println(espacos.trim());
        System.out.println(espacos.replace(" ", ""));

        String input = "teste";
        String dirtyInput = "   teste";
        String casesInput = "TeSTe";

        System.out.println(input.equals(dirtyInput.trim()));
        System.out.println(input.equals(casesInput));
        System.out.println(input.equals(casesInput.toLowerCase()));
    }
}
