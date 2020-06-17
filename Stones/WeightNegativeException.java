package Stones;

public class WeightNegativeException extends Exception {
    public WeightNegativeException(){}
    public WeightNegativeException(String message){
        super(message);
    }
    public WeightNegativeException(String message, Throwable e){
        super(message,e);
    }
}
