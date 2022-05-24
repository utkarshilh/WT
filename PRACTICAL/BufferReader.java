import java.io.*;

public class BufferReader {

    // public static void main(String args[]) {
    // BufferReader in = new BufferReader(new InputStreamReader(System.in));

    // String S = in.nextLine();
    // System.out.println(S);

    // }

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // int n = parseInt(br.readLine());
        String n = br.readLine();
        System.out.println(n);

    }

}
