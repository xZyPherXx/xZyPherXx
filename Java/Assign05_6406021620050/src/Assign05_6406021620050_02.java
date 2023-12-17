/* Id   :   64-060216-2005-0
 * Name :   Mr. Punnawat Pinsaeng
 * Room :   1 RA
 *  File Name : Assign05_6406021620050_02.java
 */
import java.util.*;

public class Assign05_6406021620050_02 {

    Scanner javain = new Scanner(System.in);

    public static void main(String [] args) {
        
        Assign05_6406021620050_02 object = new Assign05_6406021620050_02();
        object.mainMenu();
    }

    public void mainMenu() {

        String choiceMethod;
        long dataDigit = 0;

        do {

            System.out.println("::     Main Menu     ::");
            System.out.println("=======================");
            System.out.println(" A. Get Integer Number.");
            System.out.println(" B. Summation of Digit.");
            System.out.println(" C. Print Reverse Number.");
            System.out.println(" D. Count Digit.");
            System.out.println(" E. Exit.");
    
            System.out.print("Enter Choice : ");
            choiceMethod = javain.next().toUpperCase();

            switch (choiceMethod) {

                case "A" : dataDigit = getNumber(); break;
                case "B" : sumDigit(dataDigit); break;
                case "C" : printReverse(dataDigit); break;
                case "D" : contDigit(dataDigit); break;
                case "E" :

                    System.out.println("Exit Program...");
                    javain.close();
                    System.exit(0);

                default :

                    System.out.println("\nWrong Input!\n");
                    break;
            }

        } while(choiceMethod != "E");

    }

    public long getNumber() {

        long data;

        System.out.print("\nEnter number : ");
        data = javain.nextLong();
        System.out.println("Your input : " + data + "\n");

        return data;
    }

    public void sumDigit(long data) {

        String dataLong = Long.toString(data);
        int sumData = 0;

        for (int count = 0 ; count < dataLong.length() ; count++) {
        
            sumData += Integer.parseInt(String.valueOf(dataLong.charAt(count)));
        }

        System.out.println("\nYour enter number : " + data + "\nSummation of digit : " + sumData + "\n");
    }

    public void printReverse(long data) {

        String reverseData = String.valueOf(data);

        System.out.println("\nYour enter number : " + data);
        System.out.print("Reverse number : ");

        for (int count = reverseData.length() - 1 ; count >= 0 ; count--) {

            System.out.print(reverseData.charAt(count));
        }

        System.out.println("\n");
    }

    public void contDigit(long data) {

        String countData = String.valueOf(data);
        System.out.println("\nYour number : " + data + "\nThis number has " + countData.length() + " digits.\n");
    }

}