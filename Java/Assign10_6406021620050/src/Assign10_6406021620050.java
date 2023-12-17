/* Name : Mr.Punnawat Pinsaeng
 * ID   : 64-060-216-2005-0
 * Room : 1-RA
 * File : Assign10_6406021620050.java
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Assign10_6406021620050 extends JFrame implements ActionListener {

    private Container container;
    private JButton buttons[] = new JButton[3];
    private JLabel rand;
    private Font font = new Font("Arial", Font.BOLD, 16);
    private AnimationPanel animation;

    public static void main(String[] args) {

        new Assign10_6406021620050(1000 , 700);
    }

    public Assign10_6406021620050(int width , int height) {

        super("Assign 10 : Animation Picture");
        container = getContentPane();
        container.setLayout(new FlowLayout());

        buttonPanel();
        animationPanel();

        setSize(width , height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void buttonPanel() {

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(980 , 50));
        panel.setLayout(null);
        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK , 1));

        String datas[] = {"Play" , "Stop" , "Set Max"};
        for (int index = 0 ; index < datas.length ; index++) {

            buttons[index] = new JButton(datas[index]);
            buttons[index].setFont(font);
            buttons[index].addActionListener(this);

            if (index != 2) {

                buttons[index].setBounds(320 + (index * 100) , 8 , 90 , 35);
                buttons[index].setEnabled(false);
            }
            else {

                buttons[index].setBounds(320 + (index * 100) , 8 , 100 , 35);
            }

            panel.add(buttons[index]);
        }

        rand = new JLabel("Max :" + 0);
        rand.setFont(font);
        rand.setBounds(700 , 0 , 100 , 50);
        panel.add(rand);
        container.add(panel);
    }

    private void animationPanel() {

        animation = new AnimationPanel(980 , 600);
        container.add(animation);
    }

    public void actionPerformed(ActionEvent event) {

        if (event.getSource() == buttons[0]) {

            animation.playAnimation();
            buttons[0].setEnabled(false);
            buttons[1].setEnabled(true);
            buttons[2].setEnabled(false);
        }
        else if (event.getSource() == buttons[1]) {

            animation.stopAnimation();
            buttons[0].setEnabled(true);
            buttons[1].setEnabled(false);
            buttons[2].setEnabled(true);
        }
        else if (event.getSource() == buttons[2]) {

            rand.setText("Max : " + animation.random());
            animation.loadImage();
            buttons[0].setEnabled(true);
            buttons[1].setEnabled(true);
            buttons[2].setEnabled(false);
        }

    }

}