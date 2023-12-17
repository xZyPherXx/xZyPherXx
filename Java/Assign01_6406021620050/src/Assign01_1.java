/* Id    : 64-060216-2005-0
 * Name : Mr. Punnawat Pinsaeng
 * Room : 1 RA
 * File Name : Assign01_1.java
*/

import java.util.*;

public class Assign01_1 {

    public static void main(String [] args) {

        Scanner scan = new Scanner(System.in);
        double celsius , fahrenheit;

        System.out.println("Celsius To Fahrenheit");

        System.out.print("Enter Celsius : ");
        celsius = scan.nextDouble();

        fahrenheit = (9.0 / 5.0) * celsius + 32;

        System.out.format("Fahrenheit : %.2f" , fahrenheit);

        scan.close();
    }

}