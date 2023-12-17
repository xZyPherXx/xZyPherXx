
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RegisterPage extends JFrame implements ActionListener {

    private Container container;
    private JPanel panels[] = new JPanel[2]; 
    private JLabel label;
    private JTextField fields[] = new JTextField[4];
    private JButton buttons[] = new JButton[2];
    private Font font = new Font("Consolas", Font.PLAIN , 30);

    public RegisterPage(int width , int height) {

        super("Register");
        container = getContentPane();
        container.setLayout(null);
        container.setBackground(new Color(106 , 106 , 106));

        container.add(labelTitle());
        container.add(createForm());

        setSize(width , height);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private JLabel labelTitle() {

        label = new JLabel("Register");
        label.setFont(font);
        label.setForeground(Color.BLACK);;
        label.setBounds(300 , 10 , 150 , 50);

        return label;
    }

    private JPanel createForm() {

        // * * * Now Here Register Form
        return panels[0];
    }

    public void actionPerformed(ActionEvent event) {


    }

}