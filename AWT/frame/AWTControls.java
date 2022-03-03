import java.awt.*;

public class AWTControls{
    Frame f; // here f is diclared here only so that we can use it as golobally anywhere
    Button b1;
    Label lab;
    TextArea ta;
    TextField tf;
    Font fo;

    public static void main(String args[])
    {
        new AWTControls();

    }
    public AWTControls(){
        f = new Frame("My Title"); // my title is the initial title 
        

        //Awt Button 
        // b1 = new Button("click me");
        // b1.setLabel("new button"); // this is used to recaption the buttton
        // b1.setBounds(100,100,100,100);
        // f.add(b1);


    //    awt Label

    //    lab = new Label("my label");
    //    lab.setBounds(100,100,100,100);
    //    f.add(lab);

// =============================================================================


    // awt TextArea

    // ta = new TextArea();//if we want ki pehle se isme kuch likha ho to method ke andar double courst me valeu pass kar de

    // ta.setBounds(100,100,100,100);
    // f.add(ta);

// ======================================================================

   //AWT tExtField
   tf = new TextField();
   tf.setBounds(100,100,100,100);
   f.add(tf);


//==============================================================================

      // font 
      fo = new Font("Times new Roman,Arial",0,25);
      tf.setFont(fo);

        f.setLayout(null); // set nahi karenge to default size print hoga


        f.setSize(500,500);
        f.setVisible(true);


        // this will be use to set the size title of the new window
        f.setTitle("this is new title");




        


    }
}


