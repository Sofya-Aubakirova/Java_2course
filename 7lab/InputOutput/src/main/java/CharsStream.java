import java.io.*;

public class CharsStream {
    public void WriteArrayInStream(Writer out, int[] arr) {
        try (BufferedWriter arrWrite = new BufferedWriter(out)) {
            for (int temp : arr) {
                arrWrite.write(String.valueOf(temp));
                arrWrite.write(' ');
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int[] ReadArrayFromStream(Reader in) {
        try (BufferedReader arrRead = new BufferedReader(in)) {
            String[] numbers = arrRead.readLine().split(" ");
            int[] res = new int[numbers.length];
            for (int i = 0; i < res.length; i++) {
                res[i] = Integer.parseInt(numbers[i]);
            }
            return res;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}

