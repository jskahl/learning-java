import java.util.Scanner;

public class Calculator {
    // Text input method
    static String inputString(String caption) {
        Scanner input = new Scanner(System.in);
        System.out.println(caption);

        return input.nextLine();
    };

    // Number input method
    static int inputInt(String caption) {
        Scanner input = new Scanner(System.in);
        System.out.println(caption);

        return input.nextInt();
    };

    public static void main(String[] args) {
        // Get math operations
        String operation = inputString("Select operation (+, -, * or /): ");

        // Get first value
        Integer firstValue = inputInt("Enter first value: ");

        // Get second value
        Integer secondValue = inputInt("Enter second value: ");

        // Checks if firstValue will be divided by 0
        if (operation.equals("/") && secondValue == 0) {
            System.out.println("A number can't be divided by zero (0).");
            return;
        }
        ;

        // Execute operations
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
    };

}
