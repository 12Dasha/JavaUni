package Lab3;

import java.util.Scanner;

public class House {
    private int id;
    private int numberofflat;
    private double square;
    private int floar;
    private int rooms;
    private String street;
    private String type;
    private String lifetime;
    public void setId() {
        this.id = (int) (Math.random() * 5);
    }

    public void setNumberOfFlat(int numberofflat) {
        this.numberofflat = numberofflat;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public void setFloar(int floar) {
        this.floar = floar;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setType(String type) {
        this.type = type;
    }
    public void setLifetime(String lifetime) {
        this.lifetime = lifetime;
    }
    public int getId() {return  id;}
    public int getNumberofflat(){return numberofflat;}
    public String getStreet(){
        return street;
    }
    public String getType(){
        return type;
    }
    public String getLifetime(){
        return lifetime;
    }
    public int getRooms(){
        return rooms;
    }
    public int getFloar(){
        return floar;
    }
    public double getSquare(){
        return square;
    }
    public void printHouse(House value){
        System.out.print(" " + value.getId());
        System.out.print("    " +value.getNumberofflat());
        System.out.print("         " +value.getSquare());
        System.out.print("      " +value.getFloar());
        System.out.print("      " +value.getRooms());
        System.out.print("          " +value.getStreet());
        System.out.print("    " +value.getType());
        System.out.print("   " +value.getLifetime() + '\n');
    }
}
