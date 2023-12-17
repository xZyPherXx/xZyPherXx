/* Id   : 64-060216-2005-0 
 * Name : Mr.Punnawat Pinsaeng
 * Room : 1-RA
 * File Name : Line.java
 */

import java.awt.*;

public class Line {

    private int red , green , blue;

    public Line(int R , int G , int B) {

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
    
    public void displayLine(Graphics display) {

        int x1 = 100 + (int)(Math.random() * 460) , x2 = 100 + (int)(Math.random() * 870) , y1 = 100 + (int)(Math.random() * 550) , y2 = 100 + (int)(Math.random() * 550);

        Point pos = new Point(x1 , y1 , x2 , y2);

        display.setColor(new Color(getRed() , getGreen() , getBlue()));
        display.drawLine(pos.getX1() , pos.getY1() , pos.getX2() , pos.getY2());
    }

}