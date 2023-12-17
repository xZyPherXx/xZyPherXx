
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LoginPage extends JFrame implements ActionListener {

    private Container container;
    private JTextField accLog[] = new JTextField[2];
    private JLabel label;
    private JPanel formPanel , backPanel;
    private JButton buttons[] = new JButton[2];
    private Font font = new Font("Consolas", Font.PLAIN , 30);

    public LoginPage(int width , int height) {

        super("Login");
        container = getContentPane();
        container.setLayout(null);
        container.setBackground(new Color(106 , 106 , 106));

        container.add(labelTile());
        container.add(createForm());
        container.add(backButton());

        setSize(width , height);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private JLabel labelTile() {

        label = new JLabel("Login");
        label.setFont(font);
        label.setForeground(Color.BLACK);;
        label.setBounds(300 , 10 , 150 , 50);

        return label;
    }

    private JPanel createForm() {

        formPanel = new JPanel();
        formPanel.setBackground(new Color(106 , 106 , 106));
        formPanel.setLayout(new FlowLayout(0 , 150 , 20));
        formPanel.setBounds(90 , 70 , 500 , 280);

        String datas[] = {"   Account Number" , "      Password"};
        font = new Font("Consolas", Font.PLAIN , 20);

        for (int index = 0 ; index < datas.length ; index++) {

            label = new JLabel(datas[index]);
            label.setFont(font);
            label.setForeground(Color.BLACK);
            formPanel.add(label);

            accLog[index] = new JTextField(20);
            accLog[index].setFont(font);
            
            formPanel.add(accLog[index]);
        }

        buttons[0] = new JButton("      Login      ");
        buttons[0].setFont(font);
        buttons[0].setBackground(Color.GREEN);
        buttons[0].setForeground(Color.BLACK);
        buttons[0].addActionListener(this);
        formPanel.add(buttons[0]);

        return formPanel;
    }

    private JButton backButton() {

        buttons[1] = new JButton("BACK");
        buttons[1].setBackground(Color.RED);
        buttons[1].setForeground(Color.BLACK);
        buttons[1].setFont(font);
        buttons[1].addActionListener(this);
        buttons[1].setBounds(250 , 350 , 200 , 50);

        return buttons[1];
    }

    public void actionPerformed(ActionEvent event) {

        if (event.getSource() == buttons[0]) {


        }
        else if (event.getSource() == buttons[1]) {

            dispose();
            new MainMenu(800 , 600);
        }

    }

}