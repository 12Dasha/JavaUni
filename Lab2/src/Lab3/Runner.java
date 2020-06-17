package Lab3;
import Lab3.Tasks;
import Lab3.House;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Runner {
    public static void main(String[] args) throws IOException {
        House one = new House();
        House two = new House();
        House three = new House();
        House[] arr = {one, two, three};
        String[] name = {"id", "Номер квартиры", "Площадь", "Этаж", "Количество комнат", "Улица",
                "Тип здания", "Срок эксплуатации"};
        for (int i = 0; i < 8; i++)
            System.out.print(" " + name[i]);
        System.out.println(" ");
        {
            one.setId();
            one.setNumberOfFlat(64);
            one.setSquare(89.2);
            one.setFloar(2);
            one.setRooms(5);
            one.setStreet("улица Яблоко");
            one.setType("квартира");
            one.setLifetime("Срок эксплуатации до 2023");
            one.printHouse(one);
        }
        {
            two.setId();
            two.setNumberOfFlat(65);
            two.setSquare(50.3);
            two.setFloar(8);
            two.setRooms(2);
            two.setStreet("улица Зеленая");
            two.setType("таунхаус");
            two.setLifetime("Срок эксплуатации до 2047");
            two.printHouse(two);
        }
        {
            three.setId();
            three.setNumberOfFlat(78);
            three.setSquare(62);
            three.setFloar(2);
            three.setRooms(3);
            three.setStreet("улица Птичья");
            three.setType("квартира");
            three.setLifetime("Срок эксплуатации до 2034");
            three.printHouse(three);
        }
        System.out.println("Что вы хотите выполнить? \n" + "1. Вывести список квартир, имеющих заданное число комнат\n" + "2. Вывести список квартир, имеющих заданное число комнат и расположенных\n" +
                "на этаже, который находится в заданном промежутке\n"+"3. Вывести список квартир, имеющих площадь, превосходящую заданную. \n");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String c = reader.readLine();
        Tasks all = new Tasks();
        switch (c){
            case "1": {all.PrintSameRooms(arr); break;}
            case "3": {all.PrintBiggerSquare(arr); break;}
            case "2": {all.PrintRoomsandFloars(arr); break;}
            default:
                System.out.println("Вы ввели неправильное число! ");;
        }
    }
}
