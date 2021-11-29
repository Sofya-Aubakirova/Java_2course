import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessStream {
    public String readCharsFromFile(File fileName, int seek) {
        try (RandomAccessFile raf = new RandomAccessFile(fileName, "r")) {
            raf.seek(seek);
            return raf.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
