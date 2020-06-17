package Lab7c;

import java.io.File;
import java.io.FilenameFilter;
import java.util.stream.Stream;

public class FilesByMask {
    private final String directory;
    private final String mask;

    public FilesByMask(String directory, String mask) {
        this.directory = directory;
        this.mask = mask;
    }

    public String[] getFilesByMask() {
        String[] result = null;
        if (directory != null) {
            final File dir = new File(directory);
            if (dir.isDirectory()) {
                FilenameFilter file = (File f, String name) -> name.matches(mask);
                result = dir.list(file);
            }
        }
        return result;
    }

    public void printArrayFiles(String[] files) {
        System.out.println("Files: ");
        Stream.of(files).forEach(System.out::println);
    }
}
