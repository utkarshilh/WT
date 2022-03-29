class a {
    void displayA() {
        System.out.println("i am display a from a class");

    }

    void displayB() {
        System.out.println("I am displayb form a class");
    }

}

class b extends a {
    void displayB() {
        System.out.println("i am displayb from b class ");
    }
}

public class methodoverriding {

    public static void main(String args[]) {
        a obj1 = new a();
        b obj2 = new b();

        obj1.displayA();
        obj1.displayB();

        obj2.displayA();
        obj2.displayB();

    }

}
