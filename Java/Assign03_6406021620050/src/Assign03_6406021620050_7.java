/* Id : 64-060216-2005-0
 * name : Mr. Punnawat Pinsaeng
 * Room : 1 RA
 * File Name : Assign03_6406021620050_7.java
 */
import java.util.*;

public class Assign03_6406021620050_7 {

    int data;
    boolean prime = true;
    String status;

    public static void main(String [] args) {

        new Assign03_6406021620050_7();  
    }

    public Assign03_6406021620050_7() {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter positive number : ");
        data = scan.nextInt();

        scan.close();

        System.out.println(checkPrime());
    }

    public String checkPrime() {

        int limit = (int)Math.sqrt(data);

        for (int count = 2 ; count <= limit ; count++) {

           if (data % count == 0) {
            
                prime = false;
                break;
            }

        }

        status = prime ? " is prime " : " is not prime ";
        
        return "Number " + data + status + "number.";
    }

}