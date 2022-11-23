package Aulas.Aula06;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;

public class FileReader {
    public static void main(String[] args) {

        //Scanner
//        try (Scanner sc = new Scanner(new FileInputStream("file-read-test.txt"))) {
//            while (sc.hasNextLine()){
//                System.out.println(sc.nextLine());
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

        //FIles
//        try {
//            List<String> fileContent = Files.readAllLines(Path.of("file-read-test.txt"));
//            System.out.println(fileContent);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//


        List<String> lines = List.of("foo", "bar");

        try {
//            cria arquivo
            Files.write(Path.of("file-read-test.txt"), lines);
//            adiciona ao fim do arquivo
            Files.write(Path.of("file-read-test.txt"), lines, StandardOpenOption.APPEND);

            List<String> fileContent = Files.readAllLines(Path.of("file-read-test.txt"));
            System.out.println(fileContent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
