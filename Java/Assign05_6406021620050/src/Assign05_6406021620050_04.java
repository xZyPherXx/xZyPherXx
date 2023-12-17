/* Id   :   64-060216-2005-0
 * Name :   Mr. Punnawat Pinsaeng
 * Room :   1 RA
 *  File Name : Assign05_6406021620050_04.java
 */
import javax.swing.*;
import java.lang.Math;

public class Assign05_6406021620050_04 {

    int student = -1 , tempTotal = 0 , tempScore;

    public static void main(String [] args) {

        Assign05_6406021620050_04 object = new Assign05_6406021620050_04();
        object.start();
    }

    public void start() {

        String data;

        do {

            data = JOptionPane.showInputDialog("Enter number students (0 - exit) : ");
            boolean checkData = false;

            if (data != null) {

                for (int index = 0 ; index < data.length() ; index++) {

                    if (Character.isDigit(data.charAt(index))) {

                        checkData = true;
                    }
                    else {

                        break;
                    }

                }

                if (checkData) {

                    student = Integer.parseInt(String.valueOf(data));

                    if (student > 0) {

                        if (student <= 20) {

                            JOptionPane.showMessageDialog(null , "Random and Summation already.");
                            processData();
                        }
                        else {

                            JOptionPane.showMessageDialog(null , "Number of students not correct.");
                        }

                    }

                }
                else {

                    JOptionPane.showMessageDialog(null , "Wrong Input!" , "Warning!" , JOptionPane.WARNING_MESSAGE);
                }

            }
            else {

                System.exit(0);
            }
        
        } while(student != 0);

        JOptionPane.showMessageDialog(null , "Exit Program...");
        System.exit(0);
    }

    public void processData() {

        int[][] students = new int[student][4];
        JTextArea display = new JTextArea();

        display.append("No.\tMidterm\tFinal                 Homework\tTotal\tGrade\n");
        display.append("====================================================================\n");

        for (int row = 0 ; row < student ; row++) {

            display.append("  " + (row + 1) + "\t");
            for (int col = 0 ; col < 4 ; col++) {

                if (col < 3) {

                    students[row][0] = getScore(0 , 31);
                    students[row][1] = getScore(0 , 41);
                    students[row][2] = getScore(0 , 31);
                    students[row][3] += students[row][col];
                    display.append(String.valueOf("  " + students[row][col] + "\t "));
                }
                else {

                    display.append(String.valueOf(tempTotal = students[row][col]));
                }

            }

            tempScore = students[row][0] + students[row][1];
            display.append("\t    " + getGrade(tempScore , tempTotal) + "\n");
        }

        toReport(display);
    }

    public int getScore(int minScore , int maxScore) {

        double rand = minScore + Math.random() * maxScore;
        return (int)rand;
    }

    public String getGrade(int dataScore , int dataTotal) {

        String grade = "";

        if (dataTotal > 79) {

            grade = "A";
        }
        else if (dataTotal > 69) {
    
            grade = "B";
        }
        else if (dataTotal > 59) {
    
            grade = "C";
        }
        else if (dataTotal > 49) {
    
            grade = "D";
        }
        else {

            grade = "F";
        }

        return grade;
    }

    public void toReport(JTextArea report) {

        JOptionPane.showMessageDialog(null , report);
    }

}