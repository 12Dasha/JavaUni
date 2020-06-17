package Stones;

public class PreciousStone extends Stone {
    private PreciousType type;
    public PreciousStone(){
        super();
    }
    public PreciousStone(double weight, double price, PreciousType type, Transperancy transperancy){
        super(weight,price,transperancy);
        this.type = type;
    }
    public PreciousType getType(){
        return type;
    }
    public void setType(PreciousType type){
        this.type = type;
    }
    @Override
    public String toString(){
        return "\nPrecious stone: " +"\n[ name of the stone: " + this.getType() +"\nweight = " + this.getWeight() + "\nprice = " + this.getPrice()+ "\ntransparency: "+this.getTransperancy()+" ]";
    }
}
