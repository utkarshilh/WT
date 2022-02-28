class Command_Line {
  public static void main(String args[]) {
    int i = Integer.parseInt(args[0]);

    System.out.println("integer is " + i);

    float f = Float.parseFloat(args[1]);
    System.out.println("float is " + f);

    String s = args[2];
    System.out.println("String  is " + s);

    char c = args[3].charAt(0);
    System.out.println("char : " + c);
  }
}
