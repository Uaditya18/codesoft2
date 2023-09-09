import java.awt.image.AreaAveragingScaleFilter;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class wordcounts{
    public static void main(String[] args) throws IOException {
         FileInputStream fin = new FileInputStream("hello.txt");
         Scanner fileInput = new Scanner(fin);


        ArrayList<String> words = new ArrayList<>();
        ArrayList<Integer> count = new ArrayList<>();


        while(fileInput.hasNext())
        {
            String nextWord = fileInput.next();
            if (words.contains(nextWord))
            {
                int index = words.indexOf(nextWord);
                count.set(index, count.get(index)+1);
            }
            else {
                words.add(nextWord);
                count.add(1);
            }
        }
        fin.close();
        fileInput.close();


        for(int i=0;i<words.size();i++)
        {
            System.out.println(words.get(i) +" Occured "+count.get(i)+ "times");
        }
    }
}