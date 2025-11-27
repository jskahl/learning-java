import java.util.Scanner;

class Calculator {
    public static void main() {
        // Get math operations
        Scanner operationInput = new Scanner(System.in);
        System.out.println("Select operation (+, -, * and /): ");
        String operation = operationInput.nextLine();

        // Get first value
        Scanner firstValueInput = new Scanner(System.in);
        System.out.println("Enter first value: ");
        Integer firstValue = firstValueInput.nextInt();

        // Get second value
        Scanner secondValueInput = new Scanner(System.in);
        System.out.println("Enter second value: ");
        Integer secondValue = secondValueInput.nextInt();

        // Operations

        // if statement
        //if (operation.equals("+")) {
        //   System.out.println(firstValue + " + " + secondValue + " = " + (firstValue + secondValue));
        //}

        //if (operation.equals("-")) {
        //   System.out.println(firstValue + " - " + secondValue + " = " + (firstValue - secondValue));
        //}

        //if (operation.equals("*")) {
        //   System.out.println(firstValue + " * " + secondValue + " = " + (firstValue * secondValue));
        //}

        //if (operation.equals("/")) {
        //   System.out.println(firstValue + " / " + secondValue + " = " + (firstValue / secondValue));
        //}

        // switch case
        switch (operation) {
            case "+":
                System.out.println(firstValue + " + " + secondValue + " = " + (firstValue + secondValue));  
                break;
            case "-":
                System.out.println(firstValue + " - " + secondValue + " = " + (firstValue - secondValue));
                break;
            case "*":
                System.out.println(firstValue + " * " + secondValue + " = " + (firstValue * secondValue));
                break;
            case "/":
                System.out.println(firstValue + " / " + secondValue + " = " + (firstValue / secondValue));
                break;
            default:
                System.out.println("Something went wrong.");
                break;
        }
    }
}
