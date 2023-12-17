/* Name : Punnawat Pinsaeng
 * ID : 64-060216-2005-0
 * Room : 1-RA
 * File : Assign06_6406021620050_2.java
*/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class Assign06_64006021620050_2 {

    public static void main(String[] args) {
        
        new MyCalculator(300 , 300);
    }

}

class MyCalculator implements ActionListener {

    JFrame window;
    JLabel numberLabel;
    JTextField numberField;
    JButton button[];
    JPanel inputPanel , actionPanel;
    Font font = new Font("Arial" , Font.BOLD , 18);
    boolean checkDot = false;

    public MyCalculator(int width , int height) {

        window = new JFrame("My Calculator");
        Container container = window.getContentPane();
        container.setLayout(new FlowLayout());

        inputPanel = new JPanel();
        inputPanel.setPreferredSize(new Dimension(270 , 40));
        inputPanel.setLayout(new FlowLayout());
        inputPanel.setBorder(new LineBorder(Color.DARK_GRAY , 1));

        numberField = new JTextField(15);
        numberField.setEditable(false);
        numberField.setFont(font);
        numberField.setHorizontalAlignment(JTextField.RIGHT);

        inputPanel.add(numberField);

        actionPanel = new JPanel();
        actionPanel.setPreferredSize(new Dimension(240 , 200));
        actionPanel.setLayout(new GridLayout(4 , 3));
        actionPanel.setBorder(new LineBorder(Color.LIGHT_GRAY , 1));

        String data[] = {"1" , "2" , "3" , "4" , "5" , "6" , "7" , "8" , "9" , "0" , "." , "C"};
        button = new JButton[data.length];

        for (int index = 0 ; index < data.length ; index++) {

            button[index] = new JButton(data[index]);
            button[index].setFont(font);
            button[index].addActionListener(this);

            actionPanel.add(button[index]);
        }

        container.add(inputPanel);
        container.add(actionPanel);

        window.setSize(width, height);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }

    public void actionPerformed(ActionEvent Event) {

        String data = numberField.getText();

        if (Event.getSource() == button[0]) {

            data += "1";
            numberField.setText(data);
        }
        else if (Event.getSource() == button[1]) {

            data += "2";
            numberField.setText(data);
        }
        else if (Event.getSource() == button[2]) {

            data += "3";
            numberField.setText(data);
        }
        else if (Event.getSource() == button[3]) {

            data += "4";
            numberField.setText(data);
        }
        else if (Event.getSource() == button[4]) {

            data += "5";
            numberField.setText(data);
        }
        else if (Event.getSource() == button[5]) {

            data += "6";
            numberField.setText(data);
        }
        else if (Event.getSource() == button[6]) {

            data += "7";
            numberField.setText(data);
        }
        else if (Event.getSource() == button[7]) {

            data += "8";
            numberField.setText(data);
        }
        else if (Event.getSource() == button[8]) {

            data += "9";
            numberField.setText(data);
        }
        else if (Event.getSource() == button[9]) {

            data += "0";
            numberField.setText(data);
        }
        else if (Event.getSource() == button[10] && !checkDot) {

            data += ".";
            checkDot = true;
            numberField.setText(data);
        }
        else if (Event.getSource() == button[11]) {

            data = "";
            checkDot = false;
            numberField.setText(data);
        }

    }

}