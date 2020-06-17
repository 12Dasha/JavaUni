package Lab12a;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class runner {
    public static void main(String[] args) {
        Data dbUtils = new Data();
        Scanner in = new Scanner(System.in);
        System.out.println("Type option from 1 to 6:");
        int option = in.nextInt();
        ArrayList var10000;
        PrintStream var10001;
        switch(option) {
            case 1:
                System.out.println(dbUtils.getOrderById(4).toString());
                break;
            case 2:
                dbUtils.getOrdersByMaxPriceAndGoodTypesAmount(3100, 1).forEach((order) -> {
                    System.out.println(order.getOrderCode());
                });
                break;
            case 3:
                var10000 = dbUtils.getOrderCodesByGoodName("Vit'ba");
                var10001 = System.out;
                var10000.forEach(var10001::println);
                break;
            case 4:
                var10000 = dbUtils.getSentTodayOrderCodesNotContainingGood("Alenka");
                var10001 = System.out;
                var10000.forEach(var10001::println);
                break;
            case 5:
                dbUtils.sendOrderConsistingOfTodayGoods();
                break;
            case 6:
                dbUtils.deleteOrdersWithGoodAndItsAmount("Alenka", 3);
                break;
            default:
                System.out.println("Wrong input");
        }

        System.out.println("----------");
        dbUtils.closeConnection();
    }
}
