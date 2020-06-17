package Stones;

public class PriceNegativeException extends Exception {
    public PriceNegativeException(){}
    public PriceNegativeException(String message){
        super(message);
    }
    public PriceNegativeException(String message, Throwable e){
        super(message, e);
    }
}
