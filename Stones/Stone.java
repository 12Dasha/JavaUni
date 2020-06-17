package Stones;

import PlanetS.SolarSystem;

import java.io.Serializable;

public class Stone implements Serializable {
    private double weight;
    private double price;
    private Transperancy transperancy;
    private transient String name;
    public Stone(){

    }
    public Stone(double weight, double price, Transperancy transperancy){
        this.weight = weight;
        this.price = price;
        this.transperancy = transperancy;
    }
    public Stone(double weight, double price, Transperancy transperancy, String name){
        this.weight = weight;
        this.price = price;
        this.transperancy = transperancy;
        this.name = name;
    }
    public double getWeight(){return weight;}
    public void setWeight(double weight) throws WeightNegativeException{
        if(weight<=0) throw new WeightNegativeException("Weight can't be negative or equal to zero");
        this.weight = weight;
    }
    public double getPrice(){return price;}
    public void setPrice(double price) throws PriceNegativeException{
        if(price<=0) throw new PriceNegativeException("Price can't be negative or equal to zero");
        this.price = price;
    }
    public Transperancy getTransperancy(){return transperancy;}
    public void setTransperancy(Transperancy transperancy){this.transperancy = transperancy;}
    @Override
    public String toString(){
        return "\nStone: " + "weight =  " + weight + ", price = " + price + " transparency: "+ transperancy;
    }
    public boolean equals(Object ob){
        if(this == ob) return true;
        if(ob == null) return false;
        if(getClass() != ob.getClass()) return false;
        Stone other = (Stone) ob;
        if(weight!= other.weight) return false;
        if(price!= other.price) return false;
        if (transperancy!=other.transperancy) return false;
        return true;
    }
}
