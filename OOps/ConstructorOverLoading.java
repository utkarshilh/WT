public class ConstructorOverLoading {

    public static void main(String[] args) {
        Happy a = new Happy();
        Happy b = new Happy("utkarsh");
        Happy c = new Happy(77, "aman");

        // System.out.println(a.name);
        System.out.println(b.name);
        System.out.println(c.name);
        System.out.println(c.marks);

    }

}

class Happy {

    int marks;
    String name;

    Happy() {
        System.out.println("nothing to display");

    }

    Happy(int temp, String nname) {
        this.name = nname;
        this.marks = temp;

    }

    Happy(String s) {
        this.name = s;

    }

}
