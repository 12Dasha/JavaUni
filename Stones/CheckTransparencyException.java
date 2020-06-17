package Stones;

public class CheckTransparencyException extends Exception {
    CheckTransparencyException(){}
    CheckTransparencyException(String message){
        super(message);
    }
    CheckTransparencyException(String message, Throwable e){
        super(message,e);
    }

}
