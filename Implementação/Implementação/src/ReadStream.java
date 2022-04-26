/*LINK DO ARTIGO: https://mkyong.com/java8/java-8-stream-read-a-file-line-by-line/ */

import java.io.*;
import java.nio.file.*;
import java.util.stream.*;

public class ReadStream {
    public static void main(String[] args) {
        
        String fileName= "C:\\Users\\marce\\Desktop\\Projeto git\\Arquivo.txt";
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
           
            stream.forEach(System.out::println);
        }
        catch ( IOException e) {
            e.printStackTrace();
        }
    }
}
