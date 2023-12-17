/* Id   : 64-060216-2005-0 
 * Name : Mr.Punnawat Pinsaeng
 * Room : 1-RA
 * File Name : Rectangle.java
 */

import java.awt.*;

public class Rectangle {

    private int red , green , blue;

    public Rectangle(int R , int G , int B) {

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
    
    public void displayRectangle(Graphics display) {

        int x1 = 100 + (int)(Math.random() * 460) , x2 = 100 + (int)(Math.random() * 460) , y1 = 100 + (int)(Math.random() * 300) , y2 = 100 + (int)(Math.random() * 300);

        if (x1 + x2 <= 920 && y1 + y2 <= 600) {

            Point pos = new Point(x1 , y1 , x2 , y2);

            display.setColor(new Color(getRed() , getGreen() , getBlue()));
            display.drawRect(pos.getX1() , pos.getY1() , pos.getX2() , pos.getY2());
        }
        else {

            displayRectangle(display);
        }

    }

}