import java.io.FileWriter;
import java.io.IOException;

public class FileWriterAndFileReader {
    public static void main(String[] args) throws IOException {

        FileWriter fileWriter = new FileWriter("Test1.txt");
        fileWriter.write("What is up");
        fileWriter.close();
    }
}
