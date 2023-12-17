/* Name : Punnawat Pinsaeng
 * Id : 64-060216-2005-0
 * Room : 1-RA
 * File name : Assign07_6406021620050_1.java
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Assign07_6406021620050_1 implements ActionListener {

    JFrame window;
    Container container;
    JPanel panels[] = new JPanel[3];
    JLabel dataLabels[] = new JLabel[12];
    JTextField dataFields[] = new JTextField[12];
    JButton buttons[] = new JButton[3];
    Font font = new Font("Consolas" , Font.BOLD , 16);

    public static void main(String[] args) {

        new Assign07_6406021620050_1(400 , 120);
    }

    public Assign07_6406021620050_1(int windowWidth , int windowHeight) {

        window = new JFrame("Program Calculate Student Grade");
        container = window.getContentPane();
        container.setLayout(new FlowLayout());

        subjectForm();

        window.setSize(windowWidth , windowHeight);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void subjectForm() {

        panels[0] = new JPanel();
        panels[0].setPreferredSize(new Dimension(400 , 120));
        panels[0].setLayout(new FlowLayout());

        dataLabels[0] = new JLabel("Enter Number of Subject (1 - 7)");
        dataLabels[0].setFont(font);
        panels[0].add(dataLabels[0]);

        dataFields[0] = new JTextField(10);
        dataFields[0].setFont(font);
        panels[0].add(dataFields[0]);

        buttons[0] = new JButton("Submit Subject");
        buttons[0].setFont(font);
        buttons[0].addActionListener(this);
        panels[0].add(buttons[0]);

        window.setSize(400 , 120);
        container.add(panels[0]);
    }

    private boolean checkSubject() {

        if (!dataFields[0].getText().isEmpty()) {

            for (int index = 0 ; index < dataFields[0].getText().length() ; index++) {

                if (!Character.isDigit(dataFields[0].getText().charAt(0)) || dataFields[0].getText().length() > 1 || (Integer.parseInt(dataFields[0].getText()) < 1 || Integer.parseInt(dataFields[0].getText()) > 7)) {
    
                    JOptionPane.showMessageDialog(window , "Wrong Input, Please Input (0 - 7) Only." , "Wrong Input!!" , JOptionPane.WARNING_MESSAGE);
                    return false;
                }
    
            }
    
        }
        else {

            JOptionPane.showMessageDialog(window , "Wrong Input, Please Input Again." , "Wrong Input!!" , JOptionPane.WARNING_MESSAGE);
            return false;
        }

        return true;
    }

    private void gradeForm() {

        panels[1] = new JPanel();
        panels[1].setPreferredSize(new Dimension(400 , 300));
        panels[1].setLayout(new FlowLayout());

        for (int index = 1 ; index < Integer.parseInt(dataFields[0].getText()) + 1 ; index++) {

            dataLabels[index] = new JLabel("Enter Your Grade Subject #" + index);
            dataLabels[index].setFont(font);
            panels[1].add(dataLabels[index]);

            dataFields[index] = new JTextField(10);
            dataFields[index].setFont(font);
            panels[1].add(dataFields[index]);
        }

        buttons[1] = new JButton("Submit Grade");
        buttons[1].setFont(font);
        buttons[1].addActionListener(this);
        panels[1].add(buttons[1]);

        window.setSize(400 , 290);
        container.add(panels[1]);
    }

    private void reportForm() {

        panels[2] = new JPanel();
        panels[2].setPreferredSize(new Dimension(400 , 300));
        panels[2].setLayout(new FlowLayout());
        String dataGradeReport[] = {"Score            " , "Total Credit     " , "GPA              " , "Status           "};

        for (int index = 8 ; index < dataFields.length ; index++) {

            dataLabels[index] = new JLabel(dataGradeReport[index - 8]);
            dataLabels[index].setFont(font);
            panels[2].add(dataLabels[index]);

            dataFields[index] = new JTextField(10);
            dataFields[index].setFont(font);
            dataFields[index].setEditable(false);
            panels[2].add(dataFields[index]);
        }

        buttons[2] = new JButton("Calculate Again");
        buttons[2].setFont(font);
        buttons[2].addActionListener(this);
        panels[2].add(buttons[2]);

        window.setSize(400 , 200);
        container.add(panels[2]);
    }

    private void studentGrade() {

        String grades[] = new String[Integer.parseInt(dataFields[0].getText())];

        if (checkGrade(grades)) {

            reportGrade(grades);
        }

    }

    private boolean checkGrade(String[] grades) {

        String temp;

        for (int index = 0 ; index < Integer.parseInt(dataFields[0].getText()) ; index++) {

            temp = dataFields[index + 1].getText().toUpperCase();

            if (temp.equals("A") || temp.equals("B+") || temp.equals("B") || temp.equals("C+") || temp.equals("C") || temp.equals("D+") || temp.equals("D") || temp.equals("F")) {

                grades[index] = dataFields[index + 1].getText().toUpperCase();
            }
            else {

                container.removeAll();
                gradeForm();
                JOptionPane.showMessageDialog(window , "Wrong Input, Please Input Grade Again." , "Wrong Grade Input!!" , JOptionPane.WARNING_MESSAGE);
                return false;
            }

        }

        return true;
    }

    private void reportGrade(String grades[]) {

        StudentGrade studentGrade = new StudentGrade(grades);

        switch (studentGrade.getStatus()) {

            case "Retire" : dataFields[11].setForeground(Color.RED); break;
            case "Probation" : dataFields[11].setForeground(Color.ORANGE); break;
            case "Normal" : dataFields[11].setForeground(Color.GREEN); break;
        }

        dataFields[8].setText(String.format("%.1f" , studentGrade.getScore()));
        dataFields[9].setText(String.format("%.1f" , studentGrade.getCredit()));
        dataFields[10].setText(String.format("%.2f" , studentGrade.getGPA()));
        dataFields[11].setText(studentGrade.getStatus());
    }

    public void actionPerformed(ActionEvent event) {

        if (event.getSource() == buttons[0] && checkSubject()) {

            container.removeAll();
            gradeForm();
            container.validate();
        }
        else if (event.getSource() == buttons[1]) {

            container.removeAll();
            reportForm();
            studentGrade();
            container.validate();
        }
        else if (event.getSource() == buttons[2]) {

            container.removeAll();
            subjectForm();
            container.validate();
        }

    }

}