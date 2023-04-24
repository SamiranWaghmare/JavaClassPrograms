package FileHandling;

import java.io.*;
import java.util.Scanner;

public class ReadLineContainingTheWord {
    public static void main(String[] args) throws IOException {
        File file = new File("TestText.txt");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word you want to look for :");
        String word = sc.next();
        String str;

        FileReader fr = null;

        try {
            fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            while((str = br.readLine()) != null){
                if(str.contains(word)){
                    System.out.println(str);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("invalid file ");
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally{
            fr.close();
        }
    }
}
