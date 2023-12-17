
// Coding By Punnawat Pinsaeng IT Sec A

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class DisplayProduct extends JFrame implements ActionListener {

    Container container;
    JPanel panels[] = new JPanel[3];
    JLabel label;
    JButton buttons[] = new JButton[3] , backButton;
    JScrollPane scroll;
    JComboBox boxMod , boxDel;
    JTextArea infoArea;
    JTextField fields[] = new JTextField[14];
    ManageFile fileProduct = new ManageFile("products");
    String dataProducts[][] = fileProduct.getData();
    Font font = new Font("Consolas" , Font.PLAIN , 24);

    public DisplayProduct(int width , int height) {

        super("Product");
        container = getContentPane();
        container.setLayout(null);
        container.setBackground(new Color(106 , 106 , 106));

        container.add(labelTitle());
        container.add(editPanel());
        container.add(infoPanel());
        container.add(backButton());
        
        setSize(width , height);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private JLabel labelTitle() {

        label = new JLabel("Product Control");
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

        label = new JLabel("    Add Product    ");
        label.setFont(new Font("Consolas" , Font.PLAIN , 20));
        label.setForeground(Color.BLACK);
        label.setBounds(50 , 20 , 220 , 20);
        panel.add(label);

        String datas[] = {"ID :    " , "Name :  " , "Price : " , "Stock : "};
        for (int index = 0 ; index < datas.length ; index++) {

            label = new JLabel(datas[index]);
            label.setFont(new Font("Consolas" , Font.PLAIN , 20));
            label.setForeground(Color.BLACK);
            label.setBounds(50 , 60 * (index + 1) , 90 , 20);
            panel.add(label);

            fields[index] = new JTextField(10);
            fields[index].setForeground(Color.BLACK);
            fields[index].setFont(new Font("Consolas" , Font.PLAIN , 18));
            fields[index].setBounds(150 , 58 * (index + 1) , 100 , 25);
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

        label = new JLabel("    Modify Product    ");
        label.setFont(new Font("Consolas" , Font.PLAIN , 20));
        label.setForeground(Color.BLACK);
        label.setBounds(35 , 20 , 260 , 25);
        panel.add(label);

        label.setFont(new Font("Consolas" , Font.PLAIN , 20));
        label.setForeground(Color.BLACK);
        panel.add(label);

        String dataCombos[] = new String[dataProducts.length + 1];
        dataCombos[0] = "Select Product ID";

        for (int index = 0 ; index < dataProducts.length ; index++) {
            dataCombos[index + 1] = dataProducts[index][0];
        }

        boxMod = new JComboBox<>(dataCombos);
        boxMod.setPreferredSize(new Dimension(130 , 25));
        boxMod.addActionListener(this);
        boxMod.setBounds(90 , 58 , 130 , 25);
        boxMod.setBackground(Color.WHITE);
        boxMod.setForeground(Color.BLACK);
        panel.add(boxMod);

        for (int index = 4 ; index < 11 ; index++) {

            if (index == 7) {

                label = new JLabel("            TO            ");
                label.setFont(new Font("Consolas" , Font.PLAIN , 20));
                label.setForeground(Color.BLACK);
                label.setBounds(12 , 175 , 300 , 30);
                panel.add(label);
            }

            fields[index] = new JTextField(10);
            fields[index].setForeground(Color.BLACK);
            fields[index].setFont(new Font("Consolas" , Font.PLAIN , 14));
            fields[index].setBounds(95 , 40 + (index * 24) , 120 , 20);

            if (index < 7) {

                fields[index].setBounds(95 , (index * 24) , 120 , 20);
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

        label = new JLabel("    Delete Product    ");
        label.setFont(new Font("Consolas" , Font.PLAIN , 20));
        label.setForeground(Color.BLACK);
        label.setBounds(35 , 20 , 260 , 25);
        panel.add(label);
        
        String dataCombos[] = new String[dataProducts.length + 1];
        dataCombos[0] = "Select Product ID";

        for (int index = 0 ; index < dataProducts.length ; index++) {
            dataCombos[index + 1] = dataProducts[index][0];
        }

        boxDel = new JComboBox<>(dataCombos);
        boxDel.setPreferredSize(new Dimension(130 , 25));
        boxDel.addActionListener(this);
        boxDel.setBackground(Color.WHITE);
        boxDel.setForeground(Color.BLACK);
        boxDel.setBounds(90 , 58 , 130 , 25);
        panel.add(boxDel);

        for (int index = 11 ; index < fields.length ; index++) {

            fields[index] = new JTextField(10);
            fields[index].setForeground(Color.BLACK);
            fields[index].setFont(new Font("Consolas" , Font.PLAIN , 14));
            fields[index].setBounds(95 , ((index - 7) * 24) , 120 , 20);
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
        panels[1].setBounds(45 , 470 , 450 , 185);

        label = new JLabel("              Information Product               ");
        label.setFont(new Font("Consolas", Font.BOLD , 20));
        label.setForeground(Color.BLACK);
        panels[1].add(label);

        infoArea = new JTextArea(6 , 40);
        infoArea.setBackground(new Color(65 , 212 , 142));
        infoArea.setForeground(Color.black);
        infoArea.setEditable(false);
        infoArea.setFont(new Font("Consolas", Font.BOLD , 18));

        for (int row = 0 ; row < dataProducts.length ; row++) {

            infoArea.append(dataProducts[row][0] + ", " + dataProducts[row][1] + ", " + 
                            dataProducts[row][2] + ", " + dataProducts[row][3] + "\n");
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

                data = "Are you sure to add this product ?" + "\n ID : " + fields[0].getText() + "\n Name : " + 
                fields[1].getText() + "\n Price : " + fields[2].getText() + "\n Stock : " + fields[3].getText();
                choice = JOptionPane.showConfirmDialog (this , data , "Add Product" , JOptionPane.OK_CANCEL_OPTION);

                if(choice == JOptionPane.OK_OPTION){
        
                    return true;
                }
                break;

            case "mod" : 

                data = "Are you sure to modify this product ?" + 
                "\n ID : " + boxMod.getSelectedItem() + " => " + fields[7].getText() + 
                "\n Name : " + fields[4].getText() + " => " + fields[8].getText() + 
                "\n Price : " + fields[5].getText() + " => " + fields[9].getText() +
                "\n Stock : " + fields[6].getText() + " => " + fields[10].getText();
                choice = JOptionPane.showConfirmDialog (this , data , "Modify Product" , JOptionPane.OK_CANCEL_OPTION);

                if(choice == JOptionPane.OK_OPTION){
        
                    return true;
                }
                break;

            case "del" : 

                data = "Are you sure to delete this product ?" + 
                "\n ID : " + boxDel.getSelectedItem() + 
                "\n Name : " + fields[11].getText() + 
                "\n Price : " + fields[12].getText() +
                "\n Stock : " + fields[13].getText();
                choice = JOptionPane.showConfirmDialog (this , data , "Delete Product" , JOptionPane.OK_CANCEL_OPTION);

                if(choice == JOptionPane.OK_OPTION){
        
                    return true;
                }
                break;

        }

        return false;
    }

    private boolean checkPrice(String data) {

        try {

            Float.parseFloat(data);
            return true;
        }
        catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(this , "Please Enter Correct Data.");
            return false;
        }

    }

    private boolean checkStock(String data) {

        try {

            Integer.parseInt(data);
            return true;
        }
        catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(this , "Please Enter Correct Data.");
            return false;
        }
        
    }

    private void updateDisplay() {

        dispose();
        new DisplayProduct(1000 , 700).setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {

        if (event.getSource() == backButton) {

            dispose();
            new MainMenu(1000 , 700);
        }

        if (event.getSource() == buttons[0] && !fields[0].getText().isEmpty() && !fields[1].getText().isEmpty() && 
            !fields[2].getText().isEmpty() && !fields[3].getText().isEmpty()) {

            if (checkPrice(fields[2].getText()) && checkStock(fields[3].getText())) {

                if (confirm("add")) {

                    String getDatas[] = { fields[0].getText() , fields[1].getText() , fields[2].getText() , fields[3].getText() };
                    fileProduct.writeDataByArr(getDatas);
                }

            }

            updateDisplay();
        }

        if (event.getSource() != boxMod.getItemAt(0)) {

            int index;
            for (index = 0 ; index < dataProducts.length ; index++) {

                if (boxMod.getSelectedItem() == dataProducts[index][0]) {

                    fields[4].setText(dataProducts[index][1]);
                    fields[5].setText(dataProducts[index][2]);
                    fields[6].setText(dataProducts[index][3]); break;
                }
                else if (boxMod.getSelectedIndex() == 0) {

                    fields[4].setText(""); fields[5].setText(""); fields[6].setText(""); break;
                }

            }

            if (event.getSource() == buttons[1] && boxMod.getSelectedIndex() != 0 && (!fields[7].getText().isEmpty()
                && !fields[8].getText().isEmpty() && !fields[9].getText().isEmpty()
                && !fields[10].getText().isEmpty())) {

                if (checkPrice(fields[9].getText()) && checkStock(fields[10].getText())) {

                    if (confirm("mod")) {

                        dataProducts[index][0] = fields[7].getText();
                        dataProducts[index][1] = fields[8].getText();
                        dataProducts[index][2] = fields[9].getText();
                        dataProducts[index][3] = fields[10].getText();
                        fileProduct.writeDataNewToFile(dataProducts);
                    }

                }

                updateDisplay();
            }

        }

        if (event.getSource() != boxDel.getItemAt(0)) {

            int index;
            for (index = 0 ; index < dataProducts.length ; index++) {

                if (boxDel.getSelectedItem() == dataProducts[index][0]) {

                    fields[11].setText(dataProducts[index][1]);
                    fields[12].setText(dataProducts[index][2]);
                    fields[13].setText(dataProducts[index][3]); break;
                }
                else if (boxDel.getSelectedIndex() == 0) {

                    fields[11].setText(""); fields[12].setText(""); fields[13].setText(""); break;
                }

            }

            if (event.getSource() == buttons[2] && boxDel.getSelectedIndex() != 0) {

                if (confirm("del")) {

                    dataProducts[index][0] = "";
                    dataProducts[index][1] = "";
                    dataProducts[index][2] = "";
                    dataProducts[index][3] = "";
                    fileProduct.writeDataNewToFile(dataProducts);
                }

                updateDisplay();
            }

        }

    }

}