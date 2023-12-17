/* Id : 64-060216-2005-0
 * name : Mr. Punnawat Pinsaeng
 * Room : 1 RA
 * File Name : Assign03_6406021620050_2.java
 */
import java.util.*;

public class Assign03_6406021620050_2 {

    float data;

    public static void main(String[] args) {

        new Assign03_6406021620050_2();
    }

    public Assign03_6406021620050_2() {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter floating-point number : ");
        data = scan.nextFloat();
        scan.close();

        if (data >= 0.1111 && data <= 0.9999) {

            resultData(data);
        }
        else {

            System.out.println("Number not changed");
        }

    }

    public void resultData(float data) {

        int digit , result , sum = 0;
        String status = "" , tempData = String.valueOf(data);

        tempData = tempData.replace(".", "");

        result = Integer.parseInt(String.valueOf(tempData.charAt(0)));

        for (int count = 1 ; count < tempData.length() ; count++) {

            digit = Integer.parseInt(String.valueOf(tempData.charAt(count)));

            if (digit % 2 == 0) {

                sum = result + digit;
                status = " + ";
            }
            else {

                sum = result - digit;
                status = " - ";
            }

            System.out.println("Integer number " + (count) + " = " + digit);
            System.out.println("Sum = " + result + status + digit + " = " + sum);
            result = sum;
        }

    }

}