/* Id   : 64-060216-2005-0 
 * Name : Mr.Punnawat Pinsaeng
 * Room : 1-RA
 * File Name : Rectangle.java
*/

import java.awt.*;

public class Rectangle extends Point {

    public Rectangle(int posX1, int posY1, int posX2, int posY2) {

        super(posX1, posY1, posX2, posY2);
    }

    public void drawRectangle(Graphics display) {

        display.drawRect(getX1(), getY1(), getX2(), getY2());
    }

}
