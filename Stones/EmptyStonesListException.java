package Stones;

public class EmptyStonesListException extends Exception {
    public EmptyStonesListException(){}
    public EmptyStonesListException(String message){
        super(message);
    }
    public EmptyStonesListException(String message, Throwable e){
        super(message,e);
    }
}
