public class Frequency {
    public int frequencyCount(String string, String word){
        int count = 0;
        String[] parts = string.split("\\s");
        for (String part:parts){
            if(part.equals(word)) count++;
        }
        return count;
    }
}
