/* Id    : 64-060216-2005-0
 * Name : Mr. Punnawat Pinsaeng
 * Room : 1 RA
 * File Name : Assign01_4.java
*/

import java.util.*;

public class Assign01_4 {

    public static void main(String [] args) {

        Scanner scan = new Scanner(System.in);

        int data , tempData_1 , tempData_2 , tempData_3;
        System.out.print("Enter Number : ");
        data = scan.nextInt();
        
        tempData_1 = data / 100;
        tempData_2 = data / 10;
        tempData_2 %= 10;
        tempData_3 = data % 10;

        System.out.println("Sumation of Digit : " + (tempData_1 + tempData_2 + tempData_3));

        scan.close();
    }

}