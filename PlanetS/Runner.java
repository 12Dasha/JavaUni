package PlanetS;

import java.io.*;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) throws IOException {
        File file = new File("DashaC.txt");
        File file1 = new File("DashaC1.txt");
        FileReader fr = new FileReader(file);
        BufferedReader reader = new BufferedReader(fr);
        try {
            String name = reader.readLine();
            if (name.isEmpty()) throw new NullPointerException();
            String star = reader.readLine();
            if (star.isEmpty()) throw new NullPointerException();
            String moon = reader.readLine();
            if (moon.isEmpty()) throw new NullPointerException();
            /*System.out.println("Write down name of your System: ");
            Scanner scan2 = new Scanner(System.in);
            String name = scan2.nextLine();
            if (name.isEmpty()) throw new NullPointerException();
            System.out.println("Write down name of your Star: ");
            String star = scan2.nextLine();
            if (star.isEmpty()) throw new NullPointerException();
            System.out.println("Write down name of your Moon: ");
            String moon = scan2.nextLine();
            if (moon.isEmpty()) throw new NullPointerException();*/
            SolarSystem our = new SolarSystem(name);
            int n;
            Scanner scan1 = new Scanner(System.in);
            System.out.println("How many planets do you want to put in Solar System?");
            n = scan1.nextInt();
            //scan1.close();
            System.out.println("Write down names of Planets ");
            Scanner scan = new Scanner(System.in);
            for (int i = 0; i < n; i++) {
                if (scan.hasNextLine()) {
                    String s = scan.nextLine();
                    if (s.isEmpty()) throw new NullPointerException();
                    our.addPlanet(new Planet(s));
                }
            }
            scan.close();
            our.addMoon(new Moon(moon));
            our.addStar(new Star(star));
            System.out.println(our.toString());
            System.out.println("Hash Code of System: " + our.hashCode());
            if (our.equals(our) == true) System.out.println(name + " is equal to " + name);
            else System.out.println("oops");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            fr.close();
        }
    }
}
