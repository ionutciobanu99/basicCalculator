package calculator.operations;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    public static void main(String[] args) {

        int numberOfParameters = args.length;
        int firstNumber = Integer.parseInt(args[0]);
        String operationType = args[1];
        int secondNumber = Integer.parseInt(args[2]);
        int operationResult = 0;

        resultOfOperation(numberOfParameters,firstNumber, secondNumber, operationType, operationResult);
    }

    public static boolean checkIfNumberOfParametersIsCorrect(int numberOfParameters) {
        if (numberOfParameters == 3) {
        return true;
        }else{
            System.out.println("Number of parameters is wrong!");
            return false;
        }
    }

    public static boolean checkIfNumbersHaveCorrectFormat(int firstNumber, int secondNumber) {
        if (firstNumber > -2147483648 && firstNumber < 2147483647 &&
                secondNumber > -2147483648 && secondNumber < 2147483647) {
            return true;
        } else {
            System.out.println("One of the numbers doesn't have the correct format");
            return false;
        }
    }

    public static boolean checkIfOperatorHasCorrectFormat(String operationType) {
        if (List.of("+","-","*","/").contains(operationType)) {
            return true;
        } else {
            System.out.println("operationType must be one of the following: \n'+'\n'-'\n'*'\n'/'");
            return false;
        }
    }

    public static void resultOfOperation(int numberOfParameters, int firstNumber, int secondNumber, String operationType, int operationResult) {

        if ( checkIfNumberOfParametersIsCorrect(numberOfParameters) &&
                checkIfNumbersHaveCorrectFormat(firstNumber, secondNumber) &&
                checkIfOperatorHasCorrectFormat(operationType)) {

            switch (operationType) {
                case "+":
                    operationResult = firstNumber + secondNumber;
                    break;
                case "-":
                    operationResult = firstNumber - secondNumber;
                    break;
                case "*":
                    operationResult = firstNumber * secondNumber;
                    break;
                case "/":
                    operationResult = firstNumber / secondNumber;
                    break;
            }
            System.out.println("Result: " + operationResult);
        } else {
            System.out.println("Operation couldn't be executed");
        }
    }
}
