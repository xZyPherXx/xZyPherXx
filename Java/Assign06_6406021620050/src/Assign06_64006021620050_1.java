/* Name : Punnawat Pinsaeng
 * ID : 64-060216-2005-0
 * Room : 1-RA
 * File : Assign06_6406021620050_1.java
*/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class Assign06_64006021620050_1 {

    public static void main(String[] args) {

        new FindMinMax(400 , 300);
    }

}

class FindMinMax implements ActionListener {

    JFrame window = new JFrame("Min Max Program");
    JLabel text1 , text2 , text3 , resultMinText , resultMaxText; 
    JTextField numJF1 , numJF2 , numJF3 , resultMin , resultMax;
    JButton button;
    JPanel inputPanel , resultPanel;
    Font font = new Font("Arial" , Font.BOLD , 16);
    Container container = window.getContentPane();
    boolean checkDatas[] = {false , false , false} , checkInput = false;

    public void actionPerformed(ActionEvent event) {

        if (checkData()) {

            if (((checkDatas[0] == true) && (checkDatas[1] == true) && (checkDatas[2] == true))) {

                int num1 , num2 , num3 , minResult , maxResult;

                num1 = Integer.parseInt(numJF1.getText());
                num2 = Integer.parseInt(numJF2.getText());
                num3 = Integer.parseInt(numJF3.getText());

                minResult = findMin(num1 , num2 , num3);
                maxResult = findMax(num1, num2, num3);

                resultMin.setText(Integer.toString(minResult));
                resultMax.setText(Integer.toString(maxResult));
            }
            else {

                showMessage(2);
            }

        }

    }

    public FindMinMax(int width , int height) {

        container.setLayout(new FlowLayout(FlowLayout.CENTER , 10 , 10));

        createInputPanel();

        button = new JButton("Find Min Max");
        button.setFont(font);
        button.addActionListener(this);
        container.add(button);

        createResultPanel();

        window.setSize(width , height);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }

    public void createInputPanel() {

        inputPanel = new JPanel();
        inputPanel.setPreferredSize(new Dimension(360 , 110));
        inputPanel.setLayout(new FlowLayout(FlowLayout.CENTER , 10 , 10));
        inputPanel.setBorder(new LineBorder(Color.RED , 1));

        text1 = new JLabel("Enter number 1 : ");
        text1.setFont(font);
        inputPanel.add(text1);

        numJF1 = new JTextField(10);
        numJF1.setFont(font);
        inputPanel.add(numJF1);

        text2 = new JLabel("Enter number 2 : ");
        text2.setFont(font);
        inputPanel.add(text2);

        numJF2 = new JTextField(10);
        numJF2.setFont(font);
        inputPanel.add(numJF2);

        text3 = new JLabel("Enter number 3 : ");
        text3.setFont(font);
        inputPanel.add(text3);

        numJF3 = new JTextField(10);
        numJF3.setFont(font);
        inputPanel.add(numJF3);

        container.add(inputPanel);
    }

    public boolean checkData() {

        if (!numJF1.getText().isEmpty() && !numJF2.getText().isEmpty() && !numJF3.getText().isEmpty()) {

            for (int index = 0 ; index < numJF1.getText().length() ; index++) {

                if (Character.isDigit(numJF1.getText().charAt(index))) {

                    checkDatas[0] = true;
                }
                else {

                    checkDatas[0] = false;
                    break;
                }

            }

            for (int index = 0 ; index < numJF2.getText().length() ; index++) {

                if (Character.isDigit(numJF2.getText().charAt(index))) {

                    checkDatas[1] = true;
                }
                else {

                    checkDatas[1] = false;
                    break;
                }

            }

            for (int index = 0 ; index < numJF3.getText().length() ; index++) {

                if (Character.isDigit(numJF3.getText().charAt(index))) {

                    checkDatas[2] = true;
                }
                else {

                    checkDatas[2] = false;
                    break;
                }

            }

        }
        else {

            showMessage(1);
            return false;
        }

        return true;
    }

    public void createResultPanel() {

        resultPanel = new JPanel();
        resultPanel.setPreferredSize(new Dimension(360 , 80));
        resultPanel.setLayout(new FlowLayout(FlowLayout.CENTER , 10 , 10));
        resultPanel.setBorder(new LineBorder(Color.BLUE , 1));

        resultMinText = new JLabel("Minimum Result : ");
        resultMinText.setFont(font);
        resultPanel.add(resultMinText);
        resultMin = new JTextField(10);
        resultMin.setFont(font);
        resultMin.setEditable(false);
        resultPanel.add(resultMin);

        resultMaxText = new JLabel("Maximum Result : ");
        resultMaxText.setFont(font);
        resultPanel.add(resultMaxText);
        resultMax = new JTextField(10);
        resultMax.setFont(font);
        resultMax.setEditable(false);
        resultPanel.add(resultMax);

        container.add(resultPanel);
    }

    public int findMin(int num1 , int num2 , int num3) {

        return Math.min(Math.min(num1 , num2) , num3);
    }

    public int findMax(int num1 , int num2 , int num3) {

        return Math.max(Math.max(num1 , num2) , num3);
    }

    public void showMessage(int choice) {

        switch (choice) {
 
            case 1 : JOptionPane.showMessageDialog(window , "Please Input Data.", "Wrong Input!", JOptionPane.WARNING_MESSAGE); break;
            case 2 : JOptionPane.showMessageDialog(window , "Your input have Wrong Data Type." , "Wrong Data Type Input" , JOptionPane.WARNING_MESSAGE); break;
        }

    }

}