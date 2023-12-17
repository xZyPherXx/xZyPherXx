/* Id   : 64-060216-2005-0 
 * Name : Mr.Punnawat Pinsaeng
 * Room : 1-RA
 * File Name : Circle.java
*/

import java.awt.*;

public class Circle extends Point {

    private int radius , y;
    
    public Circle(int posX1 , int posY1 , int posX2 , int posY2) {

        super(posX1, posY1, posX2, posY2);
        setRadius();
        setY();
    }

    public void setRadius() {

        radius = Math.abs(((getX2() - getX1()) / 2) * 2);
    }

    private void setY() {

        y = getY1() - (getRadius() / 2);
    }

    public int getRadius() {

        return radius;
    }

    public int getY() {

        return y;
    }

    public void drawCircle(Graphics display) {

        display.drawOval(getX1(), getY() , getRadius() , getRadius());
    }

}