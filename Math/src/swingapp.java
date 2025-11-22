import java.io.*;
import javax.swing.*;
import java.util.*;



public class swingapp{
    public static void main(String[] arg){
        new swingapp();
    }

    public swingapp(){
		JFrame frame = new JFrame("FF");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JTextField stuffin= new JTextField(20);
		JLabel stuffout=new JLabel("here is output");
		JButton submit = new JButton("Submit");
		JButton confirm= new JButton("configuration");
		JTextField choice= new JTextField(10);
		JPanel panel = new JPanel();
		
		JButton button = new JButton("Click me!");
		panel.add(button);
		
		JLabel label = new JLabel("Clicks: 0");
		panel.add(label);
		takein options=new takein(choice,confirm);
		takein listener = new takein(stuffin,stuffout,submit);
		int c=1;
		String hold=options.get_input();

		panel.add(stuffin);
		panel.add(stuffout);
		panel.add(submit);
		panel.add(choice);
		panel.add(confirm);
		frame.add(panel);
		
		frame.setSize(600, 600);	
		frame.setVisible(true); 
    }
	
}

