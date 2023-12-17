/* Id   :   64-060216-2005-0
 * Name :   Mr. Punnawat Pinsaeng
 * Room :   1 RA
 *  File Name : Assign05_6406021620050_01.java
 */
import java.util.*;

public class Assign05_6406021620050_01 {

    static Scanner javain = new Scanner(System.in);
    static double salary = 0 , taxRate , income , netIcome , taxDeducion = 60000 , amountTax;
    static String report;
    
    public static void main(String[] args) {

        Assign05_6406021620050_01.start();
    }

    static void start() {

        getSalary();
    }

    static void getSalary() {

        while(salary != -1) {

            System.out.print("Enter your salary ( -1 to exit) : ");
            salary = javain.nextDouble();

            if (salary > 0) {

                checkTaxRate(salary);
                report();
            }

        }

        System.out.println("Exit Program...");
        javain.close();
    }

    static double checkTaxRate(double salary) {

        int years = 12;
        income = salary * years;
        netIcome = income - taxDeducion;

        if (netIcome <= 150000) {

            taxRate = 0;
        }
        else if (netIcome <= 300000) {

            taxRate = 2.5;
        }
        else if(netIcome <= 500000) {

            taxRate = 4.0;
        }
        else if (netIcome <= 800000) {

            taxRate = 5.5;
        }
        else if (netIcome <= 1000000) {

            taxRate = 7.5;
        }
        else if (netIcome <= 1500000) {

            taxRate = 10.0;
        }
        else {

            taxRate = 12.5;
        }

        return taxRate;
    }

    static void report() {

        report =  "\nReport Information.";
        report += "\nIncome = " + String.format("%,.2f" , income);
        report += "\nTax Deduction = " + String.format("%,.2f" , taxDeducion);
        report += "\nNet Income : " + String.format("%,.2f" , netIcome);
        report += "\nTax Rate(%) : " + taxRate + "%";
        report += "\nAmount Tax : " + String.format("%,.2f" , netIcome * (taxRate / 100)) + "\n";

        System.out.println(report);
    }

}