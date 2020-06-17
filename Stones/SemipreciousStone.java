package Stones;

public class SemipreciousStone extends Stone {
    private SemipreciousType type;
    public SemipreciousStone(){super();}
    public SemipreciousStone(double weight, double price, SemipreciousType type, Transperancy transperancy){
        super(weight, price, transperancy);
        this.type = type;
    }
    public SemipreciousType getType(){return type;}
    public void setType(SemipreciousType type){this.type = type;}
    @Override
    public String toString(){
        return "\nSemiprecious Stone: " + "\n[ name of the stone: " + this.getType() + "\nweight = " + this.getWeight() + "\nprice = " + this.getPrice() +"\ntransparency: "+this.getTransperancy()+ " ]";
    }
}
