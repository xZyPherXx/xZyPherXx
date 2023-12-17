
import java.util.Scanner;

public class Assign02_1 {

    public double width , length , area , perimeter;

        public static void main(String [] args) {

            Assign02_1 object = new Assign02_1();

            Scanner scan = new Scanner(System.in);

            System.out.print("Enter Width Side : ");
            object.width = scan.nextDouble();
            object.setWidth(object.width);

            System.out.print("Enter Length Side : ");
            object.length = scan.nextDouble();
            object.setLength(object.length);

            object.setArea(object.width , object.length);
            System.out.println("Area of Rectangle : " + String.format("%.2f", object.getArea()));

            object.setPerimeter(object.width , object.length);
            System.out.println("Perimeter of Rectangle : " + String.format("%.2f", object.getPerimeter()));

            scan.close();
    }

    public void setWidth(double dataWidth) {

        width = dataWidth;
    }

    public void setLength(double dataLength) {

        length = dataLength;
    }

    public double getWidth() {

        return width;
    }

    public double getLength() {

        return length;
    }

    public void setArea(double dataWidth , double dataLength) {

        area = dataWidth * dataLength;
    }

    public double getArea() {

        return width * length;
    }

    public void setPerimeter(double dataWidth , double dataLength) {

        perimeter = 2 * (dataLength + dataLength);
    }

    public double getPerimeter() {

        return 2 * (width + length);
    }

}