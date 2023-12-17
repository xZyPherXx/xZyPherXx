/* Id   : 64-060216-2005-0 
 * Name : Mr.Punnawat Pinsaeng
 * Room : 1-RA
 * File Name : Line.java
*/

import java.awt.*;

public class Line extends Point {
    
    public Line(int posX1 , int posY1 , int posX2 , int posY2) {

        super(posX1, posY1, posX2, posY2);
    }

    public void drawLine(Graphics display) {

        display.drawLine(getX1() , getY1() , getX2() , getY2());
    }

}