package Anonym;

public class Runner {
    public static void main(String[] args) {
        String ob = "usbdfkYFU";
        WrapperString wrFirst = new WrapperString(ob);
        WrapperString wrLast = new WrapperString(ob){
            @Override
            public String replace(char oldchar, char newchar){
                char[] array = new char[getStr().length()];
                getStr().getChars(0, getStr().length(), array, 0);
                for(int i =array.length-1; i> 0; i--){
                    if(array[i]==oldchar){
                        array[i] = newchar;
                        break;
                    }
                }
                return new String(array);
            }
        };
        System.out.println(wrLast.replace('Y','F'));
        System.out.println(wrFirst.replace('u','M'));
    }
}
