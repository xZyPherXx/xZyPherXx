/* Id   : 64-060216-2005-0 
 * Name : Mr.Punnawat Pinsaeng
 * Room : 1-RA
 * File Name : Assign08_Paint.java
 */

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.event.*;
import java.awt.*;

public class Assign08_Paint extends JFrame implements ActionListener {

    private Container container;
    private JPanel panels[] = new JPanel[2];
    private JButton buttons[] = new JButton[4];
    private Font font = new Font("Arial" , Font.BOLD , 14);
    private String type = "";

    public static void main(String[] args) {
        
        new Assign08_Paint(1024 , 768);
    }

    public Assign08_Paint(int width , int height) {

        super("Paint 0.1");
        container = getContentPane();
        container.setLayout(new FlowLayout());

        buttonChoice();
        panelPaint();

        setSize(width , height);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private void buttonChoice() {

        panels[0] = new JPanel();
        panels[0].setPreferredSize(new Dimension(1024 , 40));

        String datas[] = {"Line" , "Rectangle" , "Circle" , "Exit"};
        for (int index = 0 ; index < buttons.length ; index++) {

            buttons[index] = new JButton(datas[index]);
            buttons[index].setFont(font);
            buttons[index].addActionListener(this);
            panels[0].add(buttons[index]);
        }

        container.add(panels[0]);
    }

    private void panelPaint() {

        panels[1] = new JPanel();
        panels[1].setPreferredSize(new Dimension(920 , 600));
        panels[1].setBorder(new LineBorder(Color.BLACK , 2));
        panels[1].setEnabled(false);;
        container.add(panels[1]);
    }

    public void paint(Graphics display) {
        
        int r = (int)(Math.random() * 256) , g = (int)(Math.random() * 256) , b = (int)(Math.random() * 256);
        super.paint(display);

        switch (type) {

            case "Line" : Line line = new Line(r , g ,b); line.displayLine(display); break;
            case "Rectangle" : Rectangle rectangle = new Rectangle(r , g , b); rectangle.displayRectangle(display); break;
            case "Circle" : Circle circle = new Circle(r , g , b); circle.displayCircle(display); break;
        }

    }

    public void actionPerformed(ActionEvent event) {

        repaint();
        if (event.getSource() == buttons[0]) {

            type = "Line";
        }
        else if (event.getSource() == buttons[1]) {

            type = "Rectangle";
        }
        else if (event.getSource() == buttons[2]) {

            type = "Circle";
        }
        else if (event.getSource() == buttons[3]) {

            System.exit(0);
        }

    }

}