import java.io.*;

public class BufferReader {
    public static void main(String args[]) {

        BufferReader br = new BufferReader(new InputStreamReader(System.in));

        // int n = parseInt(br.readLine());
        String n = br.nextLine();
        System.out.println(n);

    }
}