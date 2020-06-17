package Lab10;

import java.io.*;
import java.util.*;

public class Lab10a {

    private static final Comparator<String> LINE_LENGTH_COMPARATOR = new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            return o1.length() - o2.length();
        }
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder builder1 = new StringBuilder();
        FileWriter fw =null;
        File file = new File("Dasha1.txt");
        StringBuilder builder = new StringBuilder();
        int count =0;
        BufferedReader br = null;
        try{
            br = new BufferedReader(new FileReader("Dasha.txt"));
            fw = new FileWriter(file);
            String tmp = "";
            while ((tmp = br.readLine())!=null){
                String s[] = tmp.split("\\s");
                for(String res : s){
                    builder.append(res)
                            .append(" ");
                }
                builder.append("\n");
            }
            System.out.println("Программа сортирует строки стихотворения по размеру: от самой маленькой до самой большой" +
                    "\nРезультат ищите в файле Dasha1.txt");
            List<String> lines = Arrays.asList(builder.toString().split("\n"));
            Collections.sort(lines, LINE_LENGTH_COMPARATOR);
            for(String line : lines){
                fw.write(line + "\n");
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

