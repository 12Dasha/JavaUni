import java.io.*;
import java.util.Scanner;

public class Lab9c {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter type [char, string, int, double]:");
        Scanner scanner = new Scanner(System.in);
        String typeString = scanner.next();
        Types type = typeString.equals("int") ? Types.INT : typeString.equals("char") ? Types.CHAR : typeString
                .equals("double") ? Types.DOUBLE : Types.STRING;
        System.out.println("You have selected type: " + type);
        File in = new File("DashaC.txt");
        File out = new File("DashaC1.txt");
        BufferedReader reader = new BufferedReader(new FileReader(in));
        BufferedWriter writer = new BufferedWriter(new FileWriter(out));
        String line = null;
        TypeDetector detector = new TypeDetector();
        while ((line = reader.readLine()) != null) {
            String[] simbols = line.trim().split(" ");
            for (String s : simbols) {
                if (detector.getType(s) == type)
                    writer.write(s + " ");
            }
        }
        reader.close();
        writer.flush();
        writer.close();
        System.out.println("File out with selected type have written.");
    }
}
