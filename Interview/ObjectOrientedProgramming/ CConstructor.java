public class CConstructor {
    public static int countt;
    public static void main(Strign args[]) {
        countt =0;
        System.out.println(countt);
        Person p = new Person();
        System.out.println(countt);

    }

}

class Person {
    int a,b;

    public void Person() {
        countt++;

    }
}
