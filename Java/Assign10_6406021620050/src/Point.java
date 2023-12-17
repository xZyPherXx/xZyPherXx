/* Name : Mr.Punnawat Pinsaeng
 * ID   : 64-060-216-2005-0
 * Room : 1-RA
 * File : Point.java
*/

import java.util.Random;

public class Point {
 
    private int x , y;
    private Random rand = new Random();

    public Point() {

        setX(-110);
        setY(10 + rand.nextInt(500));
    }

    private void setX(int x) {

        this.x = x;
    }

    private void setY(int y) {

        this.y = y;
    }

    public int getX() {

        return this.x;
    }

    public int getY() {

        return this.y;
    }

}