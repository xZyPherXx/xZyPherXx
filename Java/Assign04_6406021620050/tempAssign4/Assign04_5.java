
import javax.swing.*;
import java.lang.Math;

public class Assign04_5 {

    int student , tempTotal = 0 , tempScore;

    public static void main(String [] args) {

        new Assign04_5();
    }

    public Assign04_5() {

        String data = JOptionPane.showInputDialog("Enter number student : ");
        boolean checkData = false;

        for (int index = 0 ; index < data.length() ; index++) {

            if (Character.isDigit(data.charAt(index))) {

                checkData = true;
            }

        }

        if (checkData && (data != null && !data.isBlank() && !data.isEmpty())) {

            student = Integer.parseInt(String.valueOf(data));
            if (student > 20) {

                student = 20;
            }

            display();
        }
        else {

            JOptionPane.showMessageDialog(null , "Wrong Input!" , "Warning!" , JOptionPane.WARNING_MESSAGE);
        }
        
    }

    public void display() {

        int[][] students = new int[student][4];
        JTextArea display = new JTextArea();

        display.append("No.\tMidterm\tFinal                 Homework\tTotal\tGrade\n");
        display.append("====================================================================\n");

        for (int row = 0 ; row < student ; row++) {

            display.append("  " + (row + 1) + "\t");
            for (int col = 0 ; col < 4 ; col++) {

                if (col < 3) {

                    students[row][0] = random(0 , 31);
                    students[row][1] = random(0 , 41);
                    students[row][2] = random(0 , 31);
                    students[row][3] += students[row][col];
                    display.append(String.valueOf("  " + students[row][col] + "\t "));
                }
                else {

                    display.append(String.valueOf(tempTotal = students[row][col]));
                }

            }

            tempScore = students[row][0] + students[row][1];
            display.append("\t    " + checkGrade(tempScore , tempTotal) + "\n");
        }

        JOptionPane.showMessageDialog(null , display);
    }

    public int random(int minScore , int maxScore) {

        double rand = minScore + Math.random() * maxScore;
        return (int)rand;
    }

    public String checkGrade(int dataScore , int dataTotal) {

        String grade = "";

        if (dataScore > 21) {

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

        }
        else {

            grade = "F";
        }

        return grade;
    }

}