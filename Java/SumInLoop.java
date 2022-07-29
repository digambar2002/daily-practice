
// *Program 3*
// *Date: 29/07/2022*
import java.util.Scanner;

public class SumInLoop {
    public static void main(String[] args) {

        char ch;

        int num1, num2;
        Scanner sc = new Scanner(System.in);
        do {

            System.out.println("Enter Num1: ");
            num1 = sc.nextInt();
            System.out.println("Enter Num2: ");
            num2 = sc.nextInt();

            System.out.println("Addition of two numbers is: " + (num1 + num2));

            System.out.println("Press Y for continue Again OR Press any key to exit");
            ch = sc.next().charAt(0);

        } while (ch == 'y' || ch == 'Y');

    }
}
