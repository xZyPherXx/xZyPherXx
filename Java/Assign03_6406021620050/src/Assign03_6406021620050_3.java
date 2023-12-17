/* Id : 64-060216-2005-0
 * name : Mr. Punnawat Pinsaeng
 * Room : 1 RA
 * File Name : Assign03_6406021620050_3.java
 */
import java.util.*;

public class Assign03_6406021620050_3 {

    double sale , commission , tempCommission;

    public static void main(String [] args) {

        new Assign03_6406021620050_3();
    }

    public Assign03_6406021620050_3() {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter sale amount : ");
        sale = scan.nextDouble();

        scan.close();

        System.out.println("You got rate = " + (tempCommission = (int)checkCommission((int)sale)) + "%");
        System.out.println("Your sale " + (int)sale + ", Commission = " + (int)(sale * tempCommission) / 100);
    }

    public double checkCommission(int data) {

        if (data <= 10000) {

            commission = 0.0;
        }
        else if (data <= 20000) {

            commission = 1.5;
        }
        else if (data <= 40000) {

            commission = 2.75;
        }
        else if (data <= 60000) {

            commission = 5.0;
        }
        else if (data <= 80000) {

            commission = 7.0;
        }
        else if (data <= 100000) {

            commission = 9.0;
        }
        else {

            commission = 10.0;
        }
        
        return commission;
    }
    
}