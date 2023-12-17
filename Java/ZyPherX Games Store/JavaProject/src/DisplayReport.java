
// Coding By Punnawat Pinsaeng IT Sec A

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DisplayReport extends JFrame implements ActionListener {

    private Container container;
    private JPanel panels[] = new JPanel[2];
    private JLabel label;
    private JButton backButton;
    private JComboBox box;
    private JScrollPane scroll;
    private JTextArea reportArea;
    private Font font = new Font("Consolas" , Font.PLAIN , 24);
    private String dataDates[];

    public DisplayReport(int width , int height) {

        super("Report");
        container = getContentPane();
        container.setLayout(null);
        container.setBackground(new Color(106 , 106 , 106));

        container.add(labelTile());
        container.add(selectDatePanel());
        container.add(reportPanel());
        container.add(backButton());

        setSize(width , height);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private JLabel labelTile() {

        label = new JLabel("Report Information");
        label.setFont(font);
        label.setForeground(Color.BLACK);
        label.setBounds(380 , 10 , 500 , 60);

        return label;
    }

    private JPanel selectDatePanel() {

        panels[0] = new JPanel();
        panels[0].setPreferredSize(new Dimension(900 , 600));
        panels[0].setBackground(new Color(106 , 106 , 106));
        panels[0].setBounds(45 , 70 , 900 , 50);

        int lengthFolder;
        dataDates = new String[lengthFolder = new ManageFile().lengthListFileInFolder("date")];

        for (int index = 0 ; index < lengthFolder ; index++) {

            dataDates[index] = new ManageFile().listFileInFolder("date" , index);
        }

        box = new JComboBox<>();
        box.setPreferredSize(new Dimension(200 , 30));
        box.setBackground(new Color(217 , 217 , 217));
        box.addActionListener(this);
        box.addItem("Select Date Report");

        for (int index = 0 ; index < lengthFolder ; index++) {

            box.addItem(dataDates[index]);
        }

        panels[0].add(box);


        return panels[0];
    }

    private JPanel reportPanel() {

        panels[1] = new JPanel();
        panels[1].setBackground(new Color(106 , 106 , 106));
        panels[1].setBounds(45 , 130 , 900 , 450);

        reportArea = new JTextArea(100 , 100);
        reportArea.setFont(new Font("Consolas" , Font.PLAIN , 16));
        reportArea.setEditable(false);
        reportArea.setBackground(new Color(217 , 217 , 217));
        panels[1].add(reportArea);

        scroll = new JScrollPane(reportArea);
        scroll.setPreferredSize(new Dimension(900 , 450));
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        panels[1].add(scroll);

        return panels[1];
    }

    private JButton backButton() {

        backButton = new JButton("Back");
        backButton.setFont(font);
        backButton.addActionListener(this);
        backButton.setForeground(Color.BLACK);
        backButton.setBackground(new Color(65 , 212 , 142));
        backButton.setBounds(798 , 600 , 150 , 45);

        return backButton;
    }

    public void actionPerformed(ActionEvent event) {

        if (event.getSource() == backButton) {

            dispose();
            new MainMenu(1000 , 700).setVisible(true);
        }

        if (event.getSource() != box.getItemAt(0)) {

            for (int index = 0 ; index < dataDates.length ; index++) {

                if (box.getSelectedItem() == dataDates[index]) {

                    ManageFile fileDate = new ManageFile(dataDates[index] , "" , "date");
                    reportArea.setText(fileDate.reportData());
                    break;
                }

            }

        }

    }

}