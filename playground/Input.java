import java.util.Scanner;

public class Input {
    public static void main() {
        System.out.println("-----------------------------");
        System.out.println("------------Name-------------");
        System.out.println("-----------------------------");

        String greeting = "Welcome, ";

        Scanner firstInput = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String firstName = firstInput.nextLine();

        Scanner secondInput = new Scanner(System.in);
        System.out.println("Enter second name: ");
        String secondName = secondInput.nextLine();

        System.out.println(greeting + firstName + " " + secondName + "!");

        System.out.println("-----------------------------");
        System.out.println("-------------Sum-------------");
        System.out.println("-----------------------------");

        Scanner aInput = new Scanner(System.in);
        System.out.println("Enter first value: ");
        Integer a = aInput.nextInt();

        Scanner bInput = new Scanner(System.in);
        System.out.println("Enter second value: ");
        Integer b = bInput.nextInt();

        System.out.println("a: " + a + " and b: " + b);
        System.out.println(a + " + " + b + " = " + (a + b));
    }
}
