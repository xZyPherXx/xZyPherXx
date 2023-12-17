/* Id   : 64-060216-2005-0 
 * Name : Mr.Punnawat Pinsaeng
 * Room : 1-RA
 * File Name : Circle.java
 */

import java.awt.*;

public class Circle {
    
    private int red , green , blue;

    public Circle(int R , int G , int B) {

        setRed(R);
        setGreen(G);
        setBlue(B);
    }

    private void setRed(int R) {

        this.red = R;
    }

    private void setGreen(int G) {

        this.green = G;
    }

    private void setBlue(int B) {

        this.blue = B;
    }

    private int getRed() {

        return this.red;
    }
    
    private int getGreen() {

        return this.green;
    }

    private int getBlue() {

        return this.blue;
    }

    public void displayCircle(Graphics display) {

        int size = (int)(50 + Math.random() * 100) , x = (int)(100 + Math.random() * 700) , y = (int)(100 + Math.random() * 500);

        if (x < 900 && y < 500) {

            Point pos = new Point(x , y);

            display.setColor(new Color(getRed() , getGreen() , getBlue()));
            display.drawOval(pos.getX1() , pos.getY1() , size , size);
        }
        else {

            displayCircle(display);
        }

    }

}