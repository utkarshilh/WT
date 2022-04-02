// import java.awt.*;


// // interview question jab * laga diya tab niche wala likhne ki kya jaroorat hai??

// // answer - they are two different packages

// import java.awt.event.*;


// class ButtoClick{

//     Frame f;
//     Button b;
//     TextField tf;

//     public static void main(String[] args){
//         new ButtoClick();
//     }
//     ButtonClick1(){
//             f = new Frame("Button Click Example");
//             b = new Button("Click me");
//             tf = new TextField();
//             b.setBounds(50,150,100,50);  // x-axis,y-axis
//             tf.setBounds(50,50,400,50);
//             f.add(b);
//             f.add(tf);
//             f.setSize(500,500);// width height 
//             f.setLayout(null);
//             setVisible(true);


//         }
// }

import java.awt.*;
import java.awt.event.*;


class ButtonClick implements ActionListener{
	Frame f;
	Button b;
	TextField tf;
	public static void main(String args[]){
		new ButtonClick();
	}
	ButtonClick()
	{
		f=new Frame("button click");
		b=new Button("click me");
		tf=new TextField();
		b.setBounds(50,150,100,50);
		tf.setBounds(50,50,400,50);
		f.add(b);
		f.add(tf);
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
        b.addActionListener(this);
	}

    public void actionPerformed(ActionEvent e)
    {
       tf.setText("Welcome to Web Technology");
       
    }

}
