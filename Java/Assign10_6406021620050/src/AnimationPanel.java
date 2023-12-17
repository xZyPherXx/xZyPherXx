/* Name : Mr.Punnawat Pinsaeng
 * ID   : 64-060-216-2005-0
 * Room : 1-RA
 * File : AnimationPanel.java
*/

import java.awt.event.*;
import java.util.Random;
import java.awt.*;
import javax.swing.*;

public class AnimationPanel extends JPanel implements ActionListener {

    private Random rand = new Random();
    private ImageIcon images[];
    private Timer time;
    private int random , datas[][];

    public AnimationPanel(int width , int height) {

        setPreferredSize(new Dimension(width , height));
        setBorder(BorderFactory.createLineBorder(Color.BLUE , 2));
        time = new Timer(60 , this);
    }

    public void loadImage() {

        repaint();
        images = new ImageIcon[random];
        datas = new int[3][random];

        for (int index = 0 ; index < random ; index++) {

            Picture pic = new Picture();
            datas[0][index] = 5 + rand.nextInt(12);
            datas[1][index] = pic.getX();
            datas[2][index] = pic.getY();
            images[index] = pic.getImg();
        }

    }

    public int random() {

        return random = 1 + rand.nextInt(20);
    }
    
    public void playAnimation() {

        time.start();
    }

    public void stopAnimation() {

        time.stop();
    }

    public void actionPerformed(ActionEvent event) {

        setBorder(BorderFactory.createLineBorder(Color.BLUE , 2));
        paintComponent(getGraphics());
    }

    public void paintComponent(Graphics display) {

        super.paintComponent(display);
        for (int index = 0 ; index < random ; index++) {

            if (datas[1][index] < 950) {

                images[index].paintIcon(this , getComponentGraphics(display) , datas[1][index] += datas[0][index] , datas[2][index]);
            }
            else {

                datas[1][index] = -100;
            }

        }

    }

}