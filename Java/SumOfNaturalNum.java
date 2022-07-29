import java.util.Scanner;

public class SumOfNaturalNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the last Number to calculate sum of numbers: ");

        int num = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= num; i++) {

            sum = sum + i;

        }

        System.out.println("Sum upto " + num + " is: " + sum);

    }
}
