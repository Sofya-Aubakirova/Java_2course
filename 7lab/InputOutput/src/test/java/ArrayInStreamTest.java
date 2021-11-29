import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;


public class ArrayInStreamTest {

    @Test
    public void writeAndReadArrayInStream() {
        try (OutputStream out = new FileOutputStream("data.txt");
             InputStream in = new FileInputStream("data.txt")) {
            ByteStream arrayInStream = new ByteStream();
            int[] arr = {1, 2, 3, 4};
            arrayInStream.WriteArrayInStream(out, arr);
            assertArrayEquals(arr, arrayInStream.ReadArrayFromStream(in));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}