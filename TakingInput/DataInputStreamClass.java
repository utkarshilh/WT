/// Taking Input as DataInputStream Class
// In this type if input method we use library
/// isme command line pe input nahi dete h ..

// import java.io.*; // for all input type

import java.io.DataInputStream;

public class DataInputStreamClass {
	public static void main(String args[]) throws Exception {
		DataInputStream in = new DataInputStream(System.in);
		int a;
		a = Integer.parseInt(in.readLine());
		System.out.println("value of a is" + a);

		String s = in.readLine();
		System.out.println(s);
	}

}