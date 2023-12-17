
import java.util.*;

public class Assign04_4 {

    Scanner scan = new Scanner(System.in);

    int choice;

    public static void main(String [] args) {

        new Assign04_4();
    }

    public Assign04_4() {

        while (true) {

            System.out.println(":: Main Menu ::\n===================\n 1. Circle\n 2. Rectangle\n 3. Triangle\n 4. Exit");

            System.out.print("Enter Choice : ");
            choice = scan.nextInt();

            switch(choice) {

                case 1 : Area(0.0); break;
                case 2 : Area(0.0 , 0.0); break;
                case 3 : Area(0.0 , 0.0 , 0.5); break;
                case 4 :

                    System.out.println("Exit Program...");
                    scan.close();
                    System.exit(0);

                default : System.out.println("\nWrong Input!\n");
            }

        }

    }

    public void Area(double radius) {

        System.out.print("\nEnter radius : ");
        radius = scan.nextDouble();

        System.out.println("Calculate area of circle.\nRadius of Circle = " + radius + "\nArea of Circle = " + String.format("%.4f" , 3.1415f * (radius * radius)) + "\n");
    }

    public void Area(double width , double length) {

        System.out.print("\nEnter width : ");
        width = scan.nextDouble();

        System.out.print("Enter length : ");
        length = scan.nextDouble();

        System.out.println("Calculate area of rectangle.\nWidth of Rectangle = " + width + "\nLength of Rectangle = " + length
        + "\nArea of Rectangle = " + String.format("%.1f" , width * length) + "\n");
    }

    public void Area(double base , double height , double cal) {

        System.out.print("\nEnter base : ");
        base = scan.nextDouble();

        System.out.print("Enter height : ");
        height = scan.nextDouble();

        System.out.println("Calculate area of triangle.\nBase of triangle = " + base + "\nHeight of triangle = " + height
        + "\nArea of triangle = " + String.format("%.1f" , (base * height) * cal) + "\n");
    }

}