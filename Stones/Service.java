package Stones;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Service {
    private Double weight = 0.0;
    private Double price = 0.0;
    private static final String FILE = "file.txt";
    private FileWriter writer;


    public void getTracklist(List<Stone> tracklist) {
        try {
            writer = new FileWriter(FILE, true);
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            for (Stone t : tracklist) {
                bufferWriter.write(t.toString());
                bufferWriter.newLine();
            }
            bufferWriter.newLine();
            bufferWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void getTotalWeight(List<Stone> tracklist) {
        try {
            writer = new FileWriter(FILE, true);
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            for (Stone track : tracklist) {
                weight += track.getWeight();
            }
            bufferWriter.newLine();
            bufferWriter.write("Total weight: " + weight + "gr");
            bufferWriter.newLine();
            bufferWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void getTotalPrice(List<Stone> tracklist) {
        try {
            writer = new FileWriter(FILE, true);
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            for (Stone track : tracklist) {
                price += track.getPrice();
            }
            bufferWriter.newLine();
            bufferWriter.write("Total price: " + price + "dollars");
            bufferWriter.newLine();
            bufferWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sortingByTransparency(List<Stone> tracklist, Transperancy transperancy) {
        try {
            writer = new FileWriter(FILE, true);
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            for (Stone t : tracklist) {
                if (t.getTransperancy() == transperancy) {
                    bufferWriter.newLine();
                    bufferWriter.write(t.toString());
                }
            }
            bufferWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void readFile() {
        try {
            FileReader reader = new FileReader(FILE);
            Scanner scanner = new Scanner(reader);
            int i = 1;
            while (scanner.hasNextLine()) {
                System.out.println(i + " : " + scanner.nextLine());
                i++;
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
