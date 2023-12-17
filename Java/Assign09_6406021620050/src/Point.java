/* Id   : 64-060216-2005-0 
 * Name : Mr.Punnawat Pinsaeng
 * Room : 1-RA
 * File Name : Point.java
*/

public class Point {

    private int x1 , x2 , y1 , y2;

    public Point(int posX1 , int  posY1 , int  posX2 , int  posY2) {

        setX1(posX1);
        setY1(posY1);
        setX2(posX2);
        setY2(posY2);
    }

    private void setX1(int posX1) {

        this.x1 = posX1;
    }

    private void setY1(int posY1) {

        this.y1 = posY1;
    }

    private void setX2(int posX2) {

        this.x2 = posX2;
    }

    private void setY2(int posY2) {

        this.y2 = posY2;
    }

    public int getX1() {

        return this.x1;
    }

    public int getY1() {

        return this.y1;
    }

    public int getX2() {

        return this.x2;
    }

    public int getY2() {

        return this.y2;
    }

}