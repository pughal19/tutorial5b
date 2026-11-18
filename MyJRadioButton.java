import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;

class MyJRadioButton extends JFrame implements ItemListener{
    JRadioButton my_button1 = new JRadioButton("Red");
    JRadioButton my_button2 = new JRadioButton("Green");
    JRadioButton my_button3 = new JRadioButton("Blue");
    JRadioButton my_button4 = new JRadioButton("Yellow");

    JLabel selection = new JLabel();

    public MyJRadioButton(){
        Container pane = getContentPane();
        pane.setLayout(new BorderLayout());
        JPanel pane1 = new JPanel();
        JPanel pane2 = new JPanel();
        JPanel pane3 = new JPanel();

        pane1.add(new JLabel("Select your MOST favorite color:"));
        pane2.add(my_button1);
        pane2.add(my_button2);
        pane2.add(my_button3);
        pane2.add(my_button4);

        ButtonGroup btn_group = new ButtonGroup();
        btn_group.add(my_button1);
        btn_group.add(my_button2);
        btn_group.add(my_button3);
        btn_group.add(my_button4);

        my_button1.addItemListener(this);
        my_button2.addItemListener(this);
        my_button3.addItemListener(this);
        my_button4.addItemListener(this);

        pane3.add(new JLabel("you have selected:"));
        pane3.add(selection);

        pane.add(pane1,BorderLayout.NORTH);
        pane.add(pane2,BorderLayout.CENTER);
        pane.add(pane3,BorderLayout.SOUTH);
    }

    public void itemStateChanged(ItemEvent e){
        String input = "";

        if(my_button1.isSelected()){
            input = my_button1.getText();
        }
        if(my_button2.isSelected()){
            input = my_button2.getText();
        }
        if(my_button3.isSelected()){
            input = my_button3.getText();
        }
        if(my_button4.isSelected()){
            input = my_button4.getText();
        }
        selection.setText(input);
    }

    public static void main(String[] args){
        MyJRadioButton frame = new MyJRadioButton();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("My Frame");
        frame.setSize(350,200);
        frame.setVisible(true);
    }
}
