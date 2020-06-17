package Lab3;

import java.util.Scanner;

public class Tasks {
    public void PrintSameRooms (House[] value){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число комнат: ");
        String num = scan.next();
        int value1 = Integer.parseInt(num);
        if(value1<0)
            System.out.println("Число комнат не может быть отрицательным: ");
        else{
            for (int i = 0; i < 3; i++) {
                if (value[i].getRooms() == value1) {
                    value[i].printHouse(value[i]);
                }
                else if (i==2) System.out.println("Нет подходящего варианта. ");
            }

        }
        scan.close();
    }
    public void PrintRoomsandFloars (House[] value) {
        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Введите число комнат: ");
        String num = scan.next();
        System.out.println("Введите промежуток: ");
        String one = scan1.next();
        int leftone = Integer.parseInt(one);
        String two = scan1.next();
        int righttwo = Integer.parseInt(two);
        scan1.close();
        int value1 = Integer.parseInt(num);
        if (value1 < 0)
            System.out.println("Число комнат не может быть отрицательным: ");
        else {
            for (int i = 0; i < 3; i++) {
                if (value[i].getRooms() == value1 && (leftone < value[i].getFloar()) && (value[i].getFloar() > righttwo)) {
                    value[i].printHouse(value[i]);
                }
                else if(i==2) System.out.println("Нет подходящего варианта. ");

            }
            scan.close();
        }
    }
    public void PrintBiggerSquare (House[] value){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите площадь: ");
        String num = scan.next();
        scan.close();
        double value1 = Double.parseDouble(num);
        if(value1<0)
            System.out.println("Площадь не может быть отрицательной: ");
        else{
            for (int i = 0; i < 3; i++){
                if (value[i].getSquare() > value1){
                    value[i].printHouse(value[i]);
                }
                else if(i == 2) System.out.println("Нет подходящего варианта. ");
            }
        }
    }
}
