import org.junit.jupiter.api.Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class RandomAccessStreamTest {

    @Test
    void readCharsFromFile() throws IOException {
        File f1 = new File("data.txt");
        BufferedWriter writer = new BufferedWriter(new FileWriter(f1));
        writer.write("check arr: 8 22 44 552");
        writer.close();
        int position = 11;
        String res = "8 22 44 552";
        RandomAccessStream stream = new RandomAccessStream();
        assertEquals(res, stream.readCharsFromFile(f1, position));
    }
}