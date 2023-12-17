/* Id : 64-060216-2005-0
 * name : Mr. Punnawat Pinsaeng
 * Room : 1 RA
 * File Name : Assign03_6406021620050_4.java
 */
import java.util.*;

public class Assign03_6406021620050_4 {

    float principle , interestRate , interest;
    int year , count = 0;

    public static void main(String [] args) {

        new Assign03_6406021620050_4();
    }

    public Assign03_6406021620050_4() {

        Scanner scan = new Scanner(System.in);

        System.out.print("Program Calculate Money\n+++++++++++++++++++++++\n");

        System.out.print("Enter principle : ");
        principle = scan.nextFloat();

        System.out.print("Enter interest rate : ");
        interestRate = scan.nextFloat();

        System.out.print("Enter year : ");
        year = scan.nextInt();

        scan.close();

        display();
    }

    public void display() {

        System.out.println("\nYear  Principle   Interest      Total");
        System.out.println("========================================");

        while (count != year) {

            System.out.println("  " + (count + 1) + "   " + String.format("%.2f", principle) + "\t  " + String.format("%.2f", (interest = principle * (interestRate / 100))) + "\t\t" + String.format("%.2f", (principle += interest)));
            count++;
        }

    }

}