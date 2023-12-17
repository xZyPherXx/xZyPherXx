/* ID   :   64-060216-2005-0
 * Name :   Mr. Punnawat Pinsaeng
 * Room :   1 RA
 * File Name : Assign04_6406021620050_03.java
*/
import javax.swing.*;

public class Assign04_6406021620050_03 {

    public static void main(String [] args) { 

        new Assign04_6406021620050_03();
    }

    public Assign04_6406021620050_03() {

        String startTime , endTime , tempReplaceStart , tempReplaceEnd;
        boolean cheackData = false;

        startTime = JOptionPane.showInputDialog("Enter start time : ");
        endTime = JOptionPane.showInputDialog("Enter end time : ");

        tempReplaceStart = startTime.replace(":" , "");
        tempReplaceEnd = endTime.replace(":" , "");

        for (int index = 0 ; index < tempReplaceStart.length() ; index++) {

            if(Character.isDigit(tempReplaceStart.charAt(index)) && Character.isDigit(tempReplaceEnd.charAt(index))) {

                cheackData = true;
            }

        }

        if (cheackData && (startTime != null && !startTime.isEmpty() && !startTime.isBlank()) && (endTime != null && !endTime.isEmpty() && !endTime.isBlank())) {

            int tempStart = Integer.parseInt(startTime.replace(":", "")) , tempEnd = Integer.parseInt(endTime.replace(":", ""));

            if (tempStart < tempEnd) {

                JOptionPane.showMessageDialog(null , calTime(startTime, endTime));
            }
            else {

                JOptionPane.showMessageDialog(null , "Wrong Input!" , "Error Input" , JOptionPane.ERROR_MESSAGE);
            }

        }
        else {

            JOptionPane.showMessageDialog(null , "No input Time!" , "Error Input" , JOptionPane.ERROR_MESSAGE);
        }

    }

    public String calTime(String start , String end) {

        String dataString , tempStart = start.replace(":" , "") , tempEnd = end.replace(":", "");
        int data , dataStart = Integer.parseInt(tempStart) , dataEnd = Integer.parseInt(tempEnd);

        data = (dataStart > dataEnd) ? dataStart - dataEnd : dataEnd - dataStart;

        dataString = String.valueOf(data);

        return (data > 99999) 

        ? "Start Time : " + start + "\nEnd Time : " + end + "\nTime used : " + dataString.charAt(0) + dataString.charAt(1) + " Hours " + dataString.charAt(2) + dataString.charAt(3)
        + " minutes " + dataString.charAt(4) + dataString.charAt(5) + " secords." 

        : "Start Time : " + start + "\nEnd Time : " + end + "\nTime used : " + dataString.charAt(0) + " Hours " + dataString.charAt(1) + dataString.charAt(2) + " minutes " 
        + dataString.charAt(3) + dataString.charAt(4) + " secords.";
    }

    /*
    public static void main(String[] args) {

        new Assign04_3();
    }

    public Assign04_3() {

        String s1 = "25:50:60" , tempData , tempData1 , tempData2 , tempData3 , tempData4 , tempData5;
        String s2 = "";

        tempData = String.valueOf(s1.charAt(0));
        tempData1 = String.valueOf(s1.charAt(1));
        tempData2 = String.valueOf(s1.charAt(2));
        tempData3 = String.valueOf(s1.charAt(3));
        tempData4 = String.valueOf(s1.charAt(4));
        tempData5 = String.valueOf(s1.charAt(5));

        s1 = s1.replace(":", "");
        for (int index = 0 ; index < s1.length() ; index++) {

            switch (index) {

                case 0 :

                    if (!tempData.equals("1") || !tempData.equals("2")) {

                        s2 = (s1.substring(0 , 0) + '2' + s1.substring(1 , 1) + '4' + s1.substring(2));
                    }
                    else if (tempData.equals("2") && !tempData1.equals("4")) {

                        s2 = (s1.substring(0 , 1) + '4' + s1.substring(2));
                    }
                    break;                
                case 2 :
                    if (!tempData2.equals("5") || !tempData2.equals("4") || !tempData2.equals("3") || !tempData2.equals("2") || !tempData2.equals("1") || !tempData2.equals("0")) {
                        
                        s2 = (s2.substring(0 , 2) + '0' + s2.substring(3));
                    }
                    break;
                case 4 :
                    if (!tempData4.equals("0") || !tempData4.equals("1") || !tempData4.equals("2") || !tempData4.equals("3") || !tempData4.equals("4") || !tempData4.equals("5") || !tempData4.equals("6")) {
                        
                        s2 = (s2.substring(0 , 4) + '0' + s2.substring(5));
                    }
                    else if (tempData4.equals("6")) {

                        s2 = (s2.substring(0 , 4) + '0' + s2.substring(5));
                    }
                    break;
                default : System.out.println(s2);

            }

        }

    }*/

}