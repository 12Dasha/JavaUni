package Stones;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Necklace {
    private List<Stone> stonesList = new ArrayList<Stone>();
    public Necklace() {
    }
    public List<Stone> getStonesList() {
        return stonesList;
    }
    public void setStonesList(List<Stone> stonesList) throws EmptyStonesListException {
        if(stonesList.isEmpty()) throw new EmptyStonesListException("You can't set an empty List ");
        this.stonesList = stonesList;
    }
    @Override
    public String toString() {
        return "\nNecklace{" +
                ", stonesList = " + stonesList +
                '}';
    }
}
