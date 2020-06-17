package Lab10b;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Введите количество мест на парковке: ");
        n = scanner.nextInt();
        Parking parking = new Parking(n);
        Test test = new Test();

        String menu;
        while (true) {
            System.out.println("Parking: ");
            System.out.println("1. Увидеть все места");
            System.out.println("2. Вывезти мащину с парковки");
            System.out.println("3. Создать машины и запарковать их");
            System.out.println("4. Закрыть парковку");
            System.out.println("0. Exit");
            scanner.nextLine();
            menu = scanner.nextLine();
            if (test.test(menu)) {
                if (Integer.parseInt(menu) == 0) {
                    break;
                }

                switch (Integer.parseInt(menu)) {
                    case (1):
                        System.out.println(parking.toString());
                        break;
                    case (2):
                        try {
                            System.out.print("Введите индекс машины которую хотите вывезти: ");
                            int index = scanner.nextInt();
                            if (!(parking.getCar(index) == null)) {
                                parking.deleteCar(index-1);
                                System.out.println(parking.toString());
                            } else {
                                System.out.println("На данном парковочном месте нет машины");
                            }
                        } catch (OutListException e) {
                            System.out.println("Данного места не существует ");
                        }
                        break;
                    case (3):
                        System.out.println("Сколько машин создать? ");
                        int cars = scanner.nextInt();
                        for (int i=0; i<cars; i++){
                            CreateCars.createCar();
                            parking.setPlace(i,CreateCars.createCar());
                        }
                        System.out.println(parking.toString());
                        break;
                    case (4):
                        parking.deleteAll();
                        System.out.println(parking.toString());
                        break;

                }
            }
        }
    }
}
