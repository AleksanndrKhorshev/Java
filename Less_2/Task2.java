package Less_2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Task2 {
    public static void main(String[] args) throws IOException {
        Path file = Path.of("Less_2/file.txt");
        boolean exists = Files.exists(file);
        if (exists) {      
        }
        else {
            Files.createFile(file);
        }
        String test = "TEST\n ";
        String data = "";
        for (int i=0; i<100; i++) {
            data += test;
        }
        Files.writeString(file, data);
    }
}
