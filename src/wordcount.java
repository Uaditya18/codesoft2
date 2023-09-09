import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
public class wordcount{
    public static void main(String[] args) {
        System.out.println("Enter the name of the file ");
        Scanner sc = new Scanner(System.in);
        String  filename = sc.next();
        File fileobj = new File(filename);

        if(!fileobj.exists())
        {
            System.out.println("file not found error please enter a valid file name ");
        }
        else {
            int count = countwords(filename);
            System.out.println("The total number of word file has "+count);
        }
    }


    public static int countwords(String filename)
    {
        int count =0;

        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String linestr = null;
            String wordarr[] = null;

            while ((linestr = br.readLine()) !=null){
                wordarr = linestr.split(" ");
                count = count + wordarr.length;
            }
            br.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return count;
    }

}
