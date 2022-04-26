/* LINK DO VIDEO TUTORIAL: https://www.youtube.com/watch?v=hgF21imQ_Is*/

import java.io.*;

public class ReadBuffereader {
    public static void main(String[] args) {
        try{
           
            BufferedReader br = new BufferedReader(
                 /** colocando filereader dentro do construtor*/
                new FileReader("C:\\Users\\marce\\Desktop\\Projeto git\\Arquivo.txt"));
                
                /* usar o buffereader e printar ele no loop */
                String s;
                /* enquanto a linha debaixo n for igual a nulo ele continuará printando*/
                while((s = br.readLine()) != null){
                    System.out.println(s);
                }
                br.close();
               
        } catch (Exception ex) {
           return;
        }
    }
                
}
       
