package Stones;

import java.util.ArrayList;
import java.util.List;

public class Creation {
    public Necklace createNecklace(Necklace necklace, int numbers){
        List<Stone> stones = new ArrayList<Stone>();
        for (int i = 0; i<numbers; i++){
            stones.add(CreateStone.createStone());
        }
        try {
            necklace.setStonesList(stones);
        }catch (NegativeArraySizeException | EmptyStonesListException e){
            try {
                throw new EmptyStonesListException("List can't be empty ",e);
            } catch (EmptyStonesListException ex) {
                ex.printStackTrace();
            }
        }
        return necklace;
    }
    public static Necklace create(Necklace necklace, List<Stone> stones) throws EmptyStonesListException {
        necklace.setStonesList(stones);
        return necklace;
    }
    public double totalWeight(List<Stone> stones){
        double total = 0.0;
        for(Stone stone:stones){
            total+=stone.getWeight();
        }
        return total;
    }
    public double totalPrice(List<Stone> stones){
        double total = 0.0;
        for(Stone stone:stones){
            total+=stone.getPrice();
        }
        return total;
    }
}
