
// Coding By Punnawat Pinsaeng IT Sec A

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class DisplaySeller extends JFrame implements ActionListener {

    Container container;
    JPanel panels[] = new JPanel[3];
    JLabel label;
    JButton buttons[] = new JButton[3] , backButton;
    JScrollPane scroll;
    JComboBox boxMod , boxDel;
    JTextArea infoArea;
    JTextField fields[] = new JTextField[10];
    ManageFile fileSeller = new ManageFile("sellers");
    String dataSellers[][] = fileSeller.getData();
    Font font = new Font("Consolas" , Font.PLAIN , 24);

    public DisplaySeller(int width , int height) {

        super("Seller");
        container = getContentPane();
        container.setLayout(null);
        container.setBackground(new Color(106 , 106 , 106));

        container.add(labelTitle());
        container.add(editPanel());
        container.add(infoPanel());
        container.add(backButton());
        
        setSize(width , height);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private JLabel labelTitle() {

        label = new JLabel("Seller Control");
        label.setFont(font);
        label.setForeground(Color.BLACK);
        label.setBounds(400 , 10 , 500 , 60);

        return label;
    }

    private JPanel editPanel() {

        panels[0] = new JPanel();
        panels[0].setPreferredSize(new Dimension(900 , 400));
        panels[0].setLayout(new GridLayout(1 , 3));
        panels[0].setBounds(45 , 60 , 900 , 400);

        panels[0].add(gridLeft());
        panels[0].add(gridCenter());
        panels[0].add(gridRight());

        return panels[0];
    }

    private JPanel gridLeft() {

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBorder(new LineBorder(Color.BLACK , 1));
        panel.setBackground(new Color(236 , 94 , 94));

        label = new JLabel("    Add Seller    ");
        label.setFont(new Font("Consolas" , Font.PLAIN , 20));
        label.setForeground(Color.BLACK);
        label.setBounds(50 , 20 , 220 , 20);
        panel.add(label);

        String datas[] = {"Name :  " , "Surname : " , "Tel :   "};
        for (int index = 0 ; index < datas.length ; index++) {

            label = new JLabel(datas[index]);
            label.setFont(new Font("Consolas" , Font.PLAIN , 20));
            label.setForeground(Color.BLACK);
            label.setBounds(50 , 60 * (index + 1) , 150 , 20);
            panel.add(label);

            fields[index] = new JTextField(10);
            fields[index].setForeground(Color.BLACK);
            fields[index].setFont(new Font("Consolas" , Font.PLAIN , 18));
            fields[index].setBounds(170 , 58 * (index + 1) , 100 , 25);
            panel.add(fields[index]);
        }

        buttons[0] = new JButton("Add");
        buttons[0].setPreferredSize(new Dimension(150 , 40));
        buttons[0].setBackground(Color.LIGHT_GRAY);
        buttons[0].setForeground(Color.BLACK);
        buttons[0].setFont(new Font("Consolas" , Font.BOLD , 20));
        buttons[0].addActionListener(this);
        buttons[0].setBounds(80 , 320 , 150 , 40);
        panel.add(buttons[0]);

        return panel;
    }

    private JPanel gridCenter() {

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBorder(new LineBorder(Color.BLACK , 1));
        panel.setBackground(new Color(236 , 94 , 94));

        label = new JLabel("    Modify Seller    ");
        label.setFont(new Font("Consolas" , Font.PLAIN , 20));
        label.setForeground(Color.BLACK);
        label.setBounds(35 , 20 , 260 , 25);
        panel.add(label);

        label.setFont(new Font("Consolas" , Font.PLAIN , 20));
        label.setForeground(Color.BLACK);
        panel.add(label);

        String dataCombos[] = new String[dataSellers.length + 1];
        dataCombos[0] = "Select Seller Name";

        for (int index = 0 ; index < dataSellers.length ; index++) {
            dataCombos[index + 1] = dataSellers[index][0];
        }

        boxMod = new JComboBox<>(dataCombos);
        boxMod.setPreferredSize(new Dimension(130 , 25));
        boxMod.addActionListener(this);
        boxMod.setBounds(90 , 58 , 130 , 25);
        boxMod.setBackground(Color.WHITE);
        boxMod.setForeground(Color.BLACK);
        panel.add(boxMod);

        for (int index = 3 ; index < 8 ; index++) {

            if (index == 5) {

                label = new JLabel("            TO            ");
                label.setFont(new Font("Consolas" , Font.PLAIN , 20));
                label.setForeground(Color.BLACK);
                label.setBounds(12 , 148 , 300 , 30);
                panel.add(label);
            }

            fields[index] = new JTextField(10);
            fields[index].setForeground(Color.BLACK);
            fields[index].setFont(new Font("Consolas" , Font.PLAIN , 14));
            fields[index].setBounds(95 , 60 + (index * 24) , 120 , 20);

            if (index < 5) {

                fields[index].setBounds(95 , 70 + ((index - 2) * 24) , 120 , 20);
                fields[index].setEditable(false);
            }

            panel.add(fields[index]);
        }

        buttons[1] = new JButton("Modify");
        buttons[1].setPreferredSize(new Dimension(150 , 40));
        buttons[1].setBackground(Color.LIGHT_GRAY);
        buttons[1].setForeground(Color.BLACK);
        buttons[1].setFont(new Font("Consolas" , Font.BOLD , 20));
        buttons[1].addActionListener(this);
        buttons[1].setBounds(80 , 320 , 150 , 40);
        panel.add(buttons[1]);

        return panel;
    }

    private JPanel gridRight() {

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBorder(new LineBorder(Color.BLACK , 1));
        panel.setBackground(new Color(236 , 94 , 94));

        label = new JLabel("    Delete Seller    ");
        label.setFont(new Font("Consolas" , Font.PLAIN , 20));
        label.setForeground(Color.BLACK);
        label.setBounds(35 , 20 , 260 , 25);
        panel.add(label);
        
        String dataCombos[] = new String[dataSellers.length + 1];
        dataCombos[0] = "Select Seller Name";

        for (int index = 0 ; index < dataSellers.length ; index++) {
            dataCombos[index + 1] = dataSellers[index][0];
        }

        boxDel = new JComboBox<>(dataCombos);
        boxDel.setPreferredSize(new Dimension(130 , 25));
        boxDel.addActionListener(this);
        boxDel.setBackground(Color.WHITE);
        boxDel.setForeground(Color.BLACK);
        boxDel.setBounds(90 , 58 , 130 , 25);
        panel.add(boxDel);

        for (int index = 8 ; index < fields.length ; index++) {

            fields[index] = new JTextField(10);
            fields[index].setForeground(Color.BLACK);
            fields[index].setFont(new Font("Consolas" , Font.PLAIN , 14));
            fields[index].setBounds(95 , 92 + ((index - 8) * 24) , 120 , 20);
            fields[index].setEditable(false);
            panel.add(fields[index]);
        }

        buttons[2] = new JButton("Delete");
        buttons[2].setPreferredSize(new Dimension(150 , 40));
        buttons[2].setBackground(Color.LIGHT_GRAY);
        buttons[2].setForeground(Color.BLACK);
        buttons[2].setFont(new Font("Consolas" , Font.BOLD , 20));
        buttons[2].addActionListener(this);
        buttons[2].setBounds(80 , 320 , 150 , 40);
        panel.add(buttons[2]);

        return panel;
    }

    private JPanel infoPanel() {

        panels[1] = new JPanel();
        panels[1].setPreferredSize(new Dimension(450 , 200));
        panels[1].setLayout(new FlowLayout(FlowLayout.CENTER));
        panels[1].setBackground(new Color(65 , 212 , 142));
        panels[1].setBounds(60 , 470 , 450 , 185);

        label = new JLabel("              Information Seller               ");
        label.setFont(new Font("Consolas", Font.BOLD , 20));
        label.setForeground(Color.BLACK);
        panels[1].add(label);

        infoArea = new JTextArea(6 , 40);
        infoArea.setBackground(new Color(65 , 212 , 142));
        infoArea.setForeground(Color.black);
        infoArea.setEditable(false);
        infoArea.setFont(new Font("Consolas", Font.BOLD , 18));

        for (int row = 0 ; row < dataSellers.length ; row++) {

            infoArea.append("Name : " + dataSellers[row][0] + " Surname : " + dataSellers[row][1] + 
                            " Tel : " + dataSellers[row][2] + "\n");
        }

        scroll = new JScrollPane(infoArea);
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
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

    private boolean confirm(String key) {

        String data = "";
        int choice;

        switch (key) {

            case "add" : 

                data = "Are you sure to add this seller ?" + 
                "\n Name : " + fields[0].getText() + 
                "\n Surname : " + fields[1].getText() + 
                "\n Tel : " + fields[2].getText();
                choice = JOptionPane.showConfirmDialog (this , data , "Add Seller" , JOptionPane.OK_CANCEL_OPTION);

                if(choice == JOptionPane.OK_OPTION){
        
                    return true;
                }
                break;

            case "mod" : 

                data = "Are you sure to modify this seller ?" + 
                "\n Name : " + boxMod.getSelectedItem() + " => " + fields[5].getText() + 
                "\n Surname : " + fields[3].getText() + " => " + fields[6].getText() + 
                "\n Price : " + fields[4].getText() + " => " + fields[7].getText();
                choice = JOptionPane.showConfirmDialog (this , data , "Modify Seller" , JOptionPane.OK_CANCEL_OPTION);

                if(choice == JOptionPane.OK_OPTION){
        
                    return true;
                }
                break;

            case "del" : 

                data = "Are you sure to delete this seller ?" + 
                "\n Name : " + boxDel.getSelectedItem() + 
                "\n Surname : " + fields[8].getText() + 
                "\n Tel : " + fields[9].getText();
                choice = JOptionPane.showConfirmDialog (this , data , "Delete Seller" , JOptionPane.OK_CANCEL_OPTION);

                if(choice == JOptionPane.OK_OPTION){
        
                    return true;
                }
                break;

        }

        return false;
    }

    private void updateDisplay() {

        dispose();
        new DisplaySeller(1000 , 700).setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {

        if (event.getSource() == backButton) {

            dispose();
            new MainMenu(1000 , 700);
        }

        if (event.getSource() == buttons[0] && !fields[0].getText().isEmpty() && !fields[1].getText().isEmpty() && 
            !fields[2].getText().isEmpty()) {

            if (confirm("add")) {

                String getDatas[] = { fields[0].getText() , fields[1].getText() , fields[2].getText() };
                fileSeller.writeDataByArr(getDatas);
            }

            updateDisplay();
        }

        if (event.getSource() != boxMod.getItemAt(0)) {

            int index;
            for (index = 0 ; index < dataSellers.length ; index++) {

                if (boxMod.getSelectedItem() == dataSellers[index][0]) {

                    fields[3].setText(dataSellers[index][1]);
                    fields[4].setText(dataSellers[index][2]); break;
                }
                else if (boxMod.getSelectedIndex() == 0) {

                    fields[3].setText(""); fields[4].setText(""); break;
                }

            }

            if (event.getSource() == buttons[1] && boxMod.getSelectedIndex() != 0 && (!fields[5].getText().isEmpty()
                && !fields[6].getText().isEmpty() && !fields[7].getText().isEmpty())) {

                if (confirm("mod")) {

                    dataSellers[index][0] = fields[5].getText();
                    dataSellers[index][1] = fields[6].getText();
                    dataSellers[index][2] = fields[7].getText();
                    fileSeller.writeDataNewToFile(dataSellers);
                }

                updateDisplay();
            }

        }

        if (event.getSource() != boxDel.getItemAt(0)) {

            int index;
            for (index = 0 ; index < dataSellers.length ; index++) {

                if (boxDel.getSelectedItem() == dataSellers[index][0]) {

                    fields[8].setText(dataSellers[index][1]); fields[9].setText(dataSellers[index][2]); break;
                }
                else if (boxDel.getSelectedIndex() == 0) {

                    fields[8].setText(""); fields[9].setText(""); break;
                }

            }

            if (event.getSource() == buttons[2] && boxDel.getSelectedIndex() != 0) {

                if (confirm("del")) {

                    dataSellers[index][0] = "";
                    dataSellers[index][1] = "";
                    dataSellers[index][2] = "";
                    fileSeller.writeDataNewToFile(dataSellers);
                }

                updateDisplay();
            }

        }

    }
    
}