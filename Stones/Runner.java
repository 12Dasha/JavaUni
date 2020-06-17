package Stones;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) throws CheckTransparencyException, IOException, EmptyStonesListException {
        Scanner scan = new Scanner(System.in);
        Necklace necklace = new Necklace();
        Creation create = new Creation();
        int key;
        int countStone;
        int c;
        String transperancy;
        String transperancy2 = null;
        boolean type = true;
        Service service = new Service();
        while (type) {
            System.out.println(" \n 1). Create necklace \n "
                    + "2). Calculate total weight \n "
                    + "3). Calculate total stones cost \n "
                    + "4). Print result \n "
                    + "5). Range stones by transperancy \n");

            key = scan.nextInt();
            switch (key) {

                case 1: {
                    List<Stone> stoneList = new ArrayList<>();
                    stoneList.add(new Stone(500, 2.49, Transperancy.MINERALS));
                    stoneList.add(new Stone(1000, 3.22, Transperancy.NONTRANSPARENT));
                    stoneList.add(new Stone(5000, 3.55, Transperancy.SEMITRANSPARENT));
                    stoneList.add(new Stone(7000, 3.03, Transperancy.NONTRANSPARENT));
                    stoneList.add(new Stone(8000, 3.51, Transperancy.SEMITRANSPARENT));
                    stoneList.add(new Stone(1000, 3.21, Transperancy.TRANSPARENT));
                    stoneList.add(new Stone(5000, 3.22, Transperancy.SEMITRANSPARENT));
                    stoneList.add(new Stone(9000, 4.35, Transperancy.MINERALS));
                    Creation.create(necklace,stoneList);
                    service.getTracklist(necklace.getStonesList());
                    System.out.println("Info is written into the file");
                    break;
                }
                case 2: {
                    System.out.println("Total carat weight: \n");
                    service.getTotalWeight(necklace.getStonesList());
                    System.out.println("Info is written into the file");
                    break;
                }
                case 3: {
                    System.out.println("Total stones value: \n");
                    service.getTotalPrice(necklace.getStonesList());
                    System.out.println("Info is written into the file");
                    break;
                }
                case 4: {
                    System.out.println("Result: ");
                    service.readFile();
                    break;
                }
                case 5: {
                    System.out.println("Enter the range of transperency: \n");
                    for (Transperancy transperancy1 : Transperancy.values()) {
                        System.out.print(transperancy1.name() + " ");
                    }
                    transperancy = scan.next();
                    System.out.println("Stones found by the range of transperancy: ");
                    service.sortingByTransparency(necklace.getStonesList(), Transperancy.valueOf(transperancy.toUpperCase()));
                    /*System.out.print(Sort.CompareByTransparency(
                            transperancy.toUpperCase(), necklace.getStonesList()));
                    System.out.print(Sort.CompareByTransparency(
                            transperancy2.toUpperCase(), necklace.getStonesList()));*/
                    System.out.println("Info is written into the file");
                    break;
                }
            }
            System.out.println("Do you want to continue: \n1. Yes" + "\n2. No");
            c = scan.nextInt();
            if(c == 2) break;
            }
        }
    }
