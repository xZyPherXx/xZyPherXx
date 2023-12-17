/* Id : 64-060216-2005-0
 * name : Mr. Punnawat Pinsaeng
 * Room : 1 RA
 * File Name : Assign03_6406021620050_5.java
 */
import java.util.*;

public class Assign03_6406021620050_5 {

    long data;
    int countZero = 0 , countOdd = 0 , countEven = 0;

    public static void main(String [] args) {

        new Assign03_6406021620050_5();
    }
    
    public Assign03_6406021620050_5() {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter positive number : ");
        data = scan.nextLong();

        scan.close();

        countData();        
        System.out.println("Odd digit = " + countOdd);
        System.out.println("Even digit = " + countEven);
        System.out.println("Zero digit = " + countZero);
    }

    public void countData() {

        String dataLength = Long.toString(data);

        for (int count = 0 ; count < dataLength.length() ; count++) {

            int index = Integer.parseInt(String.valueOf(dataLength.charAt(count)));

            if (index == 0) {

                countZero++;
            }
            else if (index % 2 == 0) {

                countEven++;
            }
            else {

                countOdd++;
            }

        }

    }

}