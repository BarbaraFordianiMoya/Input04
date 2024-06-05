import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Input04 {
    public static void main(String[] args){
        String filename = "input04text.txt";
        
        try (BufferedReader br = new BufferedReader(new FileReader(filename))){
            String line;
            while ((line = br.readLine()) != null){
                if (line.contains("BlueBumper")){
                    String[] parts = line.split("\\5?");
                    int x = Integer.parseInt(parts[3]);
                    int y = Integer.parseInt(parts[4]);
                    
                    System.out.println("Coordenadas do BlueBunper: x" + x + "y" + y);
                }
            }
        }catch (IOException e){
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
    
    