import java.awt.*;
import java.awt.event.*;

class ButtonClick2 implements ActionListener{
    Frame f;
    Button b1,b2,b3,b4;
    public static void main(String args[])
    {
        new ButtonClick2();

    }
    ButtonClick2(){
        f = new Frame("Button Click Example");
        b1 = new Button("Red");
        b2 = new Button("Green");
        b3 = new Button("Blue");
        b4 = new Button("Black");


        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.setSize(500,500);
        f.setLayout(new FlowLayout());

        f.setVisible(true);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);



    }

    public void actionPerformed(ActionEvent e){

        if(e.getActionCommand()=="Red")
        {
            f.setBackground(Color.red);

        }

        if(e.getActionCommand()=="Green")
        {
            f.setBackground(Color.green);
            
        }
        if(e.getActionCommand()=="Blue")
        {
            f.setBackground(Color.blue);
            
        }
        if(e.getActionCommand()=="Black")
        {
            f.setBackground(Color.black);

        }

    }
}