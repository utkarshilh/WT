import java.awt.*;

class Example1 extends Frame {
    public static void main(String args[]) {
        // we will not write whole code in main only because after execution vo
        // terminate ho jaayega

        new Example1();
    }

    public Example1() {
        // setSize me pehla y asix and doosra x axis
        setSize(500, 500);

        // by default ye hiden hota hai to make them visible
        // jav tak hav visibility true nahi hoga tab tak ye false
        setVisible(true);

    }
}

// instead of extends we can use the frame object shown below
class Example1 {
    public static void main(String args[]) {
        // we will not write whole code in main only because after execution vo
        // terminate ho jaayega

        new Example1();
    }

    public Example1() {
        // setSize me pehla y asix and doosra x axis
        setSize(500, 500);

        // by default ye hiden hota hai to make them visible
        // jav tak hav visibility true nahi hoga tab tak ye false
        setVisible(true);

    }
}