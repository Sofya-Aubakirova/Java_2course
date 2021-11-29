import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

public class CharsStreamTest {
    @Test
    public void writeAndReadCharsStream() {
        try (Writer writer = new FileWriter("data.txt");
             Reader reader = new FileReader("data.txt")) {
            CharsStream stream = new CharsStream();
            int[] arr = {1, 2, 3};
            stream.WriteArrayInStream(writer, arr);
            assertArrayEquals(arr, stream.ReadArrayFromStream(reader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}