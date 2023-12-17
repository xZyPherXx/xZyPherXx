/* ID   :   64-060216-2005-0
 * Name :   Mr. Punnawat Pinsaeng
 * Room :   1 RA
 * File Name : Assign04_6406021620050_01.java
*/
import java.util.*;

public class Assign04_6406021620050_01 {

    double netIncome = 0 , taxRate;
    String text;

    public static void main(String [] args) {
        
        new Assign04_6406021620050_01();
    }

    public Assign04_6406021620050_01() {

        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.print("Enter your income( < 0 - exit) : ");
            netIncome = scan.nextDouble();

            if (netIncome != -1) {

                text = "Net Income : " + String.format("%,.2f" , netIncome) + "\n";
                text += "Tax Rate(%) : " + (taxRate = tax(netIncome)) + "%\n";
                text += "Amount Tax : " + String.format("%,.2f" , (netIncome * taxRate) / 100) + "\n";
                
                System.out.println(text);
            }
            else {

                System.out.println("Exit Program...");
                scan.close();
                System.exit(0);
            }

        }

    }

    static double tax(double data) {

        double taxRate;

        if (data <= 150000) {

            taxRate = 0;
        }
        else if (data <= 300000) {

            taxRate = 2.5;
        }
        else if (data <= 500000) {

            taxRate = 4.0;
        }
        else if (data <= 800000) {

            taxRate = 5.5;
        }
        else if (data <= 1000000) {

            taxRate = 7.5;
        }
        else {

            taxRate = 10.0;
        }

        return taxRate;
    }

}