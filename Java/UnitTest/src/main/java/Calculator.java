
public class Calculator {

    public int operation(String operator, int num1, int num2) {

        if (num1 < 0 || num2 < 0)
            throw new IllegalArgumentException("Number cannot use Unsigned to Unit-Test!");

        switch (operator) {

            case "+":
            case "add":
                return add(num1, num2);

            case "-":
            case "subtract":
                return subtraction(num1, num2);

            case "*":
            case "x":
            case "multiply":
                return multiply(num1, num2);

            case "/":
            case "division":
                return devision(num1, num2);

            default:
                throw new IllegalArgumentException("Operator cannot use to Unit-Test!");
        }

    }

    private int add(int num1, int num2) {

        return num1 + num2;
    }

    private int subtraction(int num1, int num2) {

        return num1 - num2;
    }

    private int multiply(int num1, int num2) {

        return num1 * num2;
    }

    private int devision(int num1, int num2) {

        return num1 / num2;
    }

}