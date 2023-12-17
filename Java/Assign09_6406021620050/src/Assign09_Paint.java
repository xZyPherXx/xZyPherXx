/* Id   : 64-060216-2005-0 
 * Name : Mr.Punnawat Pinsaeng
 * Room : 1-RA
 * File Name : Assign09_Paint.java
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Assign09_Paint extends JFrame implements MouseMotionListener , MouseListener , KeyListener {

    String type = "Line";
    int windowWidth = 800 , windowLength = 600 , mouseX1 , mouseX2 , mouseY1 , mouseY2;

    public static void main(String [] args) {

        new Assign09_Paint(800 , 600);
    }

    public Assign09_Paint(int width , int height) {

        super("Demo Paint use Keyboard and Mouse");
        Container container = getContentPane();
        container.setLayout(new FlowLayout());

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(800 , 600));
        container.add(panel);

        addKeyListener(this);
        addMouseListener(this);
        addMouseMotionListener(this);
        setFont(new Font("Consolas" , Font.BOLD , 24));
        setSize(width , height);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void paint(Graphics display) {

        super.paint(display);
        
        display.setColor(Color.BLUE);
        display.drawString("Shape : " + type , 10 , 55);

        switch (type) {

            case "Line" : Line line = new Line(mouseX1 , mouseY1 , mouseX2 , mouseY2); line.drawLine(display); break;
            case "Rectangle" : ; Rectangle rectangle = new Rectangle(mouseX1 , mouseY1 , mouseX2 - mouseX1 , mouseY2 - mouseY1); rectangle.drawRectangle(display); break;
            case "Circle" : ; Circle circle = new Circle(mouseX1 , mouseY1 , mouseX2 , mouseX2); circle.drawCircle(display); break;
        }

    }

    public void mouseDragged(MouseEvent event) {

        mouseX2 = event.getX();
        mouseY2 = event.getY();
        repaint();
    }

    public void mouseMoved(MouseEvent event) {

    }

    public void mouseClicked(MouseEvent event) {

    }

    public void mousePressed(MouseEvent event) {

        mouseX1 = event.getX();
        mouseY1 = event.getY();
    }

    public void mouseReleased(MouseEvent event) {
        
    }

    public void mouseEntered(MouseEvent event) {

    }

    public void mouseExited(MouseEvent event) {

    }

    public void keyPressed(KeyEvent event) {

        repaint();
        resetPoint();

        if (event.getKeyChar() == 'l') {

            type = "Line"; 
        }

        else if (event.getKeyChar() == 'r') {

            type = "Rectangle";
        }

        else if (event.getKeyChar() == 'c') {

            type = "Circle";
        }

    }

    public void keyReleased(KeyEvent event) {

    }

    public void keyTyped(KeyEvent event) {

    }

    private void resetPoint() {

        mouseX1 = mouseX2 = mouseY1 = mouseY2 = 0;
    }

}