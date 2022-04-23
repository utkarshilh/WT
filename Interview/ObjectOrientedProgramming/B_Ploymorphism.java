public class B_Ploymorphism {

    public static void main(String args[]) {
        Student s = new Student();
        s.sum();
        int temp = s.sum(5, 6);

        System.out.println(temp);
        temp = s.sum(6, 7, 8);
        System.out.println(temp);

    }

}

class Student {
    void sum() {
        System.out.println("no subject choosen");

    }

    int sum(int a, int b) {
        System.out.println("two subject choosen");
        return a + b;
    }

    int sum(int a, int b, int c) {
        System.out.println("three subject choosen");
        return a + b + c;
    }

}
