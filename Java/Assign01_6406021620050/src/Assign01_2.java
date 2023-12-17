/* Id    : 64-060216-2005-0
 * Name : Mr. Punnawat Pinsaeng
 * Room : 1 RA
 * File Name : Assign01_2.java
*/

import java.util.*;

public class Assign01_2 {

    public static void main(String [] args) {

        Scanner scan = new Scanner(System.in);
        float celsius , fahrenheit;

        System.out.println("Fahrenheit To Celsius");

        System.out.print("Enter Fahrenheit : ");
        fahrenheit = scan.nextFloat();

        celsius = 5.0f * (fahrenheit - 32) / 9.0f;

        System.out.format("Celsius : %.2f" , celsius);

        scan.close();
    }

}