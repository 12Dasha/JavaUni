package Lab5a;

import java.util.Random;

public class Creation {
    public static Catalog.Book createBook(){
        Random random = new Random();
        return new Catalog.Book(
                Books.values()[(new Random().nextInt(Books.values().length))],
                random.nextDouble() * 1000
        );
    }
}
