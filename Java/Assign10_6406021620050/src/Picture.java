/* Name : Mr.Punnawat Pinsaeng
 * ID   : 64-060-216-2005-0
 * Room : 1-RA
 * File : Picture.java
*/

import javax.swing.ImageIcon;

public class Picture extends Point {

    private ImageIcon image;

    public Picture() {

        setImg();
    }

    private void setImg() {

        this.image = new ImageIcon("image/ufo.png"); 
    }

    public ImageIcon getImg() {

        return this.image;
    }

}