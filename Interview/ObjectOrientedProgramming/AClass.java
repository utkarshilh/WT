public class AClass {
    public static void main(String[] args) {
        person p = new person();
        p.name = "utkarsh";
        p.age = 55;
        p.name();
    }

}

class person {
    String name;
    int age;

    void name() {
        System.out.println("name is " + name);

    }

}