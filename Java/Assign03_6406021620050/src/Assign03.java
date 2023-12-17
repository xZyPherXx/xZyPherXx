
import java.util.*;

public class Assign03 {
    
    double data;
    int tempData , tempSum;

    public static void main(String [] args) {

        new Assign03();
    }
    
    public Assign03(){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter floating-point number : ");
        data = scan.nextDouble();

        scan.close();

        checkData();
    }

    public void checkData() {

        if (data >= 0.1111 && data <= 0.9999) {

            //Output 1
            System.out.println("Integer number 1 = " + (tempData = (int)(data * 100) / 10));
            if ((int)tempData % 2 == 0) {

                System.out.println("Sum = " + (int)data + " + " + tempData + " = " + (tempSum = (int)data + tempData));
            }
            else {

                System.out.println("Sum = " + (int)data + " - " + tempData + " = " + (tempSum = (int)data - tempData));
            }

            //Output 2
            System.out.println("Integer number 2 = " + (tempData = (int)(data * 100) % 10));
            if (tempData % 2 == 0) {

                System.out.println("Sum = " + tempSum + " + " + tempData + " = " + (tempSum += tempData));
            }
            else {

                System.out.println("Sum = " + tempSum + " - " + (tempData) + " = " + (tempSum -= tempData));
            }

            //Output 3
            System.out.println("Integer number 3 = " + (tempData = (int)(data * 1000) % 10));
            if (tempData % 2 == 0) {

                System.out.println("Sum = " + tempSum + " + " + tempData + " = " + (tempSum += tempData));
            }
            else {

                System.out.println("Sum = " + tempSum + " - " + tempData + " = " + (tempSum -= tempData));
            }

            //Output 4
            System.out.println("Integer number 4 = " + (tempData = (int)(data * 10000) % 10));
            if (tempData % 2 == 0) {

                System.out.println("Sum = " + tempSum + " + " + tempData + " = " + (tempSum + tempData));
            }
            else {

                System.out.println("Sum = " + tempSum + " - " + tempData + " = " + (tempSum - tempData));
            }

        }
        else {

            System.out.println("Number not changed");
        }

    }

}