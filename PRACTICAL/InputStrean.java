import java.io.*;

public class InputStrean {

    public static void main(String args[]) throws Exception {
        DataInputStream in = new DataInputStream(System.in);
        String s = in.readLine();
        System.out.println(s);

    }

}
