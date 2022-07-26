import java.util.Scanner;

public class SimpleCalc {
    public static void main(String[] args) {

        System.out.println("Enter Two Numbers");

        Scanner sc = new Scanner(System.in);
        System.out.print("Num1: ");
        Float Num1 = sc.nextFloat();
        System.out.print("Num2: ");
        Float Num2 = sc.nextFloat();

        System.out.println("1] Addition of " + Num1 + " and " + Num2 + " is: " + (Num1 + Num2));
        System.out.println("2] Subtraction of " + Num1 + " and " + Num2 + " is: " + (Num1 - Num2));
        System.out.println("3] Multiplication of " + Num1 + " and " + Num2 + " is: " + (Num1 * Num2));
        System.out.println("4] Division of " + Num1 + " and " + Num2 + " is: " + (Num1 / Num2));

    }
}
