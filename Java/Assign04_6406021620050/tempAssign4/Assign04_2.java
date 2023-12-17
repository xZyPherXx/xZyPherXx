
import java.util.*;

public class Assign04_2 {

    public static void main(String [] args) {
        
        new Assign04_2();
    }

    public Assign04_2() {

        Scanner scan = new Scanner(System.in);

        String choiceMethod;
        long dataDigit = 0;

        while (true) {

            choiceMethod = MainMenu().toUpperCase();

            switch (choiceMethod) {

                case "A" : dataDigit = GetNumber(); break;
                case "B" : SumDigit(dataDigit); break;
                case "C" : Reverse(dataDigit); break;
                case "D" : CountDigit(dataDigit); break;
                case "E" :

                    System.out.println("Exit Program...");
                    scan.close();
                    System.exit(0);
                    break;

                default :

                    System.out.println("\nWrong Input!\n");
                    break;
            }

        }

    }

    static String MainMenu() {

        Scanner scan = new Scanner(System.in);

        String choice;

        System.out.println(":: Main Menu ::");
        System.out.println("=======================");
        System.out.println(" A. Get Integer Number");
        System.out.println(" B. Summation of Digit");
        System.out.println(" C. Print Reverse Number");
        System.out.println(" D. Count Digit");
        System.out.println(" E. Exit");

        System.out.print("Enter Choice : ");
        choice = scan.nextLine();

        return choice;
    }

    static long GetNumber() {

        Scanner scan = new Scanner(System.in);

        long data;

        System.out.print("Enter long number : ");
        data = scan.nextLong();
        System.out.println();

        return data;
    }

    static void SumDigit(long data) {

        String dataLong = Long.toString(data);
        int sumData = 0;

        for (int count = 0 ; count < dataLong.length() ; count++) {
        
            sumData += Integer.parseInt(String.valueOf(dataLong.charAt(count)));
        }

        System.out.println("Your enter number : " + data + "\nSummation of digit : " + sumData + "\n");
    }

    static void Reverse(long data) {

        String reverseData = String.valueOf(data);

        System.out.println("Your enter number : " + data);
        System.out.print("Reverse number : ");

        for (int count = reverseData.length() - 1 ; count >= 0 ; count--) {

            System.out.print(reverseData.charAt(count));
        }

        System.out.print("\n\n");
    }

    static void CountDigit(long data) {

        String countData = String.valueOf(data);
        System.out.println("Your number : " + data + "\nThis number has " + countData.length() + " digits.\n");
    }

}