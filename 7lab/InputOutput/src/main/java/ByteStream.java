import java.io.*;

public class ByteStream {
    public void WriteArrayInStream(OutputStream out, int[] arr) {
        try (DataOutputStream arrWrite = new DataOutputStream(out)) {
            for (int temp : arr) {
                arrWrite.writeInt(temp);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int[] ReadArrayFromStream(InputStream in) {
        try (DataInputStream arrRead = new DataInputStream(in)) {
            int[] arr = new int[in.available() / 4];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = arrRead.readInt();
            }
            return arr;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}

