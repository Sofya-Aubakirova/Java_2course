import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileStream {
    public static List<File> FilesCatalog(String expansion, File directory) throws IOException {

        List<File> res = new ArrayList<>();
        File[] listFiles = directory.listFiles(File::isFile);

        if (listFiles == null)
            throw new IOException("Empty catalog");
        for (File temp : listFiles)
            if (temp.getName().endsWith(expansion))
                res.add(temp);
        return res;
    }
}
