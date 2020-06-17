import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Writer {
    public static void main(String[] args) {
        String pArray[] = {"2013", "Java", "Long"};
        File fbyte = new File("Dasha1.txt");
        FileOutputStream fos = null;
        try{
            fos = new FileOutputStream(fbyte);
            for (String a : pArray){
                fos.write(a.getBytes());
            }
        }catch(IOException e){
            System.err.println("Problem with writing: " + e);
        } finally {
            try {
                if(fos != null){
                    fos.close();
                }
            }catch (IOException e){
                System.err.println("Problem with closure: "+ e);
            }
        }
    }
}
