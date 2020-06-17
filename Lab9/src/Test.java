import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        String file = "Dasha.txt";
        File f = new File(file);
        int b, count = 0;
        FileReader is = null;
        try{
            is = new FileReader(f);
            while ((b = is.read())!=-1){
                System.out.println((char)b);
                count++;
            }
        } catch(IOException e){
            System.err.println("Error file: " + e);
        }  finally {
            try {
                if(is!=null){
                    is.close();
                }

            } catch (IOException e){
                System.err.println("Error of closure: " + e);
            }
        }
    }
}
