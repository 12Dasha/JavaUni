package Anonym;

public class WrapperString {
    private String str;
    public WrapperString(String str){
        this.str = str;
    }
    public String getStr(){
        return str;
    }
    public String replace(char oldchar, char newchar){
        char[] array = new char[str.length()];
        str.getChars(0, str.length(), array, 0);
        for(int i =0; i< str.length(); i++){
            if(array[i]==oldchar){
                array[i] = newchar;
                break;
            }
        }
        return new String(array);
    }
}
