
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainMenu extends JFrame implements ActionListener {

    private Container container;
    private JPanel panels[] = new JPanel[4];
    private JLabel label;
    private JButton buttons[] = new JButton[6];
    private JTextArea infoArea;
    private Font font = new Font("Consolas", Font.PLAIN , 30);

    public MainMenu(int width , int height) {

        super("Automatic Teller Machine By ZyPherX");
        container = getContentPane();
        container.setLayout(new FlowLayout(FlowLayout.CENTER , 100 , 30));
        container.setBackground(new Color(106 , 106 ,106));

        container.add(labelTitle());
        container.add(selectionPanel());
        container.add(loginRegisterPanel());
        container.add(information());
        

        setSize(width , height);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private JLabel labelTitle() {

        label = new JLabel("ATM By ZyPherX");
        label.setFont(font);
        label.setForeground(Color.BLACK);

        return(label);
    }

    private JPanel selectionPanel() {

        panels[0] = new JPanel();
        panels[0].setPreferredSize(new Dimension(375 , 200));
        panels[0].setLayout(null);
        panels[0].setBackground(new Color(156 , 156 , 156));
        
        String datas[] = {"Withdraw" , "Deposit" , "Transfer" , "Paybill"};

        font = new Font("Consolas", Font.PLAIN , 20);
        for (int index = 0 ; index < datas.length ; index++) {

            buttons[index] = new JButton(datas[index]);
            buttons[index].setBackground(Color.BLACK);
            buttons[index].setForeground(Color.WHITE);
            buttons[index].addActionListener(this);

            if (index == 0) {

                buttons[index].setBounds(10 , 10 , 120 , 50);
            }
            else if (index == 1) {

                buttons[index].setBounds(375 - 120 - 10 , 10 , 120 , 50);
            }
            else if (index == 2) {

                buttons[index].setBounds(10 , 200 - 50 - 10 , 120 , 50);
            }
            else {

                buttons[index].setBounds(375 - 120 - 10 , 200 - 50 - 10 , 120 , 50);
            }

            panels[0].add(buttons[index]);
        }

        return panels[0];
    }

    private JPanel loginRegisterPanel() {

        panels[1] = new JPanel();
        panels[1].setPreferredSize(new Dimension(175 , 200));
        panels[1].setLayout(new GridLayout(2 , 1 , 0 , 100));
        panels[1].setBackground(new Color(106 , 106 , 106));

        String datas[] = {"Login" , "Register"};
        Color colors[] = {new Color(65 , 212 , 142) , new Color(255 , 80 , 80)};

        font = new Font("Consolas", Font.PLAIN , 20);
        for (int index = 4 ; index < buttons.length ; index++) {

            buttons[index] = new JButton(datas[index - 4]);
            buttons[index].setPreferredSize(new Dimension(50 , 50));
            buttons[index].setBackground(colors[index - 4]);
            buttons[index].setForeground(Color.BLACK);
            buttons[index].setFont(font);
            buttons[index].addActionListener(this);

            panels[1].add(buttons[index]);
        }

        return panels[1];
    }

    private JPanel information() {

        panels[2] = new JPanel();
        panels[2].setPreferredSize(new Dimension(400 , 200));
        panels[2].setLayout(new FlowLayout());
        panels[2].setBackground(new Color(120 , 120 , 120));

        font = new Font("Consolas", Font.PLAIN , 20);
        infoArea = new JTextArea(5 , 50);
        infoArea.setFont(font);
        infoArea.setEditable(false);
        infoArea.setBackground(new Color(120 , 120 , 120));
        infoArea.setForeground(Color.RED);
        infoArea.setText("\n\n\n                No more information\n                   Please Login");
        // infoArea.setText("                  Acction Info\n        Account Name : \n        Account Number : \n        Account Balance : ");
        panels[2].add(infoArea);

        return panels[2];
    }

    public void actionPerformed(ActionEvent event) {

        // for (int index = 0 ; index  < buttons.length ; index++) {

        //     if (event.getSource() == buttons[index]) {

        //         System.out.println(buttons[index].getText());
        //         break;
        //     }

        // }

        if (event.getSource() == buttons[4]) {

            dispose();
            new LoginPage(700 , 500).setVisible(true);
        }
        else if (event.getSource() == buttons[5]) {

            dispose();
            new RegisterPage(700 , 500).setVisible(true);
        }

    }

}