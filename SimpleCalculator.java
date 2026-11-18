import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator extends JFrame implements ActionListener {
    private JLabel label1,label2,label3,label4;
    private JTextField textNum1,textNum2,textResult;
    private JButton addButton,subButton,mulButton,divButton;

    public SimpleCalculator(){
        label1 = new JLabel("Simple Calculator");
        label2 = new JLabel("Enter first number:");
        label3 = new JLabel("Enter second number:");
        label4 = new JLabel("Result:");

        textNum1 = new JTextField(10);
        textNum2 = new JTextField(10);
        textResult = new JTextField(10);
        textResult.setEditable(false);

        addButton = new JButton("+");
        addButton.addActionListener(this);
        subButton = new JButton("-");
        subButton.addActionListener(this);
        mulButton = new JButton("*");
        mulButton.addActionListener(this);
        divButton = new JButton("/");
        divButton.addActionListener(this);

        setLayout(new GridLayout(5,2,5,5));
        add(label1);
        add(new JLabel(""));
        add(label2);
        add(textNum1);
        add(label3);
        add(textNum2);
        add(label4);
        add(textResult);
        add(new JLabel(""));
        JPanel panel = new JPanel();
        panel.add(addButton);
        panel.add(subButton);
        panel.add(mulButton);
        panel.add(divButton);
        add(panel);
    }

    public void actionPerformed(ActionEvent e){
        try{
            double num1 = Double.parseDouble(textNum1.getText());
            double num2 = Double.parseDouble(textNum2.getText());
            double result = 0;

            if(e.getSource() == addButton){
                result = num1 + num2;
            } else if(e.getSource() == subButton){
                result = num1 - num2;
            } else if(e.getSource() == mulButton){
                result = num1 * num2;
            } else if(e.getSource() == divButton){
                result = num1 / num2;
            }

            textResult.setText(String.valueOf(result));
        } catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(this,"Please enter valid numbers!");
        }
    }

    public static void main(String[] args){
        SimpleCalculator frame = new SimpleCalculator();
        frame.setTitle("Simple Calculator");
        frame.setSize(380,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
