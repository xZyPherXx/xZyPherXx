/* Id : 64-060216-2005-0
 * name : Mr. Punnawat Pinsaeng
 * Room : 1 RA
 * File Name : Assign03_6406021620050_1.java
 */
import java.util.*;

public class Assign03_6406021620050_1 {

    int data , tempData;
    String text;
    public static void main(String [] args) {

        new Assign03_6406021620050_1();
    }

    public Assign03_6406021620050_1() {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter integer number(4 digit) : ");
        data = scan.nextInt();

        System.out.println(digit1());
        System.out.println(digit2());
        System.out.println(digit3());
        System.out.println(digit4());
        System.out.println(display());

        scan.close();
    }

    public String digit1() {

        tempData = data % 10;
        text = (tempData % 2 == 0) ? " is Even" : " is Odd";
        
        return tempData + text;
    }

    public String digit2() {

        tempData = data % 100;
        tempData /= 10;
        text = (tempData % 2 == 0) ? " is Even" : " is Odd";

        return tempData + text;
    }

    public String digit3() {

        tempData = data % 1000;
        tempData /= 100;
        text = (tempData % 2 == 0) ? " is Even" : " is Odd";

        return tempData + text;
    }

    public String digit4() {

        tempData = data / 1000;
        text = (tempData % 2 == 0) ? " is Even" : " is Odd";

        return tempData + text;
    }

    public String display() {

        text = (data % 2 == 0) ? " is Even" : " is Odd";

        return "Number " + data + text;
    }

}