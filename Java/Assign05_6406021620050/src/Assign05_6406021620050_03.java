/* Id   :   64-060216-2005-0
 * Name :   Mr. Punnawat Pinsaeng
 * Room :   1 RA
 *  File Name : Assign05_6406021620050_03.java
 */
import javax.swing.*;

public class Assign05_6406021620050_03 {

    public static void main(String [] args) {
        
        Assign05_6406021620050_03 object = new Assign05_6406021620050_03();
        object.mainMenu();
    }

    public void mainMenu() {

        String choiceMethod , choiceText;
        long dataDigit = 0;

        do {

            choiceText = ":: Main Menu ::";
            choiceText += "\n=======================";
            choiceText += "\n A. Get Integer Number.";
            choiceText += "\n B. Summation of Digit.";
            choiceText += "\n C. Print Reverse Number.";
            choiceText += "\n D. Count Digit.";
            choiceText += "\n E. Exit.";
            choiceText += "\nEnter Choice : ";

            choiceMethod = JOptionPane.showInputDialog(choiceText);

            if (choiceMethod != null) {

                if (!choiceMethod.isEmpty() && !choiceMethod.isBlank()) {

                    switch (choiceMethod.toUpperCase()) {

                        case "A" : dataDigit = getNumber(); break;
                        case "B" : sumDigit(dataDigit); break;
                        case "C" : printReverse(dataDigit); break;
                        case "D" : contDigit(dataDigit); break;
                        case "E" :

                            JOptionPane.showMessageDialog(null , "Now, Exit program...");
                            System.exit(0);

                        default :

                            showMessage(0);
                            break;
                    }

                }
                else {

                    showMessage(1);
                }

            }

        } while(choiceMethod != "E" && choiceMethod != null);

    }

    public long getNumber() {

        String dataInput;
        long data = 0;
        boolean checkDataInput = false;

        dataInput = JOptionPane.showInputDialog("Enter number : ");

        if (dataInput != null && !dataInput.isEmpty()) {

            for (int index = 0 ; index < dataInput.length() ; index++) {

                if (Character.isDigit(dataInput.charAt(index))) {

                    checkDataInput = true;
                }
                else {

                    break;
                }

            }

            if (checkDataInput) {

                data = Long.parseLong(dataInput);

                if (data > 0) {

                    JOptionPane.showMessageDialog(null , "Your input : " + data);
                    return data;
                }
                else {

                    showMessage(2);
                }

            }
            else {

                showMessage(2);
            }

        }
        else {

            showMessage(3);
        }

        return data;
    }

    public void sumDigit(long data) {

        String dataLong = Long.toString(data);
        int sumData = 0;

        for (int count = 0 ; count < dataLong.length() ; count++) {
        
            sumData += Integer.parseInt(String.valueOf(dataLong.charAt(count)));
        }

        JOptionPane.showMessageDialog(null , "\nYour enter number : " + data + "\nSummation of digit : " + sumData + "\n");
    }

    public void printReverse(long data) {

        String reverse = String.valueOf(data) , reverseData = "";

        for (int count = reverse.length() - 1 ; count >= 0 ; count--) {

            reverseData += reverse.charAt(count);
        }

        JOptionPane.showMessageDialog(null , "Your enter number : " + data + "\nReverse number : " + reverseData);
    }

    public void contDigit(long data) {

        String countData = String.valueOf(data);
        JOptionPane.showMessageDialog(null , "\nYour number : " + data + "\nThis number has " + countData.length() + " digits.");
    }

    public void showMessage(int choice) {

        switch (choice) {

            case 0 : JOptionPane.showMessageDialog(null , "No this choice, Please input again."); break;
            case 1 : JOptionPane.showMessageDialog(null , "Please Input Again."); break;
            case 2 : JOptionPane.showMessageDialog(null , "Wrong Input."); break;
            case 3 : JOptionPane.showMessageDialog(null , "No input, Try again."); break;
        }

    }

}