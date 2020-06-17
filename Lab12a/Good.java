package Lab12a;

public class Good {
    private int code;
    private String name;
    private String description;
    private int price;

    public Good(int code, String name, String description, int price) {
        this.code = code;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public int getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public int getPrice() {
        return this.price;
    }
}
