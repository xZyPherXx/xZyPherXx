/* Id    : 64-060216-2005-0
 * Name : Mr. Punnawat Pinsaeng
 * Room : 1 RA
 * File Name : Assign01_3.java
*/

import java.util.*;

public class Assign01_3 {

    public static void main(String [] args) {

        Scanner scan = new Scanner(System.in);
        final double principle;
        double money , interrest , interrestRate;

        System.out.print("Interest 4 Years.\n");

        System.out.print("Enter Your Principal : ");
        principle = scan.nextDouble();

        System.out.print("Enter Your Interst Rate : ");
        interrestRate = scan.nextDouble();

        interrest = principle * (interrestRate / 100);

        System.out.println("Year 1 : " + String.format("%.2f" , (money = principle + interrest)));
        System.out.println("Year 2 : " + String.format("%.2f" , (money += (money * (interrestRate / 100)))));
        System.out.println("Year 3 : " + String.format("%.2f" , (money += (money * (interrestRate / 100)))));
        System.out.println("Year 4 : " + String.format("%.2f" , (money += (money * (interrestRate / 100)))));

        scan.close();
    }

}