import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FileStreamTest {

    @Test
    void filesCatalog() throws IOException {
        // Создание File для каталога
        File dir = new File("files");
        // Создание File для файлов, которые находятся в каталоге
        File file1 = new File(dir, "data.txt");
        file1.createNewFile();
        File file2 = new File(dir, "test1.txt");
        file2.createNewFile();
        List<File> fileRes = FileStream.FilesCatalog("txt", dir);

        List<String> res = new ArrayList<>();
        for(File temp: fileRes){
            res.add(temp.getName());
        }

        List<String> actRes = new ArrayList<>();
        actRes.add("data.txt");
        actRes.add("test1.txt");

        assertIterableEquals(actRes, res);
    }
}