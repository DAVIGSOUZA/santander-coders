package Aulas.Aula03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BufferedReaderAndScanner {
//    throws IOException é usado apenas em conjunto com BufferedReader, não precisa com Scanner.
    public static void main(String[] args) throws IOException {
//        String scannerInput = getInputWithScanner();
//        System.out.println("Usando scanner: " + scannerInput);

        String bufferedReaderInput = getInputWithBufferedReader();
        System.out.println("Usando buffered reader: " + bufferedReaderInput);
    }

    static String getInputWithScanner() {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        sc.close();

        return input;
    }

    static String getInputWithBufferedReader() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();

        reader.close();

        return input;
    }
}
