/* Name : Punnawat Pinsaeng
 * Id : 64-060216-2005-0
 * Room : 1-RA
 * File name : Assign07_6406021620050_2.java
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Assign07_6406021620050_2 implements ActionListener {

    JFrame window;
    Container container;
    JPanel panels[] = new JPanel[3];
    JLabel dataLabels[] , resultLabels[];
    JTextField dataFields[] , resultsFields[];
    JButton button;
    Font font = new Font("Consolas" , Font.BOLD , 16);

    public static void main(String[] args) {
        
        new Assign07_6406021620050_2(550 , 240);
    }

    public Assign07_6406021620050_2(int windowWidth , int windowHeight) {

        window = new JFrame("Program Loan Car");
        container = window.getContentPane();
        container.setLayout(new FlowLayout());

        createDataForm();
        createButton();
        createResult();

        window.setSize(windowWidth , windowHeight);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void createDataForm() {

        panels[0] = new JPanel();
        panels[0].setPreferredSize(new Dimension(500 , 130));
        panels[0].setLayout(new FlowLayout());
 
        String showLabels[] = {"Enter Your Car Price :                    " , "Enter Your Down Payment (%) :             " , "Enter Your Installment (48, 60, 72, 84) : " , "Enter Your Interest Rate (%) :            "};
        dataLabels = new JLabel[showLabels.length];
        dataFields = new JTextField[showLabels.length];

        for (int index = 0 ; index < showLabels.length ; index++) {

            dataLabels[index]= new JLabel(showLabels[index]);
            dataLabels[index].setFont(font);
            panels[0].add(dataLabels[index]);
            dataFields[index] = new JTextField(10);
            dataFields[index].setFont(font);
            panels[0].add(dataFields[index]);
        }

        container.add(panels[0]);
    }

    private void createButton() {

        panels[1] = new JPanel();
        panels[1].setPreferredSize(new Dimension(400 , 60));
        panels[1].setLayout(new FlowLayout());

        button = new JButton("Loan Car");
        button.setFont(font);
        button.addActionListener(this);
        panels[1].add(button);

        container.add(panels[1]);
    }

    private void createResult() {

        panels[2] = new JPanel();
        panels[2].setPreferredSize(new Dimension(400 , 200));
        panels[2].setLayout(new FlowLayout());

        String showLabels[] = {"Your Down Payment :    " , "Your Financation :     " , "Your Interest Rate :   " , "Your Interest Amount : " , "Your Net :             " , "Your Installment :     "};
        resultLabels = new JLabel[showLabels.length];
        resultsFields = new JTextField[showLabels.length];

        for (int index = 0 ; index < showLabels.length ; index++) {

            resultLabels[index] = new JLabel(showLabels[index]);
            resultLabels[index].setFont(font);
            panels[2].add(resultLabels[index]);

            resultsFields[index] = new JTextField(12);
            resultsFields[index].setFont(font);
            resultsFields[index].setEnabled(false);
            panels[2].add(resultsFields[index]);
        }

    }

    private boolean checkDataDigit() {

        boolean checkDigits[] = {true , true , true , true};

        for (int data = 0 ; data < dataFields.length ; data++) {

            for (int index = 0 ; index < dataFields[data].getText().length(); index++) {

                if (!Character.isDigit(dataFields[data].getText().charAt(index))) {

                    checkDigits[data] = false;
                }
                if (dataFields[3].getText().contains(".")) {

                    checkDigits[3] = true;
                }

            }

        }

        if (checkDigits[0] == true && checkDigits [1] == true && checkDigits[2] == true && checkDigits[3] == true) {

            return true;
        }

        return false;
    }

    private void loanResult() {

        if (checkDataDigit()) {

            LoanCar loanCar = new LoanCar(Float.parseFloat(dataFields[0].getText()) , Float.parseFloat(dataFields[1].getText()) , Float.parseFloat(dataFields[2].getText()) , Float.parseFloat(dataFields[3].getText()));

            resultsFields[0].setText(String.format("%,.2f", loanCar.findDownPayment()));
            resultsFields[1].setText(String.format("%,.2f", loanCar.findFinance()));
            resultsFields[2].setText(String.format("%,.2f", loanCar.findInterestRate()));
            resultsFields[3].setText(String.format("%,.2f", loanCar.findInterestAmount()));
            resultsFields[4].setText(String.format("%,.2f", loanCar.findNet()));
            resultsFields[5].setText(String.format("%,.2f", loanCar.findInstallment()));

            window.setSize(550 , 450);
            container.add(panels[2]);
            container.validate();
        }
        else {

            resetDatas();
            JOptionPane.showMessageDialog(window , "Wrong Data Input, Please Input Correct Data." , "Wrong Data input!!" , JOptionPane.WARNING_MESSAGE);
        }

    }

    private void resetDatas() {

        for (int index = 0 ; index < dataFields.length ; index++) {

            dataFields[index].setText("");
        }

    }

    public void actionPerformed(ActionEvent event) {

        if (event.getSource() == button) {

            if (!dataFields[0].getText().isEmpty() && !dataFields[1].getText().isEmpty() && !dataFields[2].getText().isEmpty() && !dataFields[3].getText().isEmpty()) {

                int installment = Integer.parseInt(dataFields[2].getText());

                if (installment == 48 || installment == 60 || installment == 72 || installment == 84) {

                    loanResult();
                    resetDatas();
                }
                else {

                    resetDatas();
                    JOptionPane.showMessageDialog(window , "Wrong Data Input, Please Input Correct Data." , "Wrong Data input!!" , JOptionPane.WARNING_MESSAGE);
                }

            }
            else {

                resetDatas();
                JOptionPane.showMessageDialog(window , "Wrong Input, Please Input Again." , "Wrong Input!!" , JOptionPane.WARNING_MESSAGE);
            }            

        }

    }

}