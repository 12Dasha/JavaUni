package Lab7c;

public class Runner {
    public static void main(String[] args) {
        FilesByMask file = new FilesByMask("E:\\Даша", ".*p?");
        String[] files = file.getFilesByMask();
        file.printArrayFiles(files);
    }
}
