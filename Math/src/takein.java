import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


import javax.swing.*;

public class takein implements ActionListener{
    private int c=0;
    private JLabel f;
    private String intomath= "";
    private Mathematics options;
    //JTextField input=new JTextField();
    //JLabel output=new JLabel("output here");
        // Add an ActionListener to the field to capture input when the user presses ENTER
    public takein(JTextField input, JLabel output){
        input.addActionListener(e->{
            String userinput=input.getText();
            output.setText("you puttt"+userinput);
        });
        JButton submit = new JButton("Submit");
        submit.addActionListener(e->{
            String userinput=input.getText();
            output.setText("user input"+userinput);
        });   
    }
    public takein(JTextField input, JLabel output, JButton submit){
        submit.addActionListener(e->{
            String userinput=input.getText();
            output.setText("user input"+userinput);
        });   
    }

    public takein(JTextField input, JButton submit){
        submit.addActionListener(e->{
            intomath=input.getText();
            
        });
    }

    public String get_input(){
        return intomath;

    }
    
    public void action(ActionEvent e){
        c++;
        f.setText("Clicks:" + c);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

    
}
