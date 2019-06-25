import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        // Getting all the args from the user
        Double userFirstInput = 0.00;
        Double userThirdInput = 0.00;

        try {
            userFirstInput = Double.parseDouble(args[0]);
            userThirdInput = Double.parseDouble(args[2]);
        } catch (NumberFormatException invalidInput) {
            System.out.println("Invalid input! Please type a operation!");
            System.exit(1);
        }
        String operator = args[1];


        double firstNumber = userFirstInput;
        double secondNumber = userThirdInput;

        // Preventing the code to run if the user tries to make a division by zero, and checking if the operator is valid
        if (operator.equals("/") && secondNumber == 0 ) {
            System.out.println("Not possible to divide by 0!");
        }
        else if (!operator.equals("+") && !operator.equals("-") && !operator.equals("/") && !operator.equals("x")) {
            System.out.println("Invalid operator!");
        }

        else {

            // Assigning function result to a variable
            double calculationResult = calculate(firstNumber, operator, secondNumber);

            // Using DecimalFormat class to show two decimal houses if needed in our doubles
            DecimalFormat df2 = new DecimalFormat("#.##");

            // Printing the result
            System.out.println(df2.format(calculationResult));
        }


    }

    // Function that checks which operation the user wants to do
    private static Double calculate(double firstNum, String operator, double secondNum) {
        System.out.println("Welcome to the calculator!");

        double result = 0;

        if (operator.equals("+")) {
            result = firstNum + secondNum;
        }
        else if (operator.equals("-")) {
            result = firstNum - secondNum;
        }

        else if (operator.equals("/")) {

            result = firstNum / secondNum;

        }
        else if (operator.equals("x")) {
            result = firstNum * secondNum;
        }

        return result;

    }
}