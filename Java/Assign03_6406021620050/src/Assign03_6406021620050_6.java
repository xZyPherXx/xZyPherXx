/* Id : 64-060216-2005-0
 * name : Mr. Punnawat Pinsaeng
 * Room : 1 RA
 * File Name : Assign03_6406021620050_6.java
 */
import java.util.*;

public class Assign03_6406021620050_6 {

    int line , type;
    String character;

    public static void main(String [] args) {

        new Assign03_6406021620050_6();
    }

    public Assign03_6406021620050_6() {

        Scanner scan = new Scanner(System.in);

        System.out.print("Input number line : ");
        line = scan.nextInt();

        System.out.print("Input character : ");
        character = scan.next();

        System.out.print("Input type : ");
        type = scan.nextInt();

        scan.close();

        checkData();
    }

    public void checkData() {

        if (line <= 10) {

            if (type == 1) {

                charType1();
            }
            else if (type == 2) {

                charType2();
            }
            else {

                System.out.println("Wrong input!");
            }

        }
        else {

            System.out.println("Wrong Input!");
        }

    }

    public void charType1() {

        for (int count = 0 ; count <= line ; count++) {

            for (int index = 0 ; index < count ; index++) {

                System.out.print(character);
            }

            System.out.println();
        }

    }

    public void charType2() {

        for (int count = line ; count >= 0 ; count--) {

            for (int index = 0 ; index < count ; index++) {

                System.out.print(character);
            }

            System.out.println();
        }

    }
    
}