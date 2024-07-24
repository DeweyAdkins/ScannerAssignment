package VaraibleInputs;
import java.util.Scanner;
public class Inputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string of text: ");
        String string = scanner.nextLine();
        System.out.print("Enter an integer: ");
        int integer = scanner.nextInt();
        System.out.print("Enter a double: ");
        double doubleValue = scanner.nextDouble();
        System.out.println("Enter a boolean: ");
        boolean booleanValue = scanner.nextBoolean();
        System.out.println("Your string is: " + string);
        System.out.println("Your integer is: " + integer);
        System.out.println("Your double is: " + doubleValue);
        System.out.println("Your boolean is: " + booleanValue);
    }
}
