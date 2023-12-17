/* Id    : 64-060216-2005-0
 * Name : Mr. Punnawat Pinsaeng
 * Room : 1 RA
 * File Name : Assign01_5.java
*/

import java.util.*; 

public class Assign01_5 {
    
    public static void main(String [] args) {

        Scanner scan = new Scanner(System.in);

        float data , tempData_1 , tempData_2 , tempData_3;

        System.out.print("Enter Floating Number : ");
        data = scan.nextFloat();

        tempData_1 = data * 100;
        tempData_1 /= 10;

        tempData_2 = data * 100;
        tempData_2 %= 10;

        tempData_3 = data * 1000;
        tempData_3 %= 10;

        System.out.println("Decimal Number #1 : " + (int)tempData_1);
        System.out.println("Decimal Number #2 : " + (int)tempData_2);
        System.out.println("Decimal Number #3 : " + (int)tempData_3);

        scan.close();
    }

}