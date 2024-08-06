import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterAndFileReader {
    public static void main(String[] args) throws IOException {

        FileWriter fileWriter = new FileWriter("fileWriteTest.txt");
        fileWriter.write("What is up \n");
        fileWriter.write("This is too much");

        fileWriter.close();

        FileReader fileReader = new FileReader("fileWriteTest.txt");
        Scanner scan = new Scanner(fileReader);
        while (scan.hasNext()) {
            System.out.println(scan.nextLine());
        }

    }
}
