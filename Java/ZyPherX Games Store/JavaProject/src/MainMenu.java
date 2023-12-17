
// Coding By Punnawat Pinsaeng IT Sec A

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainMenu extends JFrame implements ActionListener {

    private Container container;
    private JPanel panels[] = new JPanel[4];
    private JLabel label;
    private JButton btnProducts[] , actionButtons[] = new JButton[6];
    private JScrollPane scrolls[] = new JScrollPane[2];
    private JComboBox boxs[] = new JComboBox[2];
    private JTextArea infoArea , totalArea;
    private ManageFile fileProduct = new ManageFile("products");
    private ManageFile fileSeller = new ManageFile("sellers");
    private ManageFile fileCustomer = new ManageFile("customers");
    private String dataProducts[][] = fileProduct.getData();
    private String dataSellers[][] = fileSeller.getData();
    private String dataCustomer[][] = fileCustomer.getData();
    private String toUseDataProducts[][] = new String[dataProducts.length][4];
    private Font font = new Font("Consolas", Font.PLAIN , 30);
    private float totalPrice = 0;

    public MainMenu(int width , int height) {

        super("ZypherX Games Store");
        container = getContentPane();
        container.setLayout(new FlowLayout(FlowLayout.CENTER , 50 , 40));
        container.setBackground(new Color(106 , 106 ,106));

        resetProduct();
        container.add(labelTitle());
        container.add(selectPanel());
        container.add(selectCS());
        container.add(infoPanel());
        container.add(buttonPanel());

        setSize(width , height);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private JLabel labelTitle() {

        label = new JLabel("                 ZypherX Games Store                 ");
        label.setFont(font);
        label.setForeground(Color.BLACK);

        return label;
    }

    private JScrollPane selectPanel() {

        panels[0] = new JPanel();
        panels[0].setLayout(new FlowLayout(FlowLayout.CENTER , 10 , 15));
        panels[0].setBackground(new Color(156 , 156 , 156));;

        label = new JLabel("                 Select Product                ");
        label.setForeground(Color.BLACK);
        label.setFont(new Font("Consolas", Font.PLAIN , 20));
        panels[0].add(label);

        btnProducts = new JButton[dataProducts.length];

        for (int index = 0 ; index < btnProducts.length ; index++) {

            btnProducts[index] = new JButton(dataProducts[index][1]);
            btnProducts[index].setPreferredSize(new Dimension(125 , 30));
            btnProducts[index].addActionListener(this);
            btnProducts[index].setBackground(Color.BLACK);
            btnProducts[index].setForeground(Color.WHITE);
            btnProducts[index].setFont(new Font("Consolas", Font.PLAIN , 14));

            if (Integer.parseInt(dataProducts[index][3]) == 0) {

                btnProducts[index].setEnabled(false);
            }

            panels[0].add(btnProducts[index]);
        }

        scrolls[0] = new JScrollPane(panels[0]);
        scrolls[0].setPreferredSize(new Dimension(500 , 250));
        panels[0].setPreferredSize(new Dimension(400 , 20 * btnProducts.length));

        return scrolls[0];
    }

    private JPanel selectCS() {

        panels[1] = new JPanel();
        panels[1].setPreferredSize(new Dimension(250 , 200));
        panels[1].setLayout(new GridLayout(3 , 1 , 0 , 30));
        panels[1].setBackground(new Color(106 , 106 , 106));

        Color colors[] = {new Color(255 , 80 , 80) , new Color(65 , 212 , 142)};
        String text[] = {"Select Customer. . ." , "Select Seller. . ."};

        boxs[0] = new JComboBox<>();
        boxs[0].setBackground(colors[0]);
        boxs[0].setForeground(Color.BLACK);
        boxs[0].setFont(new Font("Consolas", Font.BOLD , 14));
        boxs[0].addItem(text[0]);

        for (int index = 0 ; index < dataCustomer.length ; index++) {

            boxs[0].addItem(dataCustomer[index][0]);
        }
        panels[1].add(boxs[0]);

        boxs[1] = new JComboBox<>();
        boxs[1].setBackground(colors[1]);
        boxs[1].setForeground(Color.BLACK);
        boxs[1].setFont(new Font("Consolas", Font.BOLD , 14));
        boxs[1].addItem(text[1]);

        for (int index = 0 ; index < dataSellers.length ; index++) {

            boxs[1].addItem(dataSellers[index][0]);
        }
        panels[1].add(boxs[1]);

        actionButtons[0] = new JButton("Reset");
        actionButtons[0].addActionListener(this);
        actionButtons[0].setBackground(new Color(156 , 156 , 156));
        actionButtons[0].setForeground(Color.BLACK);
        actionButtons[0].setFont(new Font("Consolas", Font.PLAIN , 24));
        panels[1].add(actionButtons[0]);

        return panels[1];
    }

    private JPanel infoPanel() {

        panels[2] = new JPanel();
        panels[2].setPreferredSize(new Dimension(450 , 200));
        panels[2].setLayout(new FlowLayout(FlowLayout.CENTER));
        panels[2].setBackground(new Color(255 , 80 , 80));

        label = new JLabel("                Information               ");
        label.setFont(new Font("Consolas", Font.BOLD , 20));
        label.setForeground(Color.BLACK);
        panels[2].add(label);

        infoArea = new JTextArea(6 , 40);
        infoArea.setBackground(new Color(255 , 80 , 80));
        infoArea.setForeground(Color.black);
        infoArea.setEditable(false);
        infoArea.setFont(new Font("Consolas", Font.BOLD , 18));

        scrolls[1] = new JScrollPane(infoArea);
        scrolls[1].setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        panels[2].add(scrolls[1]);

        totalArea = new JTextArea(1 , 40);
        totalArea.setBackground(new Color(255 , 75 , 75));
        totalArea.setEditable(false);
        totalArea.setFont(new Font("Consolas", Font.BOLD , 18));
        totalArea.setForeground(Color.WHITE);
        panels[2].add(totalArea);

        return panels[2];
    }

    private JPanel buttonPanel() {

        panels[3] = new JPanel();
        panels[3].setPreferredSize(new Dimension(400 , 200));
        panels[3].setLayout(new FlowLayout(FlowLayout.CENTER , 15 , 45));
        panels[3].setBackground(new Color(106 , 106 , 106));

        String datas[] = {"Product" , "Customer" , "Seller" , "Report" , "Confirm Payment"};
        Color colors[] = {new Color(196 , 196 , 196) , new Color(196 , 196 , 196) , 
            new Color(196 , 196 , 196) , new Color(255 , 88 , 88) , new Color(57 , 255 , 136)};

        for(int index = 1 ; index < actionButtons.length ; index++) {

            actionButtons[index] = new JButton(datas[index - 1]);
            actionButtons[index].setBackground(colors[index - 1]);
            actionButtons[index].setForeground(Color.BLACK);
            actionButtons[index].addActionListener(this);
            actionButtons[index].setFont(new Font("Consolas", Font.PLAIN , 16));

            if (index == actionButtons.length - 1) {

                actionButtons[index].setEnabled(false);
                actionButtons[index].setPreferredSize(new Dimension(180 , 38));
            }
            else {

                actionButtons[index].setPreferredSize(new Dimension(108 , 40));
            }

            panels[3].add(actionButtons[index]);
        }

        return panels[3];
    }

    private void confirmPayment() {

        String payment = JOptionPane.showInputDialog(this , "Total Payment " + String.format("%,.2f" , totalPrice) + " Dollars" , "Confirm Payment" , JOptionPane.INFORMATION_MESSAGE);

        if (payment != null && !payment.isEmpty()) {

            if (checkPayment(payment) && Float.parseFloat(payment) >= totalPrice) {

                String dataReport = 
                "\n+-+-+-+-+ | Report | -+-+-+-+-+" + 
                "\nCustomer : " + boxs[0].getSelectedItem() + 
                "\nSeller : " + boxs[1].getSelectedItem() + 
                "\nTotal Payment : " + String.format("%,.2f" , totalPrice) + 
                "\nPayment : " + String.format("%,.2f" , (Float.parseFloat(payment))) + 
                "\nChange : " +  String.format("%,.2f" , (Float.parseFloat(payment) - totalPrice)) + 
                "\n|-+-+-+-+-+-+-+-+-+-+-+-+-+-+-|" + 
                "\n\n+-+-+-+-+ | Product | +-+-+-+-+" + 
                "\nProduct : " + 
                "\n" + infoArea.getText() + 
                "|-+-+-+-+-+-+-+-+-+-+-+-+-+-+-|" + 
                "\n\n===============================";

                System.out.println(dataReport);
                fileProduct.writeDataNewToFile(toUseDataProducts);

                ManageFile fileDate = new ManageFile(String.valueOf(java.time.LocalDate.now()) , "md" , "date");
                fileDate.writeDataByStr(dataReport);

                dispose();
                new MainMenu(1000 , 700).setVisible(true);
            }
            else {

                JOptionPane.showMessageDialog(this , "Wrong Input Payment!" , "Wrong Input" , JOptionPane.WARNING_MESSAGE);
            }

        }

    }

    private boolean checkPayment(String data) {

        try {

            Float.parseFloat(data);
            return true;
        }
        catch (NumberFormatException e) {

            return false;
        }

    }

    private boolean checkStock(String data) {

        try {

            Integer.parseInt(data);
            return true;
        }
        catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(this , "Please Enter Correct Data." , "Wrong Input" , JOptionPane.WARNING_MESSAGE);
            return false;
        }

    }

    private void updateInfo(String data) {

        infoArea.append(data + "\n");
    }

    private void updateTotalInfo(float price , int amount , int index) {

        String tempStock = toUseDataProducts[index][3];
        int tempAmount = Integer.parseInt(tempStock) - amount;
        toUseDataProducts[index][3] = String.valueOf(tempAmount);

        totalPrice += (price * amount);
        totalArea.setText("Total : " + String.format("%,.2f" , totalPrice) + " Dollar.-");
    }

    private void resetProduct() {

        for (int row = 0 ; row < dataProducts.length ; row++) {

            for (int col = 0 ; col < dataProducts[row].length ; col++) {

                toUseDataProducts[row][col] = dataProducts[row][col];
            }

        }

    }

    private void resetData() {

        for (int index = 0 ; index < btnProducts.length ; index++) {

            btnProducts[index].setEnabled(true);
        }

        fileProduct.writeDataNewToFile(dataProducts);
        totalPrice = 0;
        infoArea.setText("");
        totalArea.setText("");
        actionButtons[5].setEnabled(false);
        boxs[0].setSelectedIndex(0);
        boxs[1].setSelectedIndex(0);
    }

    public void paint(Graphics display)  {

        super.paint(display);
        display.fillRect(50 , 120 , 900 , 2);
        display.fillRect(50 , 416 , 900 , 2);
    }

    public void actionPerformed(ActionEvent event) {

        if (event.getSource() == actionButtons[0]) {

            resetProduct();
            resetData();
        }

        else if (event.getSource() == actionButtons[1]) {

            dispose();
            new DisplayProduct(1000 , 700).setVisible(true);
        }

        else if (event.getSource() == actionButtons[2]) {

            dispose();
            new DisplayCustomer(1000 , 700).setVisible(true);

        }
        else if (event.getSource() == actionButtons[3]) {

            dispose();
            new DisplaySeller(1000 , 700).setVisible(true);
        }

        else if (event.getSource() == actionButtons[4]) {

            dispose();
            new DisplayReport(1000 , 700).setVisible(true);
        }

        else if (event.getSource() == actionButtons[5]) {

            confirmPayment();
        }

        for (int index = 0 ; index < btnProducts.length ; index++) {

            if (event.getSource() == btnProducts[index])

                if (!boxs[0].getSelectedItem().equals(boxs[0].getItemAt(0)) && 
                    !boxs[1].getSelectedItem().equals(boxs[1].getItemAt(0))) {

                    String text = btnProducts[index].getText() + " in Stock " + toUseDataProducts[index][3] + " Piece";
                    String reponse = JOptionPane.showInputDialog(this , text 
                    , "Product" , JOptionPane.QUESTION_MESSAGE); 

                    if (reponse != null && checkStock(reponse)) {

                        if (Integer.parseInt(reponse) > 0 && (Integer.parseInt(reponse) <= Integer.parseInt(toUseDataProducts[index][3]))) {

                            actionButtons[5].setEnabled(true);
                            updateInfo(btnProducts[index].getText() + " x " + reponse);
                            updateTotalInfo(Float.parseFloat(dataProducts[index][2]) , Integer.parseInt(reponse) , index);
                            System.out.println("Buy " + btnProducts[index].getText() + " | Amount : " + reponse + "\nIn Stock " + toUseDataProducts[index][3]);

                            if (Integer.parseInt(toUseDataProducts[index][3]) == 0) {

                                btnProducts[index].setEnabled(false);
                            }

                        }
                        else {

                            JOptionPane.showMessageDialog(this , "Wrong Input Stock!" , "Wrong Input" , JOptionPane.WARNING_MESSAGE);
                        }

                    }

                }
                else {

                    JOptionPane.showMessageDialog(this , "You must select Customer and Seller first." , "Wrong Data" , JOptionPane.WARNING_MESSAGE);
                    break;
                }

            }

    }

}