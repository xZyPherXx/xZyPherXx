/* ID   :   64-060216-2005-0
 * Name :   Mr. Punnawat Pinsaeng
 * Room :   1 RA
 * File Name : Assign04_6406021620050_03.java
*/
import javax.swing.*;

public class Assign04_6406021620050_03 {
    
    String startTime , endTime , tempReplaceStart , tempReplaceEnd;
    boolean checkDigit = false;

    public static void main(String [] args) { 

        new Assign04_6406021620050_03();
    }

    public Assign04_6406021620050_03() {

        startTime = JOptionPane.showInputDialog("Enter start time : ");
        endTime = JOptionPane.showInputDialog("Enter end time : ");
        checkData();
    }

    public void checkData() {

        if ((startTime != null && endTime != null)  && (!startTime.isEmpty() && !startTime.isBlank()) && (!endTime.isEmpty() && !endTime.isBlank())) {
            
            tempReplaceStart = startTime.replace(":" , "");
            tempReplaceEnd = endTime.replace(":" , "");

            for (int index = 0 ; index < tempReplaceStart.length() ; index++) {

                if(Character.isDigit(tempReplaceStart.charAt(index)) && Character.isDigit(tempReplaceEnd.charAt(index))) {

                    checkDigit = true;
                }
                else {

                    wrongMessage(0);
                }

            }

        }
        else {

            wrongMessage(1);
        }

        if (checkDigit) {

            int tempStart = Integer.parseInt(tempReplaceStart) , tempEnd = Integer.parseInt(tempReplaceEnd);

            if (tempStart < tempEnd) {

                JOptionPane.showMessageDialog(null , calTime(startTime , endTime , tempStart, tempEnd));
            }
            else {

                wrongMessage(0);
            }

        }
   
    }

    public String calTime(String start , String end , int dataStart , int dataEnd) {

        String dataString;
        int data;

        data = (dataStart > dataEnd) ? dataStart - dataEnd : dataEnd - dataStart;
        dataString = String.valueOf(data);

        return (data > 99999)

        ? "Start Time : " + start + "\nEnd Time : " + end + "\nTime used : " + dataString.charAt(0) + dataString.charAt(1) + " Hours " + dataString.charAt(2) + dataString.charAt(3)
        + " minutes " + dataString.charAt(4) + dataString.charAt(5) + " secords." 

        : "Start Time : " + start + "\nEnd Time : " + end + "\nTime used : " + dataString.charAt(0) + " Hours " + dataString.charAt(1) + dataString.charAt(2) + " minutes " 
        + dataString.charAt(3) + dataString.charAt(4) + " secords.";
    }

    public void wrongMessage(int choice) {

        switch (choice) {

            case 0 : JOptionPane.showMessageDialog(null , "Wrong Input!" , "Error Input" , JOptionPane.ERROR_MESSAGE); break;
            case 1 : JOptionPane.showMessageDialog(null , "No input Time!" , "Error Input" , JOptionPane.ERROR_MESSAGE); break;
        }

        System.exit(0);
    }

}