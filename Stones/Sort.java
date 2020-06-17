package Stones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sort {
    public static void CompareByValue(List<Stone> stones){
        Collections.sort(stones, new Comparator<Stone>() {
            public int compare(Stone o1, Stone o2) {
                return Double.compare(o1.getPrice(), o2.getPrice());
            }
        });
    }
   public static List<Stone> CompareByTransparency(String transperancy, List<Stone> stones) throws CheckTransparencyException{
        if(transperancy.isEmpty()) throw new CheckTransparencyException("Transparency can't be empty");
        List<Stone> foundStones = new ArrayList();
        for (Stone stone : stones){
            if ((Transperancy.valueOf(transperancy)).equals(stone.getTransperancy())){
                foundStones.add(stone);
            }
        }
        return foundStones;
    }
}
