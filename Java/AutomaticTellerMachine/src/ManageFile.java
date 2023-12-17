
import java.io.*;
import java.util.Scanner;

public class ManageFile {

    private String[][] data;
    private String fileName = new String(""); 
    private String typeName = new String("md");
    private String folderPath = "data";
    private int indexData = 0;

    public ManageFile() {

    }

    public ManageFile(String name) {

        this.fileName = name;
        checkDirectory();
        createFile(); 
    }

    public ManageFile(String name, String type) { 

        this.fileName = name;
        this.typeName = type;
        checkDirectory();
        createFile(); 
    }

    public ManageFile(String name, String type , String path) { 

        this.fileName = name;
        this.typeName = type;
        this.folderPath = path;
        checkDirectory();
        createFile(); 
    }

    public void checkDirectory() {

        File folder = new File(folderPath);
        if (!folder.exists()) {
    
            folder.mkdir();
        }

    }

    public String[][] getData() {

        readFile();
        return this.data;
    }

    public void setSizeData(int row, int col) {

        this.data = new String[row][col];
        System.out.println("Array size data in file : " + row + " x " + col);
    }

    public void clearData() {

        for (int row = 0; row < this.data.length; row++) {

            for (int col = 0; col < this.data[row].length; col++) {
    
                this.data[row][col] = "";
            }

        }

    }

    public void clearFile() {

        File file = new File("./" + this.folderPath + "/" + this.fileName + "." + this.typeName);
        try {

            file.delete();
        }
        catch (Exception e) {

            System.out.println("File not found");
        }

    }

    public void pushDataToVariable(String[] val) {

        for (int index = 0; index < val.length; index++) {

            this.data[this.indexData][index] = val[index];
        }

        this.indexData++;
    }

    public String reportData() {

        try {

            String dataReport = "";
            File myObj = new File("./" + this.folderPath + "/"+ this.fileName + "." + this.typeName);
            Scanner myReaderForData = new Scanner(myObj);

            while (myReaderForData.hasNextLine()) {
    
                String data = myReaderForData.nextLine();
                dataReport += data + "\n";
            }
    
            myReaderForData.close();
            return dataReport;
        }
        catch (IOException exception) {

            return "";
        }

    }

    public void readFile() {

        try {

            if (this.data != null) {

                clearData();
            }

            File myObj = new File("./" + this.folderPath + "/"+ this.fileName + "." + this.typeName);
            Scanner myReaderForCount = new Scanner(myObj);
            Scanner myReaderForData = new Scanner(myObj);

            int unitRows = 0;
            int unitCols = 0;
            while (myReaderForCount.hasNextLine()) {

                String data = myReaderForCount.nextLine();
                unitRows++;
                unitCols = data.split(",").length;
                data = data.replaceAll("\\s+", "");
            }
            setSizeData(unitRows, unitCols);

            while (myReaderForData.hasNextLine()) {

                String data = myReaderForData.nextLine();
                data = data.replaceAll("\\s+", "");

                if (data.split(",").length > 0) {

                    pushDataToVariable(data.split(","));
                }

            }

            myReaderForCount.close();
            myReaderForData.close();
        
        } catch (FileNotFoundException e) {
            
            createFile();
            readFile();

        }

    }

    public void createFile() {

        try {

            File myObj = new File("./" + this.folderPath + "/" + this.fileName + "." + this.typeName);

            if (myObj.createNewFile()) {

                System.out.println("File created: " + myObj.getName());
            }
            else {

                System.out.println(this.fileName + " - File already exists.");
            }

        } catch (IOException ex) {
            
            ex.printStackTrace();
        }

    }

    public void writeDataByArr(String[] data) {
        
        String line = "";
        for (int i = 0; i < data.length; i++) {

            line += data[i] + ",";
        }

        line = line.substring(0, line.length() - 1);
        writeDataByStr(line);
    }

    public void writeDataByStr(String val) {

        try {

            File myObj = new File("./" + this.folderPath + "/" + this.fileName + "." + this.typeName);
            FileWriter myWriter = new FileWriter(myObj, true);
            BufferedWriter buffer = new BufferedWriter(myWriter);
            buffer.write(val);
            buffer.newLine();
            buffer.close();
            myWriter.close();
        }
        catch (IOException ex) {

            System.out.println("An error occurred.");
        }

    }

    public int lengthListFileInFolder(String folderName) {

        return new File("./" + folderName + "/").list().length;
    }

    public String listFileInFolder(String folderName , int index) {

        File folder = new File("./" + folderName + "/");
        File[] listOfFiles = folder.listFiles();

        if (listOfFiles[index].isFile()) {

            return listOfFiles[index].getName();
        }

        return "";
    }

    public void writeDataNewToFile(String[][] data) {

        clearFile();
        boolean checkLine = false;
        for (int r = 0; r < data.length; r++) {

            String line = "";
            for (int c = 0; c < data[r].length; c++) {

                if (!data[r][c].equals("")) {

                    line += data[r][c] + ",";   
                    checkLine = true;
                }
                else {

                    checkLine = false;
                    break;
                }

            }

            if (checkLine) {

                line = line.substring(0, line.length() - 1);
                writeDataByStr(line);
            }

        }

    } 

}