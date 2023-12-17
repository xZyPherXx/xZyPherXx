/* ID   :   64-060216-2005-0
 * Name :   Mr. Punnawat Pinsaeng
 * Room :   1 RA
 * File Name : Assign04_6406021620050_04.java
*/
import javax.swing.*;

public class Assign04_6406021620050_04 {

    String data , display;
    int upper = 0 , lower = 0 , digit = 0 , symbol = 0;

    public static void main(String[] args) {
        
        new Assign04_6406021620050_04();
    }

    public Assign04_6406021620050_04() {

        data = JOptionPane.showInputDialog("Enter text : ");

        if (data != null && !data.isEmpty()) {

            countData();
            display();
        }
        else {

            JOptionPane.showMessageDialog(null , "No Input text !" , "Error Message" , JOptionPane.ERROR_MESSAGE);
        }

    }

    public void countData() {

        for(int index = 0 ; index < data.length() ; index++) {
            
            if (Character.isUpperCase(data.charAt(index))) {

                upper++;
            }
            else if (Character.isLowerCase(data.charAt(index))) {

                lower++;
            }
            else if (Character.isDigit(data.charAt(index))) {

                digit++;
            }
            else {

                symbol++;
            }

        }

    }

    public void display() {

        display = "TEXT : " + data + "\nText Length : " + data.length() + "\nUpper Character : " + upper + "\nLower Character : " + lower + "\nDigit Character : " + digit + "\nSymbol Character : " + symbol;
        JOptionPane.showMessageDialog(null , display);
    } 
}