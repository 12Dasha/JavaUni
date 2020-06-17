import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Buffer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder builder1 = new StringBuilder();
        FileWriter fw =null;
        File file = new File("Dasha1.txt");
        StringBuilder builder = new StringBuilder();
        Frequency frequency =new Frequency();
        int count =0;
        BufferedReader br = null;
        try{
            br = new BufferedReader(new FileReader("Dasha.txt"));
            fw = new FileWriter(file);
            String tmp = "";
            while ((tmp = br.readLine())!=null){
                String s[] = tmp.split("\\s");
                for(String res : s){
                    fw.write(res + " ");
                    builder.append(res)
                            .append(" ");
                }
                fw.write("\n");
                builder.append("\n");
            }
            System.out.println(builder.toString());
            System.out.println("Прочитайте стихотворение, сколько и какие слова вы хотите подсчитать? "
            + "\n" + "Введите количество");
            int n = scanner.nextInt();
            //if(n==1) System.out.println("Введите слово");
            System.out.println("Введите слова");
            for(int i = 0; i<n; i++){
                if(scanner.hasNext()){}
                String s = scanner.nextLine();
                builder1.append(s);
            }
            String temps[] = builder1.toString().split("\\s");
            for (String temp:temps){
                int k = frequency.frequencyCount(builder.toString(), temp);
                fw.write("\nКоличество слова " + temp + " = " + k);
            }
        }catch (IOException e){
            e.printStackTrace();
        } finally {
            if (br!=null){
                try {
                    br.close();
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
            if(fw!=null){
                try{
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
