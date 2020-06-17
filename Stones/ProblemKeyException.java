package Stones;

public class ProblemKeyException extends Exception {
    public ProblemKeyException(){}
    public ProblemKeyException(String message){
        super(message);
    }
    public ProblemKeyException(String message, Throwable e){
        super(message,e);
    }
}
